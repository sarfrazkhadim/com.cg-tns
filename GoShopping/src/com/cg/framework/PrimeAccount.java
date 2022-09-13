package com.cg.framework;

public abstract class PrimeAccount extends ShopAccount
{
protected boolean isprime;

	public PrimeAccount(int accno, String accnm, float charges,boolean isprime)
	{
		super(accno, accnm, charges);
		this.isprime=isprime;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public abstract void bookproduct(float p);
	@Override
	public abstract String toString();
	
}