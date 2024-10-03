package Basic;

import java.util.Scanner;

public class Time_conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the second num : ");

		int second = sc.nextInt();

		int hour = second / 3600;
		second = second % 3600;
		int minutes = second / 60;
		second = second % 60;

		System.out.println("hour is : " + hour);
		System.out.println("minutes is : " + minutes);
		System.out.println("seconds is : " + second);

		sc.close();

	}

}
