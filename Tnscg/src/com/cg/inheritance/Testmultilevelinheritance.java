package com.cg.inheritance;
class Grandfather{
	void house()
	{System.out.println(" my grandfather house belongs to my father");}
	void car()
	{System.out.println("my grandfather car belongs to my father");}
}
class Father extends Grandfather{
	void mybuisness()
	{
		System.out.println("Father business belongs to his son");
	}
}
class Son extends Father{
	void property()
	{
		System.out.println("My father property belongs to me");
	}
}
public class Testmultilevelinheritance 
{
   public static void main(String arg[] )
   {
	   Son s=new Son();
	   s.property();
	   s.mybuisness();
	   s.house();
	   s.car();
	  
	  
   }
}
