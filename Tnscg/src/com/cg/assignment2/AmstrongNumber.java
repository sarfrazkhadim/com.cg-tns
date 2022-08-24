package com.cg.assignment2;
import java.util.Scanner;
public class AmstrongNumber
{
 public static void main(String arg[])
 {
	 Scanner s= new Scanner(System.in); 
	 System.out.println("Enter  the  value ");
	 int n = s.nextInt();
	
	 int t1= n;
	 int length=0;
	 while(t1!= 0)
	 {
		 length = length + 1;
		 t1=t1/10;
	 }
	 int t2=n;
	 int multi=1;
	 int arm=0;
	 int rem;
	 while(t2!=0)
	 {
		 rem=t2%10;
		 for(int i=1;i<=length;i++)
		 {
			 multi=multi*rem;
		 }
		 arm=arm+multi;
		 t2=t2/10;
	 }
	 if(arm==n)
	 {
		 System.out.println("this is amstrong number");
	 }
	 else
	 {
		 System.out.println("this is not amstrong number");
	 }
 }
}
