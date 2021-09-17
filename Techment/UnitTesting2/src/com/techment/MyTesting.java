package com.techment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyTesting {

	@BeforeClass
	void test() throws Exception {
		 assertTrue(true);
		 System.out.println("before Class");
	}
	
	@Before
	void test1() {
		 assertTrue(true);

		System.out.println("before");
	}
	
	@Test
	void testFindMax() {
		System.out.println("test case find max");
		assertEquals(4, Calculation.findMax(new int[] {1,2,3,4}));
		assertEquals(-2, Calculation.findMax(new int[] {-12,-3,-4,-2}));
	}
	
	@Test
	void testCube() {
		System.out.println("test case cube");
		assertEquals(9, Calculation.cube(3));
	}
	
	@Test
	void testReverseWord() {
		System.out.println("test case reverse word");
		assertEquals("test", Calculation.reverseWord("tset"));
	}
	
	@After
	void tearDown(){
		System.out.println("after");
	}
	
	@AfterClass
	void tearDownAfterClass() {
		System.out.println("after class");
	}
}