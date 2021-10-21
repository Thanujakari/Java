package package1;

import java.util.Scanner;

public class NaturalNumDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		System.out.println("difference between sum of squares and squares of sum:" + difference(n));
	}

	static int difference(int n) {
		int s1 = 0, s2 = 0, diff = 0;
		for (int i = 0; i <= n; i++) {
			s1 += ((int)Math.pow(i, 2));
			s2 += i;
		}
		int squareOfSum =((int)Math.pow(s2, 2)) ;
		diff = squareOfSum - s1;
		return diff;

	}

}
