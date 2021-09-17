package com.techment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTesting {
 Calculation calculation = new Calculation();
 
 @Before
 void test10() {
	 assertTrue(true);
	 System.out.println("before test");
 }
 
 @BeforeEach
 void test11() {
	 assertTrue(true);
	 System.out.println("before test");

 }
 
 @AfterEach
 void test12() {
	 assertTrue(true);
	 System.out.println("after test");

 }
 
	@Test
	void test() {
		assertEquals(6,calculation.add(4, 2));
		System.out.println("test");
		
		
	}
	
	@Test
	void test2() {
		assertNotEquals(6, calculation.add(4, 2));
		System.out.println("test2");
	}
	
	@Test
	void test3() {
		
		assertEquals("eligible" , calculation.checkEligiblity(17));
	}
	
	@Test
	void test4() {
		
		assertTrue(calculation.name.contains("g"));
	}
	
	@Test
	void test5()
	{
		assertThrows(ArithmeticException.class , ()-> {int a=2;int b=0; System.out.println(a/b);});
	}

	@Test
	void test6()
	{
		assertThrows(IllegalArgumentException.class, ()->{Integer.parseInt("1");});
	}
	
	@Test
	void test7()
	{
		assertThrows(IllegalArgumentException.class, ()->{Integer.parseInt("ab");});
	}
}
