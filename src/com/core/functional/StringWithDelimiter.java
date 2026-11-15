package com.core.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithDelimiter {
	
	private static String stringWithDelimiter(List<String> list) {
		return list.stream().collect(Collectors.joining(", "));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(stringWithDelimiter(Arrays.asList("Java", "Python", "C++", "JavaScript")));
	}

}
