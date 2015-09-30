import java.util.Scanner;

// Dakota Mitchem
// CS 202 Section 002
// Assignment 4.2
// Goal: Tests the MotorBoat class
public class Main {

	public static void main(String[] args) {
		//Initiates Scanner
		Scanner scan = new Scanner(System.in);
		
		//Requests initial values
		System.out.println("Enter max fuel:");
		int mFuel = scan.nextInt();
		System.out.println("Enter max speed:");
		int mSpeed = scan.nextInt();
		System.out.println("Enter current fuel:");
		int cFuel = scan.nextInt();
		System.out.println("Enter current speed:");
		int cSpeed = scan.nextInt();
		System.out.println("Enter efficiency:");
		int effi = scan.nextInt();
		System.out.println("Enter current distance traveled:");
		int dist = scan.nextInt();
		
		//Creates MotorBoat a
		MotorBoat a = new MotorBoat();
		
		//Sets initial values
		a.initialValues(mFuel, mSpeed, cFuel, cSpeed, effi, dist);
		
		//Runs first simulation
		System.out.print("How long to run simulation?");
		int time1 = scan.nextInt();
		a.simulator(time1);
		
		//Changes speed
		a.changeSpeed();
		
		//Runs second simulation
		System.out.print("How long to run simulation?");
		int time2 = scan.nextInt();
		a.simulator(time2);
		
		//Displays fuel level
		a.fuelCheck();
		
		//Adds to fuel level
		a.refuel();

		//Runs third simulation
		System.out.print("How long to run simulation?");
		int time3 = scan.nextInt();
		a.simulator(time3);
		
		//Displays fuel level
		a.fuelCheck();

		//Runs fourth simulation
		System.out.print("How long to run simulation?");
		int time4 = scan.nextInt();
		a.simulator(time4);
		
		//Displays distance traveled
		a.distanceCheck();

		//Runs fifth simulation
		System.out.print("How long to run simulation?");
		int time5 = scan.nextInt();
		a.simulator(time5);
		
		//Displays final fuel level
		a.fuelCheck();
		
		//Displays final distance
		a.distanceCheck();	
	}
}
