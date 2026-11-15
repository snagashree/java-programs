package com.core.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
	
	private static Map<Integer, List<String>> groupWordsByLength(List<String> strList) {
		//stream
		//for each item in string list, count chars
		//finally group by
		
		return strList.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(groupWordsByLength(Arrays.asList
				("Tim", "John", "Meera", "Venki", "Sachin")));
	}

}
