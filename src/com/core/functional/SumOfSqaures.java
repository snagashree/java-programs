package com.core.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SumOfSqaures {
	
	private static long sumOfSquares(List<Integer> list) {
		
		Predicate<? super Integer> predicate = p -> p > 0;
		
		return list.stream().filter(predicate)
				.map( n -> n * n)
				.mapToInt(Integer::intValue).sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumOfSquares(Arrays.asList(1,6,-10,100));
	}

}
