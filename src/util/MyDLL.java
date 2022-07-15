package util;

import exceptions.LinkedListFullException;

public class MyDLL
{
	private MyDLLNode head;
	private MyDLLNode tail;
	private int size;
	private int capacity;
	private boolean hasLimit;

	public MyDLL(int size)
	{
		this.setCapacity(size);
		hasLimit=size>0;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity()
	{
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	/**
	 * Returns a bolean value FALSE if the list object has no value, TRUE if not.
	 */
	public boolean isEmpty()
	{
		return head == null;
	}

	/**
	 * Removes all the stored data on list.
	 */
	public void clear()
	{
		// TODO Auto-generated method stub
		head = tail = null;
		size = 0;
	}

	public void append(Object data) throws LinkedListFullException
	{
		// TODO Auto-generated method stub

		MyDLLNode newNode = new MyDLLNode(data);

		if (this.size <= this.capacity)
		{
			if (this.isEmpty())
			{
				head = tail = newNode;
			} else
			{
				newNode.setPrevious(tail);
				tail.setNext(newNode);
				tail = newNode;
			}

			size++;
		} else
		{
			throw new LinkedListFullException();
		}
	}

	/**
	 * Add a new object at the beginning of the list.
	 * 
	 * @throws LinkedListFullException
	 */
	public void prepend(Object data) throws LinkedListFullException
	{

		if (size <= capacity)
		{
			if (this.isEmpty())
			{
				this.append(data);
			} else
			{
				MyDLLNode newNode = new MyDLLNode(data);
				newNode.setNext(head);
				head = newNode;
				size++;
			}
		} else
		{
			throw new LinkedListFullException();
		}
	}

	/**
	 * Insert an object at any available index of the list.
	 * 
	 * @throws LinkedListFullException
	 */
	public void insert(Object data, int index) throws IndexOutOfBoundsException, LinkedListFullException
	{
		// TODO Auto-generated method stub
		if (index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException();
		} else
		{
			if (index == 0)
			{
				this.prepend(data);
			} else if (index == this.size - 1)
			{
				this.append(data);
			} else
			{
				MyDLLNode newNode = new MyDLLNode(data);
				MyDLLNode selectedNode = head;
				for (int i = 0; i < index - 1; i++)
				{
					selectedNode = selectedNode.getNext();
				}
				newNode.setNext(selectedNode.getNext());
				selectedNode.setNext(newNode);
				this.size++;
			}
		}

	}

	/**
	 * Removes an existing object on the list and used the space to store a new
	 * object.
	 */
	public void replace(Object data, int index) throws IndexOutOfBoundsException
	{
		// TODO Auto-generated method stub
		if (index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException();
		} else
		{
			MyDLLNode current = head;
			for (int i = 0; i < index; i++)
			{
				current = current.getNext();
			}

			current.setElement(data);
		}
	}

	/**
	 * Returns the number of values stored on the list.
	 */
	public int size()
	{
		// TODO Auto-generated method stub
		return this.size;
	}

	/**
	 * @return the head
	 */
	public MyDLLNode getHead()
	{
		return head;
	}

	/**
	 * @return the tail
	 */
	public MyDLLNode getTail()
	{
		return tail;
	}

	/**
	 * Removes any existing object on list by providing its index.
	 */
	public void delete(int index) throws IndexOutOfBoundsException
	{
		// TODO Auto-generated method stub
		if (index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException();
		} else if (index == 0)
		{
			this.head = this.head.getNext();
		} else
		{
			MyDLLNode previous = head;
			int i = 0;
			while (i < index--)
			{
				i++;
				previous = previous.getNext();
			}
			previous.setNext(previous.getNext().getNext());

		}
		--this.size;
	}

	/**
	 * Load a specific object with the list, by providing its index.
	 */
	public Object retrieve(int index) throws IndexOutOfBoundsException
	{
		// TODO Auto-generated method stub
		if (index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException();
		} else if (index == this.size - 1)
		{
			return this.tail.getElement();
		} else
		{
			MyDLLNode current = head;
			int i = 0;
			while (i < index)
			{
				current = current.getNext();
				i++;
			}
			return current.getElement();
		}
	}

	/**
	 * Returns an integer value for an objects position on the list.
	 */
	public int indexOf(Object data)
	{
		// TODO Auto-generated method stub
		if (data == null)
		{
			throw new NullPointerException();
		} else if (this.size < 1)
		{
			return -1;
		} else
		{
			MyDLLNode current = head;

			int i = 0;
			while (i < this.size)
			{
				System.out.println(data);
				System.out.println(current.getElement());
				if (data == current.getElement())
				{
					return i;
				}
				current = current.getNext();
				i++;
			}
		}
		return -1;
	}

	/**
	 * Checks if a specific object is stored within the list. Returns a bollean
	 * value of True if verified. *
	 */
	public boolean contains(Object data)
	{

		if (data == null)
		{
			throw new NullPointerException();
		} else
		{
			MyDLLNode current = head;

			int i = 0;
			while (i < this.size)
			{
				System.out.println(data);
				System.out.println(current.getElement());
				if (data == current.getElement())
				{
					return true;
				}
				current = current.getNext();
				i++;
			}
		}
		return false;
	}

	public boolean isFull()
	{
		return size == capacity;
	}

}
