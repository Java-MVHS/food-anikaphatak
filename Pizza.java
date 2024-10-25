/*
 * Anika Phatak
 * Period 5
 * 10/23/2024
 * Pizza.java
 */
 
 public class Pizza extends Food		//Use keyword extends because Pizza is a subclass of Food
 {
 	 //Declare field variable topping and name2 to store
 	 //the pizza's topping and the pizza's name
 	 
	 protected String topping;
	 protected String name2;
	
	 public Pizza()
	 {
	 	topping = "pineapple";		//initialize field variables in the default constructor of Pizza
	 	name2 = "Pizza";
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
