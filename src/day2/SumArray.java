package day2;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int s=sc.nextInt();
		int x[]=new int[s];
		System.out.println("enter array elements:");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println("sum of array elements are:"+sum);
	}

}
