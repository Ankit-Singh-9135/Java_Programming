package Basic;

import java.util.Scanner;

public class Convert_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fahrenheit : ");
		float fahrenheit = sc.nextFloat();
		float celsius = (fahrenheit - 32) * (5.0f / 9.0f);
		System.out.println("fahrenheit is : " + celsius);

		sc.close();

	}

}
