package application;

import java.util.ArrayList;
import java.util.List;

import exceptions.EmptyQueueException;
import exceptions.LinkedListFullException;
import util.MyDLL;
import util.MyQueue;

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
