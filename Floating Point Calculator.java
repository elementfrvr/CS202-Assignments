import java.util.Scanner;

// Dakota Mitchem
// CS 202 Section 002
// Assignment 2.2
// Goal: Accepts two floating numbers and performs operations
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sets up scanner to accept input
		Scanner scanner = new Scanner(System.in);
        //Request first number
		System.out.println("Enter first number:" );  
        float num1 = scanner.nextFloat();
        //Request second number
        System.out.println("Enter second number:" );
        //Perform mathematical operations and store in respective variables
        float num2 = scanner.nextFloat();
        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;
        //Print results
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
	}

}
