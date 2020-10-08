package com.blz.interfacelearning.service.provider;

import com.blz.interfacelearning.service.RBIBank;

public class ICICIBankAbstract extends RBIBank {

	public ICICIBankAbstract(String bankName) {
		super(bankName);
	}

	@Override
	public int rateOfIntrest() {
		return 10;
	}

}
