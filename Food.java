/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 * Food.java
 * 
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
