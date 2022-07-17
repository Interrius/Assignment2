package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import interfaces.MyStack;

public class xmlparser {
	
	private boolean root = false;
	private File inputFile;
	private int lineCount = 0;
	private String line;
	String Type = "";
	String tag = "";
	String currentTag = "";

	//DataStrcrues
	MyStack stack = new MyStack(30);
	
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
	
}
