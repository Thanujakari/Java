package package1;

public class FibonacciRecursive {
	static int a = 1, b = 1, c = 0;

	static void recursion(int n) {
		if (n > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c);
			recursion(n - 1);

		}
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.print(a + "" + b);
		recursion(n - 2);

	}

}
