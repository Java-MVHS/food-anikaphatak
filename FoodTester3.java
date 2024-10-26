/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 * FoodTester3.java
 * 
 * FoodTester3 contains the main method to run all the classes - Food3, Pizza3, DeepDishPizza3
 *
 * The purpose of this program is to print three lines with the type of food
 * cost of food, number of the food item sold and how the food is prepared
 * 
 * Working on:
 * 1. Inheritance and subclasses
 * 2. Using methods from other classes
 * 3. Initializing and creating an instance of classes to call methods
 * 	
 */
 
 public class FoodTester3 
 {
	 public FoodTester3() 
	 {
	 }
	 
	 public static void main(String[] args)
	 {
		FoodTester3 ft = new FoodTester3();		//Create an instance of FoodTester3 to call the method blankLines 
		ft.blankLines();						//call blankLines
		
		//Create and initialize an instance of the class Food and call the method printForSale() in food using the instance
		Food3 food1 = new Food3 ("baked", "bananas", "muffins", 12, 50);	
		food1.printForSale();
		Food3 food2 = new Food3 ("fried", "yams", "fritters", 3, 100);
		food2.printForSale();
		
		//Create and initialize an instance of the class Pizza, and call the method printForSale() using the instance
		//Pizza has the method printForSale because it is a subclass of Pizza, it inherited the method
		Pizza3 pizza = new Pizza3 ("anchovies", 8, 250);
		pizza.printForSale();
		
		DeepDishPizza3 pizza2 = new DeepDishPizza3("anchovies");
		pizza2.printForSale();
		
		ft.blankLines();		//Call blankLines to print 3 blankLines at the end
	}
	
	public void blankLines()		//Method to print 3 blank lines at the beginning and end
	{
		System.out.print("\n\n\n");
	}
 }	    
