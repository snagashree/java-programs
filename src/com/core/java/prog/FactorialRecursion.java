/**
 * 
 */
package com.core.java.prog;

/**
 * 
 */
public class FactorialRecursion {

	/**
	 * @param args
	 */
	public static int factorial(int num) {
		if(num == 0 || num == 1) 
			return 1;
		else return(num * factorial(num-1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Factorial of 0 is ");
		System.out.println(Factorial.factorial(0));
		
		System.out.println("Factorial of 1 is ");
		System.out.println(Factorial.factorial(1));
		
		System.out.println("Factorial of 5 is ");
		System.out.println(Factorial.factorial(5));
		
	}

}
