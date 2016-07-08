package WorldEconomy;

import java.util.ArrayList;

public class Person extends Entity{
	private static int numPeople = 0;

	//inherited from Entity: private String name;
	private Thing[] thingArray;
	private ArrayList<Account> accountArray; // account has money
	//inherited from Entity private double cash;
	// entity superclass??
	
	//Constructor
	public Person(String n, double c){
		name = n;
		cash = c;
		thingArray = {Car,Book,Carrot}; //the thing array is the same for all; do we want to construct all these classes??
		accountArray = new ArrayList<Account>();
		numPeople++;
	}
	
	//buy method
	public void buy(Entity from, String thingType, int quantity, Account accname){ //if accname == null then cash
		
	}
	
	deposit (Bank bankname, Account accname, double quantity){
		
	}

	
	public void buyFromShop (Shop s, Thing t, String paymentMethod){ // payment: cash/ account
		//boolean transactionDone = false;
		// check availability
		ArrayList<Thing> thingArrayOfShop = s.getThingArray();
		int index = thingArrayOfShop.indexOf(t); //can I do this???
		double quantityInShop = thingArrayOfShop.get(index).getQuantity();
		//Thing thing = thingArray.get(index);  // any other way to do this??
		boolean available = quantityInShop>=t.getQuantity();
		// calculate cost
		double cost = t.getPrice()*t.getQuantity();
		//money --
		
		//thing++
		if (paymentMethod.equals("Cash")){
			//check money
			boolean richEnough = this.cash>cost; 


		}
		else{ // if payment = account
			//check money

		}
		// shop.sell()??
		
	}
	// Constructor

	
	//
}
