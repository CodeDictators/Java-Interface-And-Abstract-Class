package com.blz.interfacelearning.service.provider;

import com.blz.interfacelearning.service.BharatBank;

public class HDFCBank implements BharatBank {
	@Override
	public int intrestRareOfHomeLoan() {
		return 5;
	}

	@Override
	public int intrestRareOfCarLoan() {
		return 15;
	}

}
