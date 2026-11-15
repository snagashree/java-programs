package com.core.java.prog;

import java.util.function.Function;

public class Java8Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> f = s-> s.length();
		System.out.println(f.apply("Nagashree"));
		System.out.println(f.apply("Nepolian"));
		System.out.println(f.apply("Prathith"));
		
		Function<Integer, Integer> f2 = i -> i+10;
		
		System.out.println(f2.apply(2));
	}

}
