package com.cg.framework;

public abstract class NormalAccount extends ShopAccount
{
	protected float deliverycharges=100;
	public NormalAccount(int accno, String accnm, float charges,float deliverycharges)
	{
		super(accno, accnm, charges);
	
		
		// TODO Auto-generated constructor stub
    }
@Override
public abstract void bookproduct(float p);
@Override
public abstract  String toString();


}
