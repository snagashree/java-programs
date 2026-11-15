package com.core.java.string.prog;

public class Palindrome {
	
	public boolean isPalindrome(String s) {
        boolean isPalindrome = false;
        if(s.isBlank() || s.isEmpty())
        	return true;
        s = s.stripIndent();
        s = s.toLowerCase();

        return isPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
