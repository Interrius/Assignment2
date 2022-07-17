package tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interfaces.MyStack;
import interfaces.StackADT;

class MyStackTests{


	StackADT<String> list;
	
	@Test
	void testClear() {
		list.clear();
		assertEquals(0, list.size());
	}
	
}