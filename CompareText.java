import java.util.Scanner;

// Dakota Mitchem
// CS 202 Section 002
// Assignment 6
// Goal: Compares two text strings and reports differences
public class Main {

	public static void main(String[] args) {
		//Creates scanner
		Scanner scan = new Scanner(System.in);
		//Declares variables
		String string1, string2;
		//Requests and stores strings in variables
		System.out.println("Enter first string");
		string1 = scan.nextLine();
		System.out.println("Enter second string");
		string2 = scan.nextLine();
		//Displays differences if string1 is less than or equal to string2
		if(string1.length() <= string2.length()){
			for (int count = 0; count < string1.length(); count++){
				if (string1.charAt(count) != string2.charAt(count))
					System.out.println(string1.charAt(count) + " does not equal " + string2.charAt(count));
			}
		}
		//Displays differences if string1 is greater than string2
		if(string1.length() > string2.length()){
			for (int count = 0; count < string2.length(); count++)
			{
				if (string1.charAt(count) != string2.charAt(count))
					System.out.println(string1.charAt(count) + " does not equal " + string2.charAt(count));
			}
		
		}
	}
}
