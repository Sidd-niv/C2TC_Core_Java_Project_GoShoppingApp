package com.tns.goshoppingapp.framework;

public abstract class ShopFactory {
	
	// Declaring abstract methods
	public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);
	
	// Declaring abstract methods
	public abstract  NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);

}
