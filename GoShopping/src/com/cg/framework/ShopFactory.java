package com.cg.framework;

public  abstract class ShopFactory
{

	public abstract PrimeAccount  getnewprimeaccount (int accno,String accnm,float charges,boolean isprime);
	public abstract NormalAccount getnewnormalaccount(int accno,String accnm,float charges,float deliverycharges);
	public PrimeAccount getprimeaccount(int accno, String accnm, float charges, boolean isprime) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
