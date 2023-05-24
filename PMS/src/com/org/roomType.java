package com.org;

public enum roomType {
	// roomType GENERAL(2000),SPECIAL(5000),SEMI-SPECIAL(3000),ICU(7000)
	GENERAL(2000), SPECIAL(5000), SEMISPECIAL(3000), ICU(7000);

	public int getNoOfPatient() {
		return noOfPatient;
	}

	private int noOfPatient;

	private roomType(int noOfPatient) {
		this.noOfPatient = noOfPatient;
	}

}
