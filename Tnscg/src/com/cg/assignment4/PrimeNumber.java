package com.cg.assignment4;
import java.util.Scanner;
public class PrimeNumber 
{
 public static void main(String arg[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the number");
  int n= s.nextInt();
  int temp=0;
  for(int i=2;i<=n-1;i++)
  {
	  if(n%i==0)
	  {
		  temp=temp+1;
	  }
  }
  if(temp==0)
  {
	  System.out.println(n+"Is prime number");
  }
  else
  {
	  System.out.println(n+"Is not prime number");
  }
 }
}
