package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class SkipNElements {

	private static List<Integer> skipNElements(List<Integer> list) {
		return list.stream().skip(3).toList();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(skipNElements(Arrays.asList(10, 20, 30, 40, 50, 60)));
	}

}
