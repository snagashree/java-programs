package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class StringsForEach {
	
	private static void forEachPrint(List<String> list) {
		list.stream().forEach(System.out::println);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forEachPrint(Arrays.asList("Alice", "Bob", "Charlie"));
	}

}
