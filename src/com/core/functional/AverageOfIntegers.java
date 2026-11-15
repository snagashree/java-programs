package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class AverageOfIntegers {
	
	private static double averageOfIntegers(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(averageOfIntegers(Arrays.asList(4,5,2,71,5,23,67)));
	}

}
