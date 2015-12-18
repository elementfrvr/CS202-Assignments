// Dakota Mitchem
// CS 202 Section 002
// Assignment 7
// Goal: Prints multiplication table
public class Main {

	public static void main(String[] args) {
		//Keep track of rows
		for (int count = 1; count < 11; count++){
			System.out.println("");
		//Keep track of columns
			for (int count2 = 1; count2 < 11; count2++){
				System.out.print(count*count2 + " ");
			}
			
		}
	}

}
