import java.util.Random;
import java.util.Scanner;

// Dakota Mitchem
// CS 202 Section 002
// Assignment 7
// Goal: Guessing game
public class Main {

	public static void main(String[] args) {
		//Creates random generator, scanner, and variables
		Random gen = new Random();
		Scanner scan = new Scanner(System.in);
		int number = gen.nextInt(100) + 1;
		int guess = 0;
		int turns = 0;
		//Wrong number loop
		while(guess != number){
			System.out.println("Enter a number: ");
			guess = scan.nextInt();
			//Less or greater message
			if (guess < number)
				System.out.println("Too low \n");
			else if( guess > number)
				System.out.println("Too high \n");
			turns++;
		}
		System.out.println("Good job! The answer is " + number + "." + " It took you " + turns + " turns to guess!");
	}
}
