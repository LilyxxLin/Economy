package worldEconomy;

public class Book extends Thing {
	private static final double PRICE = 5.0;

  //constructor
  public Book(Double quantity){
    super ("Book",PRICE, quantity);
  }

}
