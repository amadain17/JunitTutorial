package com.testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test08_BeforeAfter {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("+++++++++++++++++++++++++Before Class++++++++++++++++++");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("+++++++++++++++++++++++++After Class++++++++++++++++++");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("**************************Before Method***************");
	}
	
	@After
	public void afterMethod() {
		System.out.println("**************************After Method***************");
	}
	
	
	@Test
	public void testCase1() {
		System.out.println("==========================Test Case 1==================");
	}
	
	@Test
	public void testCase2() {
		System.out.println("==========================Test Case 2==================");
	}
	
	@Test
	public void testCase3() {
		System.out.println("==========================Test Case 3==================");
	}
	
	
}
