package com.blz.interfacelearning.service.provider;

import com.blz.interfacelearning.service.BharatBank;

public class ICICIBank implements BharatBank {

	@Override
	public int intrestRareOfHomeLoan() {
		return 8;
	}

	@Override
	public int intrestRareOfCarLoan() {
		return 11;
	}

}
