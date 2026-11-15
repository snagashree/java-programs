package com.core.java.integer.progs;

import java.util.Arrays;
import java.util.List;

public class CountNosGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10,45,60,80,30,90,55,100,200,40,350);
		//Comparator<Integer> comp = (i,j) -> i.compareTo(j); not necessary to sort
		int count = (int) list.stream().filter(i -> i> 50).count();
		System.out.println(count);
	}

}
