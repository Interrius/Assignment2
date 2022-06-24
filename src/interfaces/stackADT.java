package StackADT;

import java.util.Iterator;

import exception.EmptyStackException;

public interface stackADT<E> {
	
	/**
	 * Description: push method assists in the pushing the object at the top of the current stack 
	 * Precondition: A valid stack object is there and that object is passed
	 * Postcondition: The object which is created it has been added at the top of current stack
	 * @param E element that needs to be instered
	 */
	public void push(E element);
	/**
	 * Descritpion: a pop method helps in removing and returing the object from the top postion of the current stack
	 * PreCondtion: A valid stack object exists
	 * PostCondtion: Object is removed from the top of the current stack
	 * @throws EmptyStackException is thrown if the stack is empty by chance
	 */
	public E pop() throws EmptyStackException;
	/**
	 * Descritpion: a peek method helps in returning topmost object from the current stack
	 * PreCondtion: A valid stack object exists
	 * Post Condtion: the topmost object is returned without being removed
	 * @return object at the top of the stack
	 * @throws EmptyStackException is done if the stack is empty by any chance
	 */
	public E peek() throws EmptyStackException;
	/**
	 * Description :size method assists in returing the total number of items on the current stack
	 * Pre Condition: a valid stack object exists
	 * Post conditon: it returns the total number of items on the stack
	 * @return the number of the items on the stack
	 */
	public int size();
	/**
	 * Descitpion: isEmpty method helps in checking if stack contains any data or not
	 * PreCondtion: A valid stack object exists
	 * Post Condtion: if it is empty then retuns true otherwise returns false
	 * @return true if the current stack is Empty
	 */
	public boolean isEmpty();
	/**
	 * toString method it has been created so we can display the stack items
	 * @return String of an the stack
	 */
	public String toString();
	/**
	 * Description: This method helps in returing the index of an item from the stack
	 * Beginning from the topmost item considering at index 1
	 * Pre Condtion: A valid stack object exists and item is passed
	 * Post Condtion: search returns the index of an item on the current stack
	 * @param an item to be searched
	 * @return the index of an item on the current stack
	 */
	
	public int search(E Object);
	
	/**
	 * Descirption:clear method helps in getting rid of the current stack
	 * PreCondtion: A valid stack object exists
	 * Postcondtion: Current stack is clear with no data
	 * @return whether the stack is cleared or not
	 */
	public boolean clear();
	
	/**
	 * Descritpion: contains method to verify if an item exists on the stack or not
	 * PreCondtion: A valid stack object exists and item has been passed
	 * Post Condtion: returns true if an item exits on the stack else it will return false
	 * @return True if the item exists on the stack else it will be returing false
	 */
	
	public boolean contains(E Object);
	/**
	 * Description : equals method to verify if two stacks has exactly same items
	 * PreCondtion: A valid stack object exists and stack has been passed
	 * Post Condtion:Equals returns true if both the stacks has same items else equals return false
	 *@param the stack that needs to be matched
	 * @return  true if both stack has same items in it
	 */
	public boolean equals(stackADT<E> that);
	/**
	 * Descritpiton: Returns the array containing all of the elements in the current stack has to be stored
	 * PreCondition: A valid stack object exists.
	 * PostCondition:Returns an array containing all of the elements of the current stack
	 * @return array having all the items or elements in the current stack
	 */
	public Object[] toArray();
	/**
	 * Description: toarray method returns an array containing all the items in this list in the same chronological order
	 * PreCondtion: A valid stack object exists and an array has been passed
	 * Post Condtion:toArray returns an array containing all of the items in this list in the same sequence
	 * @return array containing all of the items in this list in the same sequence
	 * 
	 */
	
    public E[] toArray(E[] copy);
    /**
     *  Descritpion: returns an iterator
     *  PreCondtion: A valid stack object exists
     *  PostCondtion: It returns an iterator
     *  @return iterator
     * 
     */
    
    public Iterator<E> iterator();

}
