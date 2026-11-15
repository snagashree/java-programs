package com.core.java.prog;

import java.util.function.Predicate;

public class PredicateJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p1 = (n) -> n % 2 == 0;
		Predicate<Integer> p2 = (n) -> n > 25;
		
		int[] array = {142, 12, 187, 65, 9, 114, 199, 53, 31, 156};
		
		System.out.println("Greater than 25 :");
		method1(p2, array);
		
		System.out.println("Even numbers ");
		method1(p1, array);
		
		System.out.println("Greater than 25 AND Even");
		method1(p1.and(p2), array);
		
		System.out.println("Greater than 25 OR Even");
		method1(p1.or(p2), array);
		
		System.out.println("Less than 25");
		method1(p2.negate(), array);
		
		System.out.println("Less than 25 and Even");
		method1(p2.negate().and(p1), array);
		
		System.out.println("Less than 25 and Odd");
		method1(p2.negate().and(p1.negate()), array);
	}
	
	static void method1(Predicate<Integer> p, int[] x) {
		for(int eachValue:x) {
			if(p.test(eachValue)) {
				System.out.print(eachValue+ " ");
			}
		}
		System.out.println();
	}

}
