package worldEconomy;

public class Car extends Thing{
  
	private static final double PRICE = 300;
  
//constructor
  public Car(Double quantity){
	  super ("Car", PRICE , quantity);
	  System.out.println(quantity + " cars has been created. Each car is worth " + PRICE + "dollars.");

  }
}
