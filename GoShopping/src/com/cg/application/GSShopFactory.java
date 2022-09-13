package com.cg.application;

import com.cg.framework.NormalAccount;
import com.cg.framework.PrimeAccount;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory 
{
	public PrimeAccount getnewprimeaccount(int accno,String accnm,float charges,boolean isprime)
   {
	   PrimeAccount obj=new GSPrimeAccount(accno,accnm,charges,isprime);
	   return obj;
   }
	 public NormalAccount getnewnormalaccount(int accno,String accnm,float charges,float deliverycharges)
	   {
		   NormalAccount obj=new GSNormalAccount(accno,accnm,charges,deliverycharges);
		   return obj;
	   }
	
}
