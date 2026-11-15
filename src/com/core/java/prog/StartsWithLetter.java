package com.core.java.prog;

import java.util.ArrayList;
import java.util.List;

public class StartsWithLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> namesList = new ArrayList<>();

		namesList.add("Nepolian");
		namesList.add("Nagashree");
		namesList.add("Prathith");
		namesList.add("Prakash");
		
		//List<String> startsWithList = namesList.stream().filter(s->s.startsWith("P")).toList();
		//System.out.println(startsWithList);
		System.out.println(namesList.stream().filter(s->s.startsWith("P")).toList());
		
	}

}
