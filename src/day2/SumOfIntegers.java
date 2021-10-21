package day2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfIntegers {

	public static void main(String[] args) {
		int n;
		int sum=0;
		//asking for user input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integers:");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		System.out.println("all integers:");
		while(st.hasMoreTokens())
		{
			String temp=st.nextToken();
			n=Integer.parseInt(temp);
			System.out.print(n+" ");
			sum+=n;
		}
System.out.println();
System.out.println("sum of integers is:"+sum);

//closing resourse
sc.close();
	}

}
