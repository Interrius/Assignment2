package util;

public class MyDLLNode {
	
	private Object element;
	private MyDLLNode next;
	private MyDLLNode previous;

	/**
	 * @param element
	 */
	public MyDLLNode(Object element)
	{
		this.element = element;
	}
	
	/**
	 * @param element
	 * @param next
	 */
	public MyDLLNode(Object element, MyDLLNode next, MyDLLNode previous)
	{
		this.element = element;
		this.next = next;
		this.previous = previous;
	}

	/**
	 * @return
	 */
	public Object getElement()
	{
		return element;
	}

	/**
	 * @param element
	 */
	public void setElement(Object element)
	{
		this.element = element;
	}

	/**
	 * @return
	 */
	public MyDLLNode getNext()
	{
		return next;
	}
	
	public MyDLLNode getPrevious() {
		return previous;
	}

	/**
	 * @param next
	 */
	public void setNext(MyDLLNode next)
	{
		this.next = next;
	}
	
	public void setPrevious(MyDLLNode previous) {
		this.previous = previous;
	}
	 
}
