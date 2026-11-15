package com.core.java.comparator;

public class Coupon {

	int id;
	
	String couponCode;
	
	double discount;
	
	public Coupon(int id, String couponCode, double discount) {
		super();
		this.id = id;
		this.couponCode = couponCode;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", couponCode=" + couponCode + ", discount=" + discount + "]";
	}
	
}
