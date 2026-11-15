package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class DoubleElement {

	private static List<Integer> doubleElement(List<Integer> list) {
	
		return list.stream().map(n-> n*2).toList();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(doubleElement(Arrays.asList(2,5,67,8,25)));
	}

}
