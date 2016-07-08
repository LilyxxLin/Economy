package WorldEconomy;

import java.util.ArrayList;

public class Person {
	private static int numPeople = 0;

	private String name;
	private ArrayList<Thing> thingArray;
	private ArrayList<Account> accountArray; // account has money
	private double cash;
	// entity superclass??
	
	public Person(String n, double c){
		name = n;
		cash = c;
		thingArray = new ArrayList<Thing>();
		accountArray = new ArrayList<Account>();
		numPeople++;
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
