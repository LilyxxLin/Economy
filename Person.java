package WorldEconomy;

import java.util.ArrayList;

public class Person extends Entity{
	private static int numPeople = 0;

	//inherited from Entity: private String name;
	private Thing[] thingArray;
	private ArrayList<Account> accountArray; // account has money
	
	// dictionary should be in superclass entity;
	//inherited from Entity private double cash;

	//Constructor
	public Person(String n, double c){
		super(n, c);
		thingArray = {new Car(), new Book(), new Carrot()};
		accountArray = new ArrayList<Account>();
		numPeople++;
	}
	
	
	public boolean enoughMoney(Account accname, double quantity){ // if accname==null, the check cash
		if (accname == null){  // can do this/?
			return super.getCash() >= quantity;
		} else{  // find the account; return exception if account not; then compare the amount in the account
			return accname.getQuantity()>=quantity;
		}
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
	
	
	//buy() method
	public void buy(Entity from, String thingType, int quantity, Account accname){ //if accname == null then cash
		if()
		
	}
	
	public void deposit (Bank bankname, Account accname, double quantity){ // what is the appropriate return type?
		
	}
	
	public void withdraw(Bank bankname, Account accname, double quantity){ //What is the appropriate return type>>
		
	}
	
	public Account openAccount (Bank bankname, String accname, double initialDeposit){
		
	}
	


	
}
