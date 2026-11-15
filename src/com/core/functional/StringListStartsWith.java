package com.core.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringListStartsWith {
	
	private static int countOfWordsStartsWith(List<String> strList, String startingLetter) {
		//convert list to stream
		//filter starts with char provided
		//count 
		
		Predicate<? super String> predicate = p->p.startsWith(startingLetter);
		return (int) strList.stream().filter(predicate).count();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countOfWordsStartsWith(Arrays.asList("Abhi","Ani","Ashvi","Balu","John", "Bill","Cathy", "Esha","Dhanu"), "A");
	}

}
