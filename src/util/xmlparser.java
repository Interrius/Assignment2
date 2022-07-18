package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class xmlparser {
	
	private boolean root = false;
	private File inputFile;
	private int lineCount = 0;
	private String line;
	String Type = "";
	String tag = "";
	String currentTag = "";
	MyStack stack = new MyStack();
	MyQueue<String> errorQueue = null;
	
	public xmlparser(){
		errorQueue = new MyQueue<String>();
	}


	
	public void Parser(File inputFile) 
    {
    
        this.lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
             this.line = br.readLine();
       
             do {
                lineCount++;

                if(lineCount == 2){
                	root = true;
                	tag = line;
                    if(tag.contains(" ")){
                    	tag= tag.substring(0, tag.indexOf(" "));
                    }
                }
                
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
        System.out.println("Cant find the pairs!");
        System.out.println(stack);
    }
	
	private void processStartTagMultipleLines(String line) {
		String token = line.substring(line.indexOf('<') + 1, line.indexOf('>'));
		
		if(token.indexOf(' ') > -1) {
			token = token.substring(0, token.indexOf(' '));
		}
		
		stack.push(token);
		
	}
	
	
}
