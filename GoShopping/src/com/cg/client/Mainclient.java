package com.cg.client;
import com.cg.application.GSShopFactory;
import com.cg.framework.PrimeAccount;
import com.cg.framework.NormalAccount;
import com.cg.framework.ShopFactory;

public class Mainclient {
	   public static void main(String arg[])
	   {
		   //Q1
		   ShopFactory shopfact = new GSShopFactory();
		   //Q2
		  PrimeAccount primeaccount = shopfact.getnewprimeaccount(1234,"sarfraj",100.0f,true);
		   primeaccount.bookproduct(225.9f);
		   System .out.println(primeaccount.toString());
		   //Q3
		   NormalAccount normalaccount = shopfact.getnewnormalaccount(456,"lalantop",120.0f,100.0f);
            normalaccount.bookproduct(22.5f);
		   System.out.println(normalaccount.toString());

		   //Q4
           primeaccount.items(888.8f);
		   
		  
		  
		  
   
	   }
}
