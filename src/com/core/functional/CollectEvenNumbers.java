package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class CollectEvenNumbers {
	
	private static List<Integer> evenNosList(List<Integer> list) {
		//convert to stream
		//apply filter for even
		//return modified list
		return list.stream().filter( n -> n%2 == 0).toList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(evenNosList(Arrays.asList(1,5,25,84,12,99,121, 52)));
	}

}
