package com.cg.framework;

public abstract class ShopAccount {
	protected int accno;
	protected String accnm;
	protected float charges;
	
	public ShopAccount(int accno,String accnm,float charges)
	{
		this.accno=accno;
		this.accnm=accnm;
		this.charges=charges;
	}
	public int getaccno()
	{
		return accno;
	}
	public void setaccno(int accno)
	{
		this.accno=accno;
	}	
	public String getaccnm()
	{
		return accnm;
	}
	public void setaccnm(String accnm)
	{
		this.accnm=accnm;
	}	
	public float getcharges()
	{
		return charges;
	}
	public void setcharges(float charges)
	{
		this.charges=charges;
	}	
	
	public void bookproduct(float p)
	{
		System.out.println("charges of product "+getcharges());
	}
	
	public void items (float k)
	{
		System.out.println("1 mobile=10000\n2.laptop=200000");
	}
	
	@Override
	public abstract String toString();
	
}
