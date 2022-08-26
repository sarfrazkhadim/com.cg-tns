package com.cg.linearsearch;
import java.util.Scanner;
public class LinearSearch {
	public static void main (String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value");
		int size;
        size=s.nextInt();
        int [] arr= new int[10];
        System.out.println("values");
        int item=20;
        int temp=0;
        for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
		}
        for(int i=0; i<arr.length ;i++)
        {
        	if(arr[i]==item)
        	{
        		System.out.println("element is present"  +i+  "index position");
        		temp=temp+1;
        	}
        		
        }
        if(temp==0)
    	{
    		System.out.println("element is not present");
    	}
	}

}
