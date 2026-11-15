package com.core.java.prog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TakeWhile {

	//I have a random integers, I need to create a list of integers which comes before the test integer
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = Arrays.asList(4,2,6,9,1,5,12,46,23,52,34,21,11);
		Comparator<Integer> comp = (i,j) -> i.compareTo(j);
		
		List<Integer> sortedList = intList.stream().sorted(comp).toList();
		System.out.println(sortedList);
		List<Integer> finalList = sortedList.stream().takeWhile(i -> i < 15).toList();
		
		System.out.println(finalList);
	}

}
