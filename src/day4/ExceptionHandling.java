package day4;

import java.util.Scanner;

public class ExceptionHandling {
	Scanner sc;


	public static void main(String[] args) {
		try {
			ExceptionHandling e = new ExceptionHandling();

			System.out.println(e.sc);  // null


			// Instantiating
			e.sc = new Scanner(System.in);
			System.out.println(5/0);  // ArithmeticException

			// calling method
			System.out.println(e.div());
		
		int x[]=new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		System.out.println(x[2]);//ArrayIndexOutOfBoundsException
		
		void div()
		{
			
		}
		
		

	}

}
