package com.core.java.prog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(10);
		list.add(1);
		list.add(78);
		list.add(55);
		
		List<Integer> l2 = list.stream().filter( i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> l3 = list.stream().filter( i -> i % 2 == 0).toList();
		
		System.out.println("List 2");
		System.out.println(l2);
		System.out.println("List 3");
		System.out.println(l3);
		long count = list.stream().count();
		System.out.println("List Count :");
		System.out.println(count);
		Comparator<Integer> comp = (i,j) -> i.compareTo(j);
		
		List<Integer> sortedList = list.stream().sorted(comp).toList();
		System.out.println("Sorted List");
		System.out.println(sortedList);
		
		Integer max = list.stream().max(comp).get();
		System.out.println("Max");
		System.out.println(max);
		
		Integer min = list.stream().min(comp).get();
		System.out.println("Min");
		System.out.println(min);
	}

}
