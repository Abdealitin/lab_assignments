package com.yash.tdddemos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SearchElementTest {
	
//	@BeforeAll
//	public void init(){
//		SearchElement se = new SearchElement();
//	}

	@Test
	void test_SearhElement_GivenMoreThanTenNumbers_ShouldThrowsException() {
		SearchElement se = new SearchElement();
		int[] nums = {1,2,3,4};
		Assertions.assertThrows(Exception.class, () -> {
			se.search(nums);
		});
	}
	@Test
	void test_SearchElement_GivenTenNumbersAndKey_ShouldReturnOccurences() throws Exception {
		SearchElement se = new SearchElement();
		int[] nums = {1,2,3,4,4,4,4,8,8,3};
		Assertions.assertEquals(se.search(nums,4), 4);
	}

}
