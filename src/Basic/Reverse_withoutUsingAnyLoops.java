package Basic;
import java.util.Scanner;


public class Reverse_withoutUsingAnyLoops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Reverse number : ");
		int num = sc.nextInt();
		
		System.out.println(num%10);
		
		num=num/10;
        System.out.println(num%10);
		
		num=num/10;
		System.out.println( num%10);
    
		sc.close();
	}

}
