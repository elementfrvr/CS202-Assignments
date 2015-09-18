import java.util.Scanner;
import java.math.*;

// Dakota Mitchem
// CS 202 Section 002
// Assignment 3
// Goal: Calculate height and cost of a beverage container of a given volume and radius
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sets up scanner to accept input
				Scanner scanner = new Scanner(System.in);
		        //Request volume of container
				System.out.println("Enter desired volume:" );  
		        double volume = scanner.nextDouble();
		        //Request radius of container
		        System.out.println("Enter desired radius:");
		        double radius = scanner.nextDouble();
		        //Perform mathematical operations and store in respective variables
		        double height = volume / (Math.PI * Math.pow(radius, 2));
		        double cost = 2 * Math.PI * radius * (radius + height);
		        //Display results
		        System.out.println("The optimal height of the container is " + height);
		        System.out.print("The optimal cost of the container is " + cost);
	}

}
