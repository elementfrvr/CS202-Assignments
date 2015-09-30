// Dakota Mitchem
// CS 202 Section 002
// Assignment 4.1
// Goal: Calculate and display total sales

public class SalesTracker {
	//Declares private variables
	private double totalSales;
	private int numberSold;
	private double itemCost;
	
	//Constructor
	public SalesTracker() {
		setTotalSales(0);
		setNumberSold(0);
		setItemCost(0);
	}
	
	//Getters and Setters
	public int getNumberSold() {
		return numberSold;
	}

	public void setNumberSold(int numberSold) {
		this.numberSold = numberSold;
	}

	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	
	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	
	//Registers sales into numberSold
	public void registerSale(int sold){
		setNumberSold(sold);
	}
	
	//Calculates and displays number of sales
	public void displaySales(){
		setTotalSales(numberSold * itemCost);
		System.out.print("Total sales are " + totalSales);
	}
	
}
