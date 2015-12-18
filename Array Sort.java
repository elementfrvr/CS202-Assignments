// Dakota Mitchem
// CS 202 Section 002
// Assignment 10

public class Main {

	public static void main(String[] args) {
		// Create array
		int [] array = {10,8,6,2,16,4,28,11,14,12,1};
		//Move through first 10 numbers
		for (int count = 0; count<array.length-1; count ++){
			int min = count;
			//Check for smallest number
			for ( int count2 = count + 1; count2<array.length; count2++){
				if(array[count2]< array[min])
					min=count2;
			}
		//Move values around
		int currentMin= array[min];
		array[min]= array[count];
		array[count]= currentMin;
		//Print array
			for(int print:array){
			System.out.print(print + ", ");
			}
			System.out.print("\n");
		}
		
		
	}
}
