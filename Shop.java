package worldEconomy;

import java.util.ArrayList;

public class Shop extends CanBuy {
	private static int totalNumShop = 0;
	//private String name; inherited from Entity
	private Thing[] thingArray;
	//private double totalAsset; // money or money+thing*Price
	private ArrayList<Account> accountArray; // account has money

	
	//constructor
	public Shop(String shopName){ // if we only want one shop this is what it should look like??
		super(shopName, 0.0);
		thingArray = new Thing[Thing.DICTIONARY.length];
		thingArray[0] = new Car(2.0);
		thingArray[1] = new Book(20.0);
		thingArray[2] = new Carrot(100.0);
		// open account method and add an account in to the arrayList
		System.out.println(shopName + " has been created!");
		printShopStatus();
		totalNumShop++;
	}
	//accessor methods
	public Thing[] getThingArray(){
		return thingArray;
	}
	
	public void printShopStatus(){
		System.out.println("Shop " + this.getName() + " has the following things:");
		for (int i = 0; i < thingArray.length; i++){
			thingArray[i].printThingStatus();
		}
	}
}
