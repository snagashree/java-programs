package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class SquareEveryNumber {
	
	private static List<Integer> squareEveryNumber(List<Integer> list) {
		return list.stream().map(n->n*n).toList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareEveryNumber(Arrays.asList(5,1,3,9,10)));
	}

}
