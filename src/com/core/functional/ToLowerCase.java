package com.core.functional;

import java.util.Arrays;
import java.util.List;

public class ToLowerCase {
	
	private static List<String> toLowerCase(List<String> list) {
		return list.stream().map(s->s.toLowerCase()).toList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toLowerCase(Arrays.asList("JAVA", "SPRING", "DOCKER")));
	}

}
