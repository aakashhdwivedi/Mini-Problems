package userInput;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		
		System.out.println("Enter First Number");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		System.out.println("Enter Second Number");
		double b = sc.nextInt();
		System.out.println("Enter Operation");
		char c = sc.next().charAt(0);
		double sum = a + b , sub = a - b , mul = a * b , div = a / b;
		
		switch (c) {
		case '+' :
			System.out.println("The sum of these numbers is " + sum);
			break;
		case '-' :
			System.out.println("The required result is " + sub);
			break;
		case '*' :
			System.out.println("The product of these numbers is " + mul);
			break;
		case '/' :
			System.out.println("The Division of these numbers is " + div);
			break;
			default :
				System.out.println("The Operation is not Valid, Please try aganin");
	    sc.close();
		}
			
		
	}

}
