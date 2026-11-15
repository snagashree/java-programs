package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class OddNumbers {
	
	private static List<Integer> findOddNumbers(List<Integer> numList) {
		//stream
		//filter and return
		return numList.stream().filter(n -> n%2 !=0).toList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findOddNumbers(Arrays.asList(12,4,61)));
	}

}
