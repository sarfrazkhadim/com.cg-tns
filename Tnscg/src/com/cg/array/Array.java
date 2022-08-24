package com.cg.array;
import java.util.Scanner;
public class Array {

	public static void main(String arg[])
	{
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no");
		size=s.nextInt();
		int [] arr=new int[10];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
		}
		
	}
}
