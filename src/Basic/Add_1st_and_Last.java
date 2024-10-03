package Basic;

import java.util.Scanner;

public class Add_1st_and_Last {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int first = num % 10;
		num = num / 10;
		int second = num % 10;
		num = num / 10;
		System.out.println("Add first and last : " + (first + num));

		sc.close();

	}

}
