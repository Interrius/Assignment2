/**
 * 
 */
package interfaces;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MyStackTests {
	
	private MyStack<Object> stack;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		 stack = new MyStack();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		stack = null;
	}



	@Test
	public void testPop() {
		stack.push(10);//element at bottom
		stack.push(20);
		stack.push(30); //element at top
		
		int poppedElement = (int) stack.pop();
		
		assertEquals(2, stack.size());
		assertEquals(20, stack.peek());
		assertEquals(30, poppedElement);
	}
	
	
	@Test
	public void testClear() {
		stack.push(10); // Element at bottom
		stack.push(20);
		stack.push(30); // Element at top
		
		assertEquals(3, stack.size()); // ensures stack had 3 elements
		assertEquals(30, stack.peek()); // ensures stack had 3 elements
		stack.clear();
		
		assertEquals(0, stack.size()); // ensures stack is now empty
	}
	
	@Test
	public void testEmptyTrue() {
		stack.push(10); // Element at the bottom
		stack.push(20);
		stack.push(30); // Element at the top
		
		assertEquals(3, stack.size()); //ensures stack had 3 elements
		
		// Removes all elements; doesn't rely on clear() method.
		stack.pop();
		stack.pop();
		stack.pop();
		
		assertEquals(0, stack.size()); //ensures stack is empty after every element is popped.
		assertTrue(stack.isEmpty());
		
	}
	
	@Test
	public void testEmptyFalse() {
		stack.push(10); // Element at the bottom
		stack.push(20);
		stack.push(30); // Element at the top
		
		assertEquals(3, stack.size()); //ensures stack has 3 elements
		
		assertFalse(stack.isEmpty()); 
	}
	

	
	
	
	@Test
	public void testContainsFalse() {
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		assertFalse(stack.contains(40));
		assertEquals(-1, stack.search(80));
	}
	
	/*@Test
	public void testContainsException() {
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		assertFalse(stack.contains(null));
		assertEquals(-1, stack.search(null));
	}*/
	
	
	@Test
	public void testSearchNotEquals() {
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		assertFalse(stack.contains(50));
		assertEquals(-1, stack.search(90));
	}
	
	@Test
	public void testIterator() {
		Iterator stackIterator = stack.iterator();
		
		assertNotNull(stackIterator); //ensures the iterator has an assigned object
	}
	

	
	@Test
	public void testSize() {
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		assertEquals(3, stack.size());
	}

}
