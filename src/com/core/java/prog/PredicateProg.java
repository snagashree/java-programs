package com.core.java.prog;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateProg {

	public static void main(String[] args) {
		System.out.println();
		int[] array = {12,4,5,232,93,45,82,90,34,2,6,32};
		//PredicateProg p = (n % 2) == 0;
		Predicate<Integer> p = (n) -> n % 2 == 0;
		
		System.out.println(p.test(array[5]));
		System.out.println(p.test(array[6]));
		
		Arrays.stream(array).forEach(a -> System.out.println(p.test(a)));
	}
}
