package package1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers:");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("not a prime number");
			return;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("It is   not a prime number");
				return;
			}

		}
		System.out.println("Is a prime number");
	}

}
