package com.cg.assignment6;
import java.util.Scanner;
public class PerfectNum
{
	public static void main(String arg[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the value");
	  int n = s.nextInt();
	  int sum=0;
	  for(int i=1;i<n;i++)
	  {
		  if(n%i==0)
		  {
			  sum=sum+i;
		  }
	  }
	  if(n==sum)
	  {
		  System.out.println("it is perfect number");
	  }
	  else
	  {
		  System.out.println("not perfect number");
	  }
	 }

}