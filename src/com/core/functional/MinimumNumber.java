package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class MinimumNumber {
	
	private static int minimumValue(List<Integer> list) {
		return list.stream()
				.min(Integer::compareTo)
				.orElseThrow();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(minimumValue(Arrays.asList(627,234,590,856,132,2)));
	}

}
