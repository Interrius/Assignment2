package util;

import java.util.NoSuchElementException;

import interfaces.Iterator;

public class MyIterator<E> implements Iterator<E>
{

	private MyDLL linkedList;
	private MyDLLNode current;

	public MyIterator(MyDLL linkedList) throws NullPointerException
	{
		if (linkedList != null)
		{
			this.linkedList = linkedList;
		} else
		{
			throw new NullPointerException();
		}

	}

	@Override
	public boolean hasNext()
	{		
		if (current == null)
		{
			return linkedList.getHead() != null;
		}		
		return current.getNext() != null;		
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next() throws NoSuchElementException
	{
		if (!hasNext())
		{
			throw new NoSuchElementException();
		}

		if (current == null)
		{
			current = this.linkedList.getHead();
		} else
		{
			current = this.current.getNext();
		}

		return (E) current.getElement();
	}

}
