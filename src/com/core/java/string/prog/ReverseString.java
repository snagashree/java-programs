package com.core.java.string.prog;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Nagashree";
		System.out.println("String "+ s +" when reversed is : " +reverseString(s));
		
		System.out.println("String "+ s +" when reversed using streams is : " +reverseStringStream(s));
		
		System.out.println("String "+ s +" when reversed using 2 pointers is : " + reverseStringUsingPointers(s.toCharArray()));
	}
	
 	private static String reverseString(String s) {
 		String reversedString = "";
 		for(int i=s.length()-1; i>=0; i--) {
 			reversedString += s.charAt(i);
 		}
 		
 		return reversedString;
 	}
 	
 	private static String reverseStringUsingPointers(char[] s) {
 		int i = 0;
 		int j = s.length-1;
 		
 		
 		while(i<j) {
 			char temp = s[i];
 			s[i] = s[j];
 			s[j] = temp;
 			
 			i++;
 			j--;
 		}
 		
 		return new String(s);
 	}
 	
	private static String reverseStringStream(String s) {
		return IntStream.range(0, s.length())
		.mapToObj(i -> s.charAt(s.length()-1-i))
		.map(String::valueOf)
		.collect(Collectors.joining());
	}

}
