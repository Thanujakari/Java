package day2;

import java.util.Scanner;

public class SecSmall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int s=sc.nextInt();
		int x[]=new int[s];
		System.out.println("enter array elements:");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("second smallest element is:"+secondSmall(x));
	}
	static int secondSmall(int[] a)
	{
		
		int secondsmall=a[0];
		int small=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<small)
			{
				secondsmall=small;
				small=a[i];
			}
			else if(a[i]<secondsmall&&a[i]!=small||secondsmall==small)
			{
				secondsmall=a[i];
			}
		}
        return secondsmall;
	}

}
