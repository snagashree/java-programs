package com.core.java.integer.progs;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list.stream().map(a -> a*a).toList());
	}

}
