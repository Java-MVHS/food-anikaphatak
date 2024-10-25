/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 * Food3.java
 * 
 * The purpose of this program is to print three lines with the type of food
 * cost of food, number of the food item sold and how the food is prepared
 * 
 * Working on:
 * 1. Inheritance and subclasses
 * 2. Using methods from other classes
 * 3. Initializing and creating an instance of classes to call methods
 */
 
 public class Food3
{
	protected String str; 		//Declare variable to store the line to print
	
	public Food3 ()		//Create a default constructor for Food because extends only calls default constructor
	{
		str = new String("");		//Initialize field variable in default constructor
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int count, int cost)
	{
	
		//String.format works like printf. I used String.format to format the price
		str = String.format("At the sale: %s %s with %s will be sold for %d cents each. With %d %s $%.2f can be made." , 
							name, prepMethod, ingredient, cost, count, name, ((double)(cost*count)/100));		//Print the line
	}

	public void printForSale()
	{
		System.out.println(str);	//Print what is stored in str
	}
}
