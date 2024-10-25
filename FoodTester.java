/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 */
 
 public class FoodTester 
 {
	 public FoodTester() 
	 {
	 }
	 
	 public static void main(String[] args)
	 {
	    FoodTester ft = new FoodTester();		//Create an instance of FoodTester3 to call the method blankLines 
		ft.blankLines();					//call blankLines
		
		//Create and initialize an instance of the class Food and call the method printForSale() in food using the instance
		Food food1 = new Food ("baked", "bananas", "muffins");	
		food1.printForSale();
		Food food2 = new Food ("fried", "yams", "fritters");
		food2.printForSale();
		
		//Create and initialize an instance of the class Pizza, and call the method printForSale() using the instance
		//Pizza has the method printForSale because it is a subclass of Pizza, it inherited the method
		Pizza pizza = new Pizza ("pepperoni");
		pizza.printForSale();
		
		//Create and initialize an instance of the class DeepDishPizza and call the method printForSale() using the instance
		//DeepDishPizza has the method printForSale because it is a subclass of pizza which is a subclass of Food
		DeepDishPizza pizza2 = new DeepDishPizza("pepperoni"); 		
		pizza2.printForSale();
		
		ft.blankLines();		//Call blankLines to print 3 blankLines at the end
	}
	
	public void blankLines()		//Method to print 3 blank lines at the beginning and end
	{
		System.out.print("\n\n\n");
	}
 }	    	    
