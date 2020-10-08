package com.blz.interfacelearning.runner;

import com.blz.interfacelearning.service.BharatBank;
import com.blz.interfacelearning.service.RBIBank;
import com.blz.interfacelearning.service.provider.HDFCBank;
import com.blz.interfacelearning.service.provider.HDFCBankAbstract;
import com.blz.interfacelearning.service.provider.ICICIBank;
import com.blz.interfacelearning.service.provider.ICICIBankAbstract;

public class Transaction {

	public Transaction() {
		System.out.println("Inside Transaction");
	}

	public static final strictfp void main(String[] args) {
		System.out.println("Hello Java");

//		RBIBank bank = new RBIBank();

		System.out.println("Using Abstract Class");
		RBIBank hdfcBankAbstract = new HDFCBankAbstract("HDFC Abstract");
		System.out.println("HDFC Bank rate of intrest: " + hdfcBankAbstract.rateOfIntrest());

		RBIBank iciciBankAbstract = new ICICIBankAbstract("ICICI Abstract");
		System.out.println("ICICI Bank rate of intrest: " + iciciBankAbstract.rateOfIntrest());

		System.out.println("\nUsing interface");

		BharatBank hdfcBank = new HDFCBank();
		System.out.println("HDFC Bank rate of intrest: " + hdfcBank.intrestRareOfHomeLoan());

		BharatBank iciciBank = new ICICIBank();
		System.out.println("ICICI Bank rate of intrest: " + iciciBank.intrestRareOfHomeLoan());

	}
}
