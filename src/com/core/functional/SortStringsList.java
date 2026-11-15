package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class SortStringsList {
	
	private static List<String> sortStringsList(List<String> list) {
		return list.stream().sorted().toList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("cat", "elephant", "dog", "tiger", "lion");
		System.out.println(sortStringsList(words));
	}

}
