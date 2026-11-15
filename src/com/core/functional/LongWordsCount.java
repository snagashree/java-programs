package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class LongWordsCount {
	
	private static long longWordsCount(List<String> list) {
		return list.stream().filter(s-> s.length() > 5).count();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longWordsCount(Arrays.asList
				("apple", "banana", "watermelon", "cherry", "kiwi")));
	}

}
