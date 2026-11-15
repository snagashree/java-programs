/**
 * 
 */
package com.core.java.prog;

/**
 * 
 */
public class Factorial {

	/**
	 * @param args
	 */
	
	public static int factorial(int num) {
	
		int result = 1;
		for(int i=1; i<= num; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial of 0 is");
		System.out.println(Factorial.factorial(0));
		
		System.out.println("Factorial of 1 is");
		System.out.println(Factorial.factorial(1));
		
		System.out.println("Factorial of 5 is");
		System.out.println(Factorial.factorial(5));
		
	}

}
