package Basic;

public class Swap_without_third_var {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int a = num1 + num2;
		int b = a - num2;
		    a = a - b;
		System.out.println("Before num is : "+num1 + num2);
		System.out.println("After swap is : "+a +b);
		

	}

}
