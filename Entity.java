package WorldEconomy;
import java.util.ArrayList;

public class Entity{ 
  // do we want to make this class abstract
  private String name;
  //private double totalAsset;
  private double cash;
  // private ArrayList<Account> accountArray; do we really want this to be in entity??
  public static final String[] DICTIONARY = {"car", "book", "carrot"};
  
  
  public Entity(){
    this.name = "";
    this.cash = 0.0;
    ArrayList<Account> = new ArrayList<Account>();  // or null??
  }
  //constructor
  public Entity(String name, double cash){
      this.name = name;
      this.cash = cash;
      ArrayList<Account> = new ArrayList<Account>();  // or null??
  }
  
  public int getItemIndex (String s){ //returns index that corresponds to the string, and -1 if not found
    for (int i = 0; i < DICTIONARY.length; i++)
      if(s[i].toLowerCase().equals(s))
        return i;
    return -1;
  }
  //accessor
  public String getName(){
    return this.name;
  }
  public double getCash(){
    return this.cash;
  }
  
  public void changeCash(double amount){
    cash += amount;
  }
  
  public void exchangeItem(String thing, double quantity){
    int itemIndex = super.getItemIndex (thing);
	this.Thing[itemIndex].changeQuantity(double quantity)
	}
}
