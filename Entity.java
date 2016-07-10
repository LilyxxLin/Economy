package WorldEconomy;
import java.util.ArrayList;

public abstract class Entity implements Transactionable{ // abstract because we never want to instantiate this class
	private String name;
	//private double totalAsset;
	private double cash;
	private ArrayList<Account> accountArray;
	public static final String[] DICTIONARY = {"Car", "Book", "Carrot"};
	
	public Entity(String name, double cash){ // constructor
		this.name = name;
		this.cash = cash;
		ArrayList<Account> = new ArrayList<Account>();
	}
	public Entity(){ // default constructor
		Entity("", 0.0);
	}

	public int getThingIndex(String s){ //returns index that corresponds to the string, and -1 if not found
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
		this.cash += amount;
	}
	public void changeThingQuantity(String thing, double quantityChanged){
		int thingIndex = super.getThingIndex(thing);
		this.Thing[thingIndex].changeQuantity(double quantity);
	}
}
