import java.util.Scanner;

// Dakota Mitchem
// CS 202 Section 002
// Assignment 2.1
// Goal: Request user input and display a string of text
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Requests user's name
		System.out.println("What is your name?");
		//Sets up scanner to accept user input
		Scanner scanner = new Scanner(System.in);
		//Collects info and stores in respective variables
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		String age = scanner.nextLine();
		System.out.println("Where are you?");
		String location = scanner.nextLine();
		System.out.println("What is your pets's name?");
		String pet = scanner.nextLine();
		//Prints resulting data in requested format
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		System.out.println("I'm enjoying my time at " + location + ", though");
		System.out.println("I miss my pet " + pet + " very much!");
	}

}
