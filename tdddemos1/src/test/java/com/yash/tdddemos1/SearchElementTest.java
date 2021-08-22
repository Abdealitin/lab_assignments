package com.yash.tdddemos1;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SearchElementTest {

//	@Test
//	public void test_IMPL() throws Exception {
//		SearchElement se = new SearchElement();
//		int[] nums = {1,2,4,8,4,6,7,9,2,5};
//		Assertions.assertEquals(se.search(nums,2), 2);
//	}
//	
	@Test
	public void test_Odd() {
		int[] nums = {1,2,5,6,8,-5,-4};
		GiveNumber gn = new GiveNumber();
		Assertions.assertEquals(gn.getOdd(nums), 3);
	}
	@Test
	public void test_Even() {
		int[] nums = {1,2,5,6,8,-5,-4};
		GiveNumber gn = new GiveNumber();
		Assertions.assertEquals(gn.getEven(nums), 4);
	}
	@Test
	public void test_Negative() {
		int[] nums = {1,2,5,6,8,-5,-4};
		GiveNumber gn = new GiveNumber();
		Assertions.assertEquals(gn.getNegative(nums), 2);
	}
	@Test
	public void test_Positive() {
		int[] nums = {1,2,5,6,8,-5,-4};
		GiveNumber gn = new GiveNumber();
		Assertions.assertEquals(gn.getPositive(nums), 5);
	}
}
