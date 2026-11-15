package com.core.java.versions;

import java.util.Optional;

public class OptionalNullable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Nagashree";
		String address = null;
		
		Optional<String> optionalName = Optional.ofNullable(name);
		Optional<String> optionalAddress = Optional.ofNullable(address);
		
		System.out.println("Name is : " + optionalName.get());
		System.out.println("Address is : "+ optionalAddress);
		
		String defaultAddress = optionalAddress.orElse("Default address");
		System.out.println("Default address is : " + defaultAddress);
		
		Optional<String> str = Optional.of("Shree ");
		System.out.println(str.isEmpty());
		
		Optional<String> s = Optional.empty();
		System.out.println(s.isEmpty());
		
	}

}
