package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class StringsByLength {
	
	private static List<String> stringsByLength(List<String> list, int length) {
		return list.stream().filter(s -> s.length() >= length).toList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = Arrays.asList("cat", "elephant", "dog", "tiger", "lion");
		System.out.println(stringsByLength(words, 4));
	}

}
