package Lab3;

import java.util.Scanner;

public class ValidateName extends Exception {
	
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter your first name:");
			String fn=sc.nextLine();
			System.out.println("enter your last name:");
			String ln=sc.nextLine();
			
			try {
				if(fn.isEmpty()||ln.isEmpty())
				{
					throw new ValidateName("Invalid name");
				}
				else {
					System.out.println("valid name");
				}
			}
			catch(ValidateName v)
			{
				System.out.println(v);
			}
	 }

	public ValidateName(String a) {
		super(a);
		
	}

}
