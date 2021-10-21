package package1;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		boolean t = false;
		int power = 0, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers:");
		int n = sc.nextInt();
		while (temp < n) {
			temp = (int) (Math.pow(2, power));
			power++;
			if (temp == n) {
				t = true;
			}
		}
		if (t)
			System.out.println("num is power of 2");
		else
			System.out.println("num is  not a power of 2");
	}

}
