package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exceptions.LinkedListFullException;
import interfaces.Iterator;
import util.MyDLL;

class MyDLLTests {

	//attributes
	MyDLL<String> list;
	Iterator <String> iterator;
	
	@BeforeEach
	void setUp() throws Exception {
		list = new MyDLL<>();

	}
	
	/*
	 * if list is not empty
	 */
	@Test
	void testSizeNonEmpty() throws LinkedListFullException {
		list.prepend("A");
		list.prepend("B");
		assertEquals(2, list.size());
	}
	
	/*
	 * 
	 * if list is empty
	 */
	@Test
	void testSizeEmpty() {
		assertEquals(0, list.size());
	}
	
	/*
	 * 
	 * if list is not empty
	 */
	@Test
	void testClearNonEmpty() throws LinkedListFullException {
		list.prepend("A");
		list.clear();
		assertEquals(0, list.size());
	}
	
	/*
	 * test for {@link ulitities.MyDLL#clear}
	 * if list is not empty
	 */
	@Test
	void testClearEmpty() {
		list.clear();
		assertEquals(0, list.size());
	}
	

	/**
	 * 
	 * if list is not empty 
	 * prepended at the beginning
	 */
	@Test
	void testprependIntE_NotEmpty_Beginning() {
		list.prepend("A");
		assertTrue(list.prepend(0, "B"));
		assertEquals(2, list.size());
		assertEquals("B", list.getHead().getElement());
		assertEquals("A", list.getTail().getElement());
		assertEquals("B", list.retrieve(0));
		assertEquals("A", list.retrieve(1));
	}
	
	
	/**
	 * 
	 * when list is empty, NullPointerException
	 * @throws NullPointerException 
	 * @throws LinkedListFullException 
	 */
	@Test
	void testprependE_Empty_NullPointerException() throws NullPointerException, LinkedListFullException  {
		try {
			list.prepend(null);
			fail("NullPointerException wasn't thrown.");
		} catch(NullPointerException e) {
			assertTrue(true);
		}
	}
	




	/**
	 * 
	 * when list is empty
	 */
	@Test
	@SuppressWarnings("unused")
	void testGet_Empty() {
		try {
			Object element = list.retrieve(-1);
			fail("IndexOutOfBoundsException wasn't thrown.");
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
		
		try {
			Object element = list.retrieve(0);
			fail("IndexOutOfBoundsException wasn't thrown.");
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
		
		try {
			Object element = list.retrieve(1);
			fail("IndexOutOfBoundsException wasn't thrown.");
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	



	
	/**
	 * Test method for {@link utility.DLL#isEmpty()}.
	 * when list is empty
	 */
	@Test
	void testIsEmpty() {
		assertEquals(true, list.isEmpty());
	}

	/**
	 * 
	 * when list is not empty
	 * @throws LinkedListFullException 
	 */
	@Test
	void testNotEmpty() throws LinkedListFullException {
		list.prepend("A");
		assertEquals(false, list.isEmpty());
	}
	
	/**
	 * 
	 * when list is not null, and toFind element is not null
	 * @throws LinkedListFullException 
	 */
	@Test
	void testContains_NotNull_NotNull() throws LinkedListFullException {
		list.prepend("A");
		list.prepend("B");
		assertEquals(true, list.contains("A"));
		assertEquals(false, list.contains("C"));
	}

	/**
	 * 
	 * when list is not null, and toFind element is null
	 * @throws LinkedListFullException 
	 */
	@Test
	@SuppressWarnings("unused")
	void testContains_NotNull_Null() throws LinkedListFullException {
		list.prepend("A");
		list.prepend("B");

		try {
			boolean found = list.contains(null);
			fail("NullPointerException wasn't thrown.");
		} catch (NullPointerException e) {
			assertTrue(true);
		}
	}
	
	/**
	 * 
	 * when list is empty
	 */
	@Test
	@SuppressWarnings("unused")
	void testContains_Empty() {
		try {
			boolean found = list.contains("A");
			fail("NullPointerException wasn't thrown.");
		} catch (NullPointerException e) {
			assertTrue(true);
		}
		
		try {
			boolean found = list.contains(null);
			fail("NullPointerException wasn't thrown.");
		} catch (NullPointerException e) {
			assertTrue(true);
		}
	}
	


	
	

}