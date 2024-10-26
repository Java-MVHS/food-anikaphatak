/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 * Food.java
 * 
 * Purpose: Food.java is the parent class of Pizza.java, the purpose of this program is to print the name of a food
 * the method used to prepare the food and the food's ingredient 
 * Working on:
 * 1. Inheritance and subclasses
 * 2. Using methods from other classes
 * 3. Initializing and creating an instance of classes to call methods
 */
 
 public class Food
{
	protected String str;
	
	public Food ()		//Create a default constructor for Food because extends only calls default constructor
	{
		str = new String("");		//Initialize field variable in default constructor
	}
	
	public Food (String prepMethod, String ingredient, String name)
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;	//Initialize field variable, str, in overloaded constructor 
	}

	public void printForSale()
	{
		System.out.println(str);	//Print what is stored in str
	}
}
