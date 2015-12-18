import java.util.Scanner;

// Dakota Mitchem
// CS 202 Section 002
// Assignment 8
// Goal: Determine number of days where temperature is above average
public class NumberAboveAverage {

	public static void main(String[] args) {
		//Declare variables
		int [] days = new int [10];
		Scanner scan = new Scanner(System.in);
		int sumOfArray = 0;
		int numberAbove = 0;
		//Accept temperatures
		for(int count = 0; count< 10; count++){
			System.out.println("Enter a temperature:");
			int number = scan.nextInt();
			days[count] = number;
		}
		//Determine and display the average temperature
		for(int count2 = 0; count2< days.length; count2++)
			sumOfArray = sumOfArray + days[count2];
		double average = sumOfArray / days.length;
		System.out.println("The average is " + average);
		//Print statement before temperatures
		System.out.println("The temperatures which are above average are ");
		//Print temperatures above average
		for(int count3 = 0; count3< days.length; count3++){
			if (days[count3] > average){	
				System.out.print(days[count3] + " ");
				numberAbove++;
			}
		}
		//Print number of temperatures above average
		System.out.print("\n There are " + numberAbove + " of them.");
	}

}
