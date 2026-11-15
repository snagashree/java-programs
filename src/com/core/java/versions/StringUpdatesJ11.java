package com.core.java.versions;

import java.util.stream.Collectors;

public class StringUpdatesJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "  ";
		System.out.println(str.isBlank());
		
		str = "I\nam\nthe\ncreator of my destiny";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));
		
		char c = '\u20B9';
		System.out.println("Char is " + c);
		str = c + str + c;
		
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
		
		System.out.println();
	}

}
