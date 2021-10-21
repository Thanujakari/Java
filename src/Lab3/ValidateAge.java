package Lab3;

import java.util.Scanner;

public class ValidateAge extends Exception {

	public ValidateAge(String str) {
		System.out.println(str);
	}

     public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your age:");
			int age=sc.nextInt();
			try {
				if(age<15)
				{
					throw new ValidateAge("Invalid age");
					
				}
				else {
					System.out.println("valid age");
				}
			}
			catch(ValidateAge v)
			{
				System.out.println(v);
			}
	}

}
