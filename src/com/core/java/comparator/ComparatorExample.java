package com.core.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	
	public static void main(String[] args) {
		List<Coupon> couponList = new ArrayList<>();
		couponList.add(new Coupon(3,"Sale90", 8.2));
		couponList.add(new Coupon(2,"SuperSale", 16.8));
		couponList.add(new Coupon(5,"GreatSale", 23.4));
		couponList.add(new Coupon(1,"FestiveSale", 43.88));
		couponList.add(new Coupon(4,"SaleOSale", 88.44));
		System.out.println("Coupon Discount Ordering");
		Comparator<Coupon> couponDiscComparator = (c1, c2) -> Double.compare(c1.discount, c2.discount);
		Collections.sort(couponList,couponDiscComparator);
		couponList.forEach(System.out::println);
		System.out.println("Coupon Code Ordering");
		Collections.sort(couponList, Comparator.comparing(c -> c.couponCode));
		couponList.forEach(System.out::println);
	}
}
