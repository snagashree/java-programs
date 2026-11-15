package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class HasLargeNumber {

	private static boolean hasLargeNumber(List<Integer> list) {
	
		//stream
		//condition 
		return list.stream().anyMatch(i-> i>100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(hasLargeNumber(Arrays.asList(10, 45, 88, 105, 3)));
	}

}
