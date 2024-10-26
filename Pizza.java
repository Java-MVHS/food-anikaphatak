/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 * Pizza.java
 *
 * Pizza is a subclass of Food
 *
 * Working on:
 * 1. Inheritance (subclasses and superclasses)
 * 2. Using methods from other classes
 * 3. Initializing and creating an instance of classes to call methods
 *
 * Purpose: The purpose of this program is to print the way different types of foods are baked
 */
 
 public class Pizza extends Food		//Use keyword extends because Pizza is a subclass of Food
 {
 	 	
	 public Pizza()		//Create a default constructor because extends calls the constructor with no parameters
	 {
	 }
	 
	 public Pizza(String toppingIn)
	 {
		 super("baked", toppingIn, "pizza"); 	//Pass in the arguments into the super class' overloaded constructor 
	 } 
	 
	public Pizza(String ingredientIn2, String nameIn)		//I am constructing a constructor that accepts 2 arguments for DeepDishPizza
	 {
		super("baked", ingredientIn2, nameIn);
	 }

}
