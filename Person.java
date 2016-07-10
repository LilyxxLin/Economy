package worldEconomy;

import java.util.ArrayList;

public class Person extends CanBuy{
	private static int numPeople = 0;

	//inherited from Entity: private String name;
	private Thing[] thingArray;
	private ArrayList<Account> accountArray; // account has money

	// dictionary should be in superclass entity;
	//inherited from Entity private double cash;

	//Constructor
	public Person(String n, double c){
		super(n, c);
		thingArray = new Thing[Thing.DICTIONARY.length];
		thingArray[0] = new Car(0.0);
		thingArray[1] = new Book(0.0);
		thingArray[2] = new Carrot(0.0);
		System.out.println("A person " + getName() + " is created :)");
		printPersonStatus();
		numPeople++;
	}


	public void buy(CanBuy from, String thingStr, double quantity, Account buyerAccName, Account sellerAccName){ //if accname == null then cash
		if(enoughItem(thingStr, quantity) && enoughMoney(buyerAccName, quantity * thingArray[Thing.getIndex(thingStr)].getPrice())){
		double pricePaid = quantity * thingArray[Thing.getIndex(thingStr)].getPrice();
		System.out.println(getName() + " wants to buy " + quantity + thingStr + " from " + from.getName());
		this.enoughItem(thingStr, quantity);
		this.enoughMoney(buyerAccName, pricePaid);// these two lines are used to print out the error message
			if(buyerAccName == null && sellerAccName == null){
				this.changeCash(pricePaid*-1);
				from.changeCash(pricePaid);
			}
			else{ //catch exception if accname is not valid
				buyerAccName.transferTo(sellerAccName, pricePaid);
			}
			int index = Thing.getIndex(thingStr);
			this.thingArray[index].changeQuantity(quantity);
			from.thingArray[index].changeQuantity(-quantity);
			System.out.println("Transaction succeeded!");
		}else
			System.out.println("Transaction failed due to insufficient money or thing.");
	}


	public boolean enoughMoney(Account accname, double quantity){ // if accname==null, the check cash
		if (accname == null){
			if (super.getCash()<quantity){
				System.out.println(this.getName() + " does not have enough cash for the transaction.");
				return false;
			}else
				return true;
		} else{
			if (accname.getBalance()<quantity){
				System.out.println(this.getName() + " does not have enough money in the account.");
				return false;
			}else
				return true;
		}
	}
	
	public boolean enoughItem(String thingStr, double quantity){
		{
			int index = Thing.getIndex(thingStr);
			if (index>=0){  // if the item is found
				return this.thingArray[index].getQuantity()>=quantity;
			}else { // if getItemIndex returns -1;
				System.out.println(this.getName()+ " does not have the item that you are looking for... sorry :(");
				return false; // or prompt the user to retype???
			}
		}
	}
	
	public void printPersonStatus(){
		System.out.println(this.getName + " has " + this.getCash + " of cash.");
		for (int i = 0; i < thingArray.length; i++){
			thingArray[i].printThingStatus();
		}
		
	}
}
