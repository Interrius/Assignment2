package util;

import exceptions.EmptyQueueException;
import exceptions.LinkedListFullException;
import interfaces.Iterator;
import interfaces.QueueADT;

public class MyQueue<E> implements QueueADT<E>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyDLL queue;

	public MyQueue()
	{
	}

	public MyQueue(int size)
	{
		queue = new MyDLL(size);
	}

	@Override
	public int size()
	{
		return queue.size();
	}

	@Override
	public void enqueque(E element) throws NullPointerException, LinkedListFullException
	{
		if (element==null)
		{
			throw new NullPointerException();
		} else
		{
			queue.append(element);
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public E dequeue() throws EmptyQueueException
	{
		if (queue.size() == 0)
		{
			throw new EmptyQueueException();
		}

		E first = (E) queue.getHead().getElement();
		queue.delete(0);
		return first;

	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek()
	{
		return (E) queue.getHead().getElement();
	}

	@Override
	public void dequeueAll()
	{
		queue.clear();
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean equals(QueueADT<E> that) throws NullPointerException
	{
		boolean isEqual = true;
		if (queue != null)
		{
			if (queue.size() == that.size())
			{
				for (int i = 0; i < queue.size(); i++)
				{
					if (!(queue.equals(that)))
					{
						isEqual = false;
						break;
					}
				}
			}
		} else
		{
			isEqual = false;
		}
		return isEqual;
	}

	@Override
	public Iterator<E> iterator()
	{
		MyIterator<E> i = new MyIterator<>(queue);
		return i;
	}

	@Override
	public Object[] toArray()
	{
		Object[] queueArray = new Object[queue.size()];

		for (int i = 0; i < queue.size(); i++)
		{
			queueArray[i] = queue.retrieve(i);
		}
		return queueArray;
	}

	@Override
	public E[] toArray(E[] toHold) throws NullPointerException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFull()
	{
		return queue.isFull();
	}

	@Override
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}

}
