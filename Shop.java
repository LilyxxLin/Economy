package WorldEconomy;

import java.util.ArrayList;

public class Shop extends Entity {
	private static int totalNumShop = 0;
	//private String name; inherited from Entity
	private ArrayList<Thing> thingArray; // what about an arrayList of an arrayList???
	//private double totalAsset; // money or money+thing*Price
	
	//constructor
	public Shop(String shopName){ // if we only want one shop this is what it should look like??
	    super.name = shopName;
	    Car cars = new Car(10);
	    Book books = new Book(20);
	    Carrot carrots = new Carrot(100);
	    thingArray. add(cars,books,carrots);
		totalNumShop++;
	}
	//accesor methods
	public ArrayList<Thing> getThingArray(){
		return thingArray;
	}
	
	public boolean enoughItem(String thing, double quantity){
		int itemIndex = super.getItemIndex (thing);
		if (itemIndex>=0){  // if the item is found
			return Thing[itemIndex].getQuantity()>=quantity;
		}else { // if getItemIndex returns -1;
			System.out.println(this.getName()+ " does not have the item that you are looking for... sorry :(");
			return false; // or prompt the user to retype???
		}
	}

}
