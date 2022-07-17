package application;

import java.util.ArrayList;
import java.util.List;

import exceptions.EmptyQueueException;
import exceptions.LinkedListFullException;
import interfaces.MyQueue;
import util.MyDLL;

public class appDriver
{
	
	public static void main(String[] args) throws NullPointerException, LinkedListFullException, EmptyQueueException {
		
	
		
			MyQueue<String> d =new MyQueue<String>();
			
			d.enqueque("asdf");
			d.enqueque("asdfasfda");
			d.enqueque("asd");
			d.enqueque("asdfda");
			d.dequeue();
			
			System.out.println(d.peek());
	
			
			
		
	}

}
