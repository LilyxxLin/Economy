package worldEconomy;

public class Carrot extends Thing{
	private static final double PRICE = 2.0;

//constructor
  public Carrot(Double quantity){
	  super ("Carrot",PRICE, quantity);
	  System.out.println(quantity + " carrots has been created. Each carrot is worth " + PRICE + "dollars.");

  }
}
