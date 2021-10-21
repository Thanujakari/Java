package package1;

import java.util.Scanner;

public class FibonacciNonrecursive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		int a = 1, b = 1, c;
		for (int i = 0; i <= n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;

		}

	}

}
