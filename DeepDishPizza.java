/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 * DeepDishPizza.java
 * 
 * DeepDishPizza is a subclass of Pizza, Pizza is a subclass of Food, so DeepDishPizza orginates from Food
 *
 * The purpose of this program is to print three lines with the type of food
 * cost of food, number of the food item sold and how the food is prepared
 * 
 * Working on:
 * 1. Inheritance and subclasses
 * 2. Using methods from other classes
 * 3. Initializing and creating an instance of classes to call methods
 */
 
 public class DeepDishPizza extends Pizza
 {
	 public DeepDishPizza()		//Create a default constructor with no arguments 
	 {
	 }
	 
	 public DeepDishPizza(String ingredientIn3)
	 {
		  super(ingredientIn3, "deep dish pizza");		//Call overloaded constructor of parent class Pizza, and pass in appropriate parameters 
	 }
 }

