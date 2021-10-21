package package1;

import java.util.Scanner;

public class IncreasingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers:");
		int n = sc.nextInt();
		boolean flag = false;
		int d = n % 10;
		n = n / 10;
		while (n > 0) {
			if (d<= n % 10) {
				flag = true;
				break;
			}
			d= n % 10;
			n = n / 10;
		}
		if (flag) {
			System.out.println("number is not increasing number");
		} else {
			System.out.println("number is   increasing number");
		}

	}
}
