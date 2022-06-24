package interfaces;

import utilities.Iterator;


/**
 * <p>
 * The <code>QueueADT</code> interface
 * </p>
 * 
 * @author Ramon & Martin
 *
 * @param <E> The type of element this collection stores.
 */
public interface QueueADT<E>
{
	
	/**
	 * The method will return the total number of elements 
	 * stored in this collection. 
	 *  
	 * @return The current element count. 
	 */
	public int size();
	
	/**
	 * Inserts an element to the tail of the collection. If the 
	 * collection has no element held; element will also be the head.
	 * 
	 * Pre-condition: The element must have the same type as 
	 * the elements held in the collection.
	 * 
	 * Post-condition: A value of <code>true</code> will be 
	 * returned if the item was successfully added the the 
	 * collection.
	 * A NullPointerException will be thrown if the value 
	 * to be added is <code>null</code>.
	 * 
	 * @param e The element to be inserted
	 * @return <code>true</code> if the operation is successfull
	 * @throws NullPointerException if the element is <code>null</null>
	 */
	public boolean add(E e) throws NullPointerException;
	
	/**
	 * Remove the element that is positioned at 
	 * the head of the collection.
	 */
	public void remove();
	
	/**
	 * Returns the first element within the 
	 * collection without removing it.
	 * 
	 * @return the first element found on the collection.
	 */
	public E peek();
	
	
	/**
	 * All the items in collection will be removed.
	 * The collection will be empty after this call returns.
	 *  
	 */
	public void clear();
	
	
	/**
	 * Compares if <code>this</code> collection held the 
	 * same elements as <code>that</code> collection.
	 *  
	 * Pre-condition: The collection to be compared must not be null.
	 * Post-condition: Return <code>true</code> if the collections have the same elements.
	 *  
	 * @param that The collection to be compared.
	 * @return <code>true</code> if the elements of both Queue are equal.
	 * @throws NullPointerException if the <code>that</code> is <code>null</code>. 
	 * 
	 */
	public boolean equals(QueueADT<E> that) throws NullPointerException;
	
	/**
	 * Returns an iterator over the elements in the Queue. 
	collection	 * @return An <code>utilities.Iterator</code> over the collection.
	 */
	public Iterator<E> iterator();
	
	
	/**
	 * Returns an array of elements of the collection.
	 * 
	 * @return An <code>java.lang.Object</code> containing the elements on the collection.
	 */
	public Object[] toArray();
	
	
	/**
	 * Returns an array of elements of the collection.
	 * Type of array to return will be determined by the runtime type
	 * on this collection.
	 * 
	 * Pre-condition: The collection must have an element.
	 * 
	 * @param to hold the array that will contain all of the 
	 * elements on this collection.
	 * @return An array that contains the elements of the collection.
	 * @throws NullPointerException if the collection is <code>null</code>.
	 */
	public E[] toArray(E[] toHold) throws NullPointerException;

	/**
	 * Returns <code>true</code> if the <code>size</code> reached 
	 * the maximum number of elements specified.
	 * @return <code>true</code> if the <code>size</code> reached 
	 * the maximum number of elements specified.
	 * 
	 */
	public boolean isFull();
	
	
	/**
	 * Returns <code>true</code> if the Queque contain no element.
	 * @return <code>true</code> if the Queque contain no element.
	 * 
	 */
	public boolean isEmpty();
	
	
	
}
