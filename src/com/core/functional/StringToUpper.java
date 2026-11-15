package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class StringToUpper {
	
	private static List<String> stringsToUpper(List<String> strList) {
		//convert to stream
		//for each string, convert to upper
		//collect and return
		//or map(s -> s.toUpperCase())
		return strList.stream().map(String::toUpperCase).toList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(stringsToUpper(Arrays.asList("banu","bheem", "nandu")));
	}

}
