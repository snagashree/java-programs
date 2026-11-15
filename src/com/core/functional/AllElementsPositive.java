package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class AllElementsPositive {

	private static List<Integer> filterPositiveNumbersInList(List<Integer> list) {
		return list.stream().filter(i-> i>=0).toList();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(filterPositiveNumbersInList(
				Arrays.asList(2,-10,50,-1,-99,0,3,6,203,-999)));
		
	}

}
