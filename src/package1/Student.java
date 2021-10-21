package package1;

import java.util.Scanner;

public class Student {

	private int stdId;
	public String name;
	static int age;

	Student() {
	}

	Student(int stdId) {
		this.stdId = stdId;
	}

	Student(String name) {
		this.name = name;
	}

	Student(int stdId, String name) {
		this.stdId = stdId;
		this.name = name;
	}

	static {

	}

	{

	}

	public static void main(String[] args) {
		int y1 = 200; // local variable
		Student s1 = new Student(1000, "Ram");
		System.out.println(s1.stdId);
		System.out.print(s1.name);
		System.out.println(s1.getStdId());
		System.out.println(age);
		System.out.println(y1);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter Second number: ");
		int y = sc.nextInt();

		System.out.println("Enter Your name: ");
		String name = sc.next();
		System.out.println(name);

		int z = x + y;
		System.out.println(z);

	}

	private int getStdId() {

		return stdId;
	}

	void setName(String n) {
		this.name = n;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setStdId(int id) {
		this.stdId = id;
	}

}
