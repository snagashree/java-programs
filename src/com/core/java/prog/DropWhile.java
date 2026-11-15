package com.core.java.prog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DropWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = Arrays.asList(4,2,6,9,1,5,12,46,23,52,34,21,11);
		Comparator<Integer> comp = (i,j) -> i.compareTo(j);
		List<Integer> sortedList = intList.stream().sorted(comp).toList();
		List<Integer> droppedList = sortedList.stream().dropWhile(i-> i<5).toList();
		System.out.println("Sorted List");
		System.out.println(sortedList);
		System.out.println("Drop while list");
		System.out.println(droppedList);
	}

}
