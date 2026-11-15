package com.core.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxOfIntegers {
	
	private static Optional maxOfInt(List<Integer> intList) {
		return Optional.of(intList.stream().max(Integer::compareTo));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maxOfInt(Arrays.asList()).ifPresent(System.out::println);
		maxOfInt(Arrays.asList(2,53,23,65,98,21,43,1)).ifPresent(System.out::println);
	}

}
