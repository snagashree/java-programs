package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class DistinctList {
	
	private static List<Integer> distinctIntegers(List<Integer> list) {
		return list.stream().distinct().toList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(distinctIntegers
				(Arrays.asList(23,23,23,45,45,67,89,23,54,645,45,12)));
	}

}
