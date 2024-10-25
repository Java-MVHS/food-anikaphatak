/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 * Pizza3.java
 * 
 * The purpose of this program is to print three lines with the type of food
 * cost of food, number of the food item sold and how the food is prepared
 * 
 * Working on:
 * 1. Inheritance and subclasses
 * 2. Using methods from other classes
 * 3. Initializing and creating an instance of classes to call methods
 */
 
 public class Pizza3 extends Food3		//Use keyword extends because Pizza is a subclass of Food
 {
 	 //Declare field variable topping and name2 to store
 	 //the pizza's topping and the pizza's name
 	 
	
	 public Pizza3()		//Write a default constructor because extends calls the default constructor, without parameters
	 {
	 }
	 
	 public Pizza3(String ingredientIn, int count2, int cost2)
	 {
		 super("baked", ingredientIn, "pizza", count2, cost2); 	//Pass in the arguments into the super class' overloaded constructor 
	 } 
	 
	 
	 public Pizza3(String ingredientIn2, String nameIn, int count3, int cost3)		//I am constructing a constructor that accepts 2 arguments for DeepDishPizza
	 {
		super("baked", ingredientIn2, nameIn, count3, cost3);
	 }
	 
	
		 

}
