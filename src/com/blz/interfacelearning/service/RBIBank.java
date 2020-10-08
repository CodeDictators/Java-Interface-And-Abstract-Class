package com.blz.interfacelearning.service;

public abstract class RBIBank {

	public String bankName;

	public RBIBank(String bankName) {
		System.out.println("Inside: " + bankName);
	}

	public void holiday() {
		System.out.println("Every 1st and 3rd Sat Holiday");
	}

	public abstract int rateOfIntrest();

	public final int demo() {
		return 0;
	}
}
