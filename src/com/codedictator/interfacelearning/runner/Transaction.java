package com.codedictator.interfacelearning.runner;

import com.codedictator.interfacelearning.service.BharatBank;
import com.codedictator.interfacelearning.service.RBIBank;
import com.codedictator.interfacelearning.service.provider.HDFCBank;
import com.codedictator.interfacelearning.service.provider.HDFCBankAbstract;
import com.codedictator.interfacelearning.service.provider.ICICIBank;
import com.codedictator.interfacelearning.service.provider.ICICIBankAbstract;

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
