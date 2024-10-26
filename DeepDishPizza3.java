/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 * DeepDishPizza3.java
 * 
 * DeepDishPizza3 is a subclass of Pizza3, Pizza3 is a subclass of Food3, so DeepDishPizza3 has inherited methods from both Food3 and Pizza3
 *
 * The purpose of this program is to print three lines with the type of food
 * cost of food, number of the food item sold and how the food is prepared
 * 
 * Working on:
 * 1. Inheritance and subclasses
 * 2. Using methods from other classes
 * 3. Initializing and creating an instance of classes to call methods
 */
 
 public class DeepDishPizza3 extends Pizza3
 {
	 public DeepDishPizza3()
	 {
	 }
	 
	 public DeepDishPizza3(String ingredientIn3)
	 {
		  super(ingredientIn3, "deep dish pizza", 8, 250);		//Call overloaded constructor of parent class Pizza, and pass in appropriate parameters 
	 }
 }

