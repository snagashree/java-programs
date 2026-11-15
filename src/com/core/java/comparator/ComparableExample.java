package com.core.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(3, "TV", 54000));
		prodList.add(new Product(2, "Mobile", 12500));
		prodList.add(new Product(4, "Oven", 10000));
		prodList.add(new Product(1, "Refrigerator", 30000));
		
		Collections.sort(prodList);
		System.out.println(prodList);
		for(Product p : prodList) {
			
		}
	}

}
