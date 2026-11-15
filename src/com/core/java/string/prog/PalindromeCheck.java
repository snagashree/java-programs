package com.core.java.string.prog;

import java.util.stream.IntStream;

public class PalindromeCheck {

	public static void main(String[] args) {
		String s1="abba";
		String s2="Nagu";
		System.out.println("String " +s1+" is Palindrome " + isPalindrome(s1));
		System.out.println("String " +s2+" is Palindrome " + isPalindrome(s2));
		
		
		System.out.println("String " +s1+" is Palindrome using Stream " + isPalindromeStream(s1));
		System.out.println("String " +s2+" is Palindrome using Stream " + isPalindromeStream(s2));
	}
	
	private static boolean isPalindrome(String testString) {
		boolean isPalindrome = false;
		String reverseString = "";
		for(int i=testString.length()-1; i>=0; i--) {
			reverseString = reverseString + testString.charAt(i);
		}
		
		if(reverseString.equals(testString))
			isPalindrome=true;
		
		return isPalindrome;
	}
	
	private static boolean isPalindromeStream(String s) {
		
		return IntStream.range(0, s.length()/2).allMatch(i->s.charAt(i) == s.charAt(s.length()-1-i));
	}
}
