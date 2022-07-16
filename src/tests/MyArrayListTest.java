package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interfaces.MyArrayList;

/**
 * class MyArrayLisTest - this class have creation of the ArrayList. method
 * 
 * @author Dhruval
 * @version 13 July 2022
 */
class MyArrayListTest {
	private MyArrayList<String> myArrayList;

	@BeforeEach
	void setUp() throws Exception {
		myArrayList = new MyArrayList<String>();
	}

	@AfterEach
	void tearDown() throws Exception {
		myArrayList.clear();
	}

	/**
	 * Replacing an element at index
	 */
	@Test
	public void testReplace() {
		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");
		this.myArrayList.add("Ramon");

		try {
			assertEquals("Ramon", myArrayList.set(2, "Ngo"));
			assertFalse(this.myArrayList.isEmpty());

			assertEquals(3, myArrayList.size());

			assertEquals("Dhruval", myArrayList.get(0));
			assertEquals("Majd", myArrayList.get(1));
			assertEquals("Ngo", myArrayList.get(2));

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("3" + e.getMessage());
		}
	}

	/**
	 * Adding an element at index - pass
	 */
	@Test
	public void testAdd() {
		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");
		this.myArrayList.add("Ramon");

		try {

			this.myArrayList.add(2, "Ngo");
			assertFalse(this.myArrayList.isEmpty());
			assertEquals(4, myArrayList.size());
			assertEquals("Dhruval", myArrayList.get(0));
			assertEquals("Majd", myArrayList.get(1));
			assertEquals("Ngo", myArrayList.get(2));
			assertEquals("Ramon", myArrayList.get(3));

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("2" + e.getMessage());
		}
	}

	/**
	 * Adding an element at the end of the list.
	 */
	@Test
	public void testAppend() {
		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");
		this.myArrayList.add("Ramon");

		try {
			assertFalse(this.myArrayList.isEmpty());
			assertEquals(3, myArrayList.size());
			assertEquals("Dhruval", myArrayList.get(0));// true if object is retrieved at 0th position
			assertEquals("Majd", myArrayList.get(1));// true if object is retrieved at 1st position
			assertEquals("Ramon", myArrayList.get(2));// true if object is retrieved at 2nd position
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			System.out.println("1" + e.getMessage());
		}
	}

	/**
	 * Getting an element
	 */
	@Test
	public void testGet() {
		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");
		this.myArrayList.add("Ramon");

		try {
			assertFalse(this.myArrayList.isEmpty());
			assertEquals(3, myArrayList.size());
			assertEquals("Dhruval", myArrayList.get(0));
			assertEquals("Majd", myArrayList.get(1));
			assertEquals("Ramon", myArrayList.get(2));

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("5" + e.getMessage());
		}
	}

	/**
	 * 
	 */

	@Test
	public void testAddAll() {

		MyArrayList<String> myArrayListToAdd = new MyArrayList<>();

		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");
		myArrayListToAdd.add("Ramon");

		myArrayList.addAll(myArrayListToAdd);

		try {
			assertFalse(this.myArrayList.isEmpty());

			assertEquals(3, myArrayList.size());
			assertEquals("Dhruval", myArrayList.get(0));
			assertEquals("Majd", myArrayList.get(1));
			assertEquals("Ramon", myArrayList.get(2));

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("4" + e.getMessage());
		}

	}

	/**
	 * Getting an element
	 */
	@Test
	public void testRemoveElement() {
		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");
		this.myArrayList.add("Ramon");

		try {
			assertFalse(this.myArrayList.isEmpty());

			assertEquals(3, myArrayList.size());
			assertEquals("Dhruval", myArrayList.get(0));
			assertEquals("Majd", myArrayList.get(1));
			assertEquals("Ramon", myArrayList.get(2));
			myArrayList.remove("Ramon");
			assertEquals(2, myArrayList.size());

			assertEquals("Dhruval", myArrayList.get(0));
			assertEquals("Majd", myArrayList.get(1));

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("9" + e.getMessage());
		}
	}

	/**
	 * Getting an element
	 */
	@Test
	public void testRemoveIndex() {
		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");
		this.myArrayList.add("Ramon");

		try {
			assertFalse(this.myArrayList.isEmpty());
			assertEquals(3, myArrayList.size());
			assertEquals("Dhruval", myArrayList.get(0));
			assertEquals("Majd", myArrayList.get(1));
			assertEquals("Ramon", myArrayList.get(2));

			myArrayList.remove(1);
			assertEquals(2, myArrayList.size());
			assertEquals("Dhruval", myArrayList.get(0));
			assertEquals("Ramon", myArrayList.get(1));

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("8" + e.getMessage());
		}
	}

	/**
	 * Getting an element
	 */
	@Test
	public void testFind() {
		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");
		this.myArrayList.add("Ramon");

		try {
			assertFalse(this.myArrayList.isEmpty());
			assertEquals(3, myArrayList.size());
			assertEquals("Dhruval", myArrayList.get(0));
			assertEquals("Majd", myArrayList.get(1));
			assertEquals("Ramon", myArrayList.get(2));
			assertEquals(true, myArrayList.contains("Dhruval"));
			assertEquals(true, myArrayList.contains("Majd"));
			assertEquals(true, myArrayList.contains("Ramon"));
			assertEquals(false, myArrayList.contains("Ngo"));

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("7" + e.getMessage());
		}
	}

	/**
	 * Clearing elements in the list
	 */
	@Test
	public void testClear() {
		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");
		this.myArrayList.add("Ramon");

		try {
			assertFalse(this.myArrayList.isEmpty());
			assertEquals(3, myArrayList.size());
			myArrayList.clear();
			assertTrue(this.myArrayList.isEmpty());

			assertEquals(0, myArrayList.size());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("10" + e.getMessage());
		}
	}

	/**
	 * 
	 */
	@Test
	public void testToArrayElement() {
		String[] temp = { "Dhruval", "Majd" };
		this.myArrayList.add("Ramon");

		Object[] myArrayString = myArrayList.toArray(temp);

		assertEquals("Dhruval", myArrayString[0]);
		assertEquals("Majd", myArrayString[1]);
	}

	/**
	 * 
	 */
	@Test
	public void testToArrayObject() {
		this.myArrayList.add("Dhruval");
		this.myArrayList.add("Majd");

		Object[] temp = myArrayList.toArray();

		assertEquals("Dhruval", temp[0]);
		assertEquals("Majd", temp[1]);
	}
}
