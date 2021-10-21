package day2;

import java.util.Scanner;

public class MaxValue {

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
		int max = x[0];
		for (int i = 1; i <n; i++) {
			if (x[i] > max) {
				max = x[i];
			}
			
		}
		System.out.println("maximum number is:" + max);
	}

}
