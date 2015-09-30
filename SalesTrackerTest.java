import java.util.Scanner;

//Dakota Mitchem
//CS 202 Section 002
//Assignment 4.1
//Goal: Test SalesTracker class

public class Main {

	public static void main(String[] args) {
		//Initiates Scanner
		Scanner scan = new Scanner(System.in);
		//Requests and accepts item cost
		System.out.println("Enter item cost:");
		double Cost= scan.nextDouble();
		//Requests and accepts number of items sold
		System.out.println("Enter number of items sold:");
		int numSales= scan.nextInt();
		
		//Creates SalesTracker class
		SalesTracker a = new SalesTracker();
		//Tests SalesTracker class
		a.setItemCost(Cost);
		a.registerSale(numSales);
		a.displaySales();
	}

}
