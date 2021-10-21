package package1;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter below options:");
		System.out.println("enter 1 for Red light");
		System.out.println("enter 2 for Green Light");
		System.out.println("enter 3 for Yellow Light");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Red Light means stop the vehicles");
			break;
		case 2:
			System.out.println("Green Light means start the vehicles");
			break;
		case 3:
			System.out.println("yellow Light means Ready to go the vehicles");
			break;
		default:
			System.out.println("Invalid option");
		}

	}

}
