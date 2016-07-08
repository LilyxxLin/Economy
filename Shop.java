package WorldEconomy;

import java.util.ArrayList;

public class Shop extends Entity {
	private static int totalNumShop = 0;
	private String name;
	private ArrayList<Thing> thingArray; // what about an arrayList of an arrayList???
	private double totalAsset; // money or money+thing*Price
	
	public Shop(){
		totalNumShop++;
	}
	
	public ArrayList<Thing> getThingArray(){
		return thingArray;
	}
	
	public boolean isAvailable(Thing t, double amount){
		return// the length of the arrayList of object that we are looking for
	}
	

}
