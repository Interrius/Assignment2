package util;

import java.io.File;

public class xmlparser {
	
	private boolean root = false;
	private File inputFile;
	private int lineCount = 0;
	private String line;
	String tagType = "";
	String rootTag = "";
	String currentTag = "";
	private int indexOfOpening = 0;
	private int indexOfClosing = 0;
	private int indexOfEndslash = 0;
	//DataStrcrues
	MyStack stack = new MyStack(30);
	
	public Parser(File inputF) 
    {
        this.inputFile = inputF;
        this.lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
             this.line = br.readLine();
             //Header is printed
             errorLogHeader();
             do {
                lineCount++;
                //
                //Checks if line is a tag and re-writes tagType var.
                isTag(this.line);
                //Absorb Root Tag
                if(lineCount == 2){
                	root = true;
                	rootTag = line;
                    if(rootTag.contains(" ")){
                    	rootTag= rootTag.substring(0, rootTag.indexOf(" "));
                    }
                }
                
                //Our Checker
                checker();
                
                this.line = br.readLine();
                
                }
             while (line != null);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //Print Remaining Stack.
        System.out.println("Pairs not found, else blank means no errors found!");
        System.out.println(stack);
    }
	
}
