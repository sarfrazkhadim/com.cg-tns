package com.cg.application;

import com.cg.framework.PrimeAccount;

public class GSPrimeAccount extends PrimeAccount 
{
	protected static final float charges = 0;
	public GSPrimeAccount(int accno, String accnm, float charges,boolean isprime )
	{
		super(accno, accnm, charges,isprime);
		
		// TODO Auto-generated constructor stub
	 
	}
	public void bookproduct(float p)
	{
	System.out.println("item delivered with only:"+charges);
	}

	@Override
	public void items (float k) {
		// TODO Auto-generated method stub
		System.out.println("1 mobile=10000\n2.laptop=200000");
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "prime account[accno="+getaccno() + ",accnm="+getaccnm() + ",charges="+ getcharges() +",isprime="+isprime +"]";
				
		
	}
	

}
