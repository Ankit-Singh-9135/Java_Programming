package Basic;

import java.util.Scanner;

public class Find_the_Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Square num :");
		int side = sc.nextInt();
		int square = side * side;
		System.out.println("Area of Square is : " + square);

		System.out.print("Enter the length or breadth : ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int rectangle = length * breadth;
		System.out.println("Area of rectangle is : " + rectangle);
		sc.close();

	}

}
