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


	@Before
	public void setUp() throws Exception {
		 stack = new MyStack();
	}


	@After
	public void tearDown() throws Exception {
		stack = null;
	}
	
	@Test
	public void testPush() {
		stack.push("Muffin");
		stack.push("Ramon");
		stack.push("Dhruval"); 
		stack.push("Majd"); 
		assertEquals(4, stack.size());
	}
	


	@Test
	public void testPop() {
		stack.push("Muffin");
		stack.push("Ramon");
		stack.push("Dhruval"); 
		stack.push("Majd"); 
		int poppedElement = (int) stack.pop();
		assertEquals(3, stack.size());
		assertEquals("Majd", poppedElement);
	}
	
	
	@Test
	public void testClear() {
		stack.push("Muffin");
		stack.push("Ramon");
		stack.push("Dhruval"); 
		stack.push("Majd"); 
	
		assertEquals(4, stack.size()); 
		stack.clear();
		
		assertEquals(0, stack.size()); 
	}
	
	@Test
	public void testIsEmpty() {
		stack.push("Muffin");
		stack.push("Ramon");
		stack.push("Dhruval"); 
		stack.push("Majd"); 
		
		assertEquals(4, stack.size()); 
		
	
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		assertEquals(0, stack.size()); 
		assertTrue(stack.isEmpty());
		
	}
	
	@Test
	public void testNotEmpty() {
		stack.push("Muffin");
		stack.push("Ramon");
		stack.push("Dhruval"); 
		stack.push("Majd"); 
		
		assertEquals(4, stack.size()); 
		assertFalse(stack.isEmpty()); 
	}
	

	
	
	
	@Test
	public void testNotContained() {
		
		stack.push("Muffin");
		stack.push("Ramon");
		stack.push("Dhruval"); 
		stack.push("Majd"); 
		
		assertFalse(stack.contains("Ramon2"));
		assertEquals(-1, stack.search("Popcorn"));
	}
	

	
	
	@Test
	public void testSearchNotEquals() {
		stack.push("Muffin");
		stack.push("Ramon");
		stack.push("Dhruval"); 
		stack.push("Majd"); 
		
		assertFalse(stack.contains(50));
		assertEquals(-1, stack.search(90));
	}
	
	@Test
	public void testIterator() {
		Iterator stackIterator = stack.iterator();
		
		assertNotNull(stackIterator); 
	}
	

	
	@Test
	public void testSize() {
		stack.push("Muffin");
		stack.push("Ramon");
		stack.push("Dhruval"); 
		stack.push("Majd"); 
		
		assertEquals(4, stack.size());
	}

}
