package com.cg.application;

import com.cg.framework.NormalAccount;

public class GSNormalAccount extends NormalAccount {

	public GSNormalAccount(int accno, String accnm, float charges, float deliverycharges)
	{
		super(accno, accnm, charges, deliverycharges);
		// TODO Auto-generated constructor stub
	}
	public float getdeliverycharges()
	{
		return deliverycharges;
	}
	public void setdeliverycharges(float deliverycharges)
	{
		this.deliverycharges=deliverycharges;
	}	
	@Override
    public void bookproduct(float p)
   {
	System.out.println("itms are delivered with deliverycharges are:"+ getdeliverycharges());
   }
	@Override
	public void items(float k) {
		System.out.println("1 mobile=10000\n2.laptop=200000");
	}
	
	@Override
	public String toString()
	{
		return "normal account[accno="+getaccno() + ",accnm="+getaccnm() + ",charges="+ getcharges() +",deliverycharges="+getdeliverycharges() +"]";

		
		
	}
	
	

	

}
