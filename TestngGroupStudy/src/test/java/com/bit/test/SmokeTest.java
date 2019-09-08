package com.bit.test;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {
	
	@Test (groups="abc")
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups="abc")
	public void test2() {
	System.out.println("test2");
	
	}
	@Test
	public void test3() {
	System.out.println("test3");
	}
}
