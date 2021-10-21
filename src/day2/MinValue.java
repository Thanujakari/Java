package day2;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		int x[] = new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		int min = x[0];

		for (int i = 0; i < x.length; i++) {
			if (x[i] < min) 
			{
				min = x[i];
			}
			
		}
		
		System.out.println("minimum value is:"+min);
	}

}
