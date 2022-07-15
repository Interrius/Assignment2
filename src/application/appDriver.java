package application;

import java.util.ArrayList;
import java.util.List;

import exceptions.LinkedListFullException;
import util.MyQueue;

public class appDriver
{
	
	public static void main(String[] args) throws NullPointerException, LinkedListFullException {
		
		MyQueue<String> q = new MyQueue<String>();
		
		q.enqueque("Ramon");
		
		System.out.println(q.peek());
		
		
	}

}
