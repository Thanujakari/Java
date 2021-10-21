package day2;

import java.util.Scanner;

public class ReverseOrder {

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
		System.out.println("before reverse order:");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("after reverse order:");
       for(int i=x.length-1;i>=0;i--)
       {
    	   System.out.println(x[i]);
       }
       Sort.bubbleSort(x);
       System.out.println("ascending order:");
       for(int i=0;i<x.length;i++)
       {
    	   System.out.println(x[i]);
       }
	}
	
}
class Sort
{
	
	public static void bubbleSort(int[] arr)
 {
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=0;j<arr.length-1-i;j++)
		 {
			 if(arr[j]>arr[j+1])
			 {
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
				 
			 }
		 }
			 
			 
	 }
 }
}
 
