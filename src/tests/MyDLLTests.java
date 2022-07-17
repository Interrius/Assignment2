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
	 * when list is empty, NullPointerException
	 * @throws NullPointerException 
	 * @throws LinkedListFullException 
	 */
	@Test
	void testprependE() throws NullPointerException, LinkedListFullException  {
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
	 * 
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
	

	
	}