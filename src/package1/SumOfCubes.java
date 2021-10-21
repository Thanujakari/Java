package package1;

import java.util.Scanner;

public class SumOfCubes {
	public static void cubes(int n) {
		int sum = 0;
		for (int x = 1; x <= n; x++) {
			sum += x * x * x;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers:");
		int n = sc.nextInt();
		SumOfCubes.cubes(n);

	}

}
