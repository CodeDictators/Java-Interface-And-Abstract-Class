package com.blz.interfacelearning.service.provider;

import com.blz.interfacelearning.service.RBIBank;

public class HDFCBankAbstract extends RBIBank {

	public HDFCBankAbstract(String bankName) {
		super(bankName);
	}

	@Override
	public int rateOfIntrest() {
		return 5;
	}

}
