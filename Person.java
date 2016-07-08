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
	
	public void deposit (Bank bankname, Account accname, double quantity){ // what is the appropriate return type?
		
	}
	
	public void withdraw(Bank bankname, Account accname, double quantity){ //What is the appropriate return type>>
		
	}
	
	public Account openAccount (Bank bankname, String accname, double initialDeposit){
		
	}
	
	public boolean enoughMoney(String paymentMethod, double quantity){
		
	}
	
	public boolean enoughIten(String thing, double quantity){
		
	}

	
}
