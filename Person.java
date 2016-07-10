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
		numPeople++;
	}


	public void buy(CanBuy from, String thingStr, double quantity, Account buyerAccName, Account sellerAccName){ //if accname == null then cash
		double pricePaid = quantity * thingArray[Thing.getIndex(thingStr)].getPrice();
		
		if(enoughItem(thingStr, quantity) && enoughMoney(buyerAccName, pricePaid)){
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
			System.out.println(getName() + " bought " + thingStr + quantity + " from " + from.getName());
		}else
			System.out.println("Error. Transaction could not be processed. Please try again!");
	}


	public boolean enoughMoney(Account accname, double quantity){ // if accname==null, the check cash
		if (accname == null){  // can do this/?
			return super.getCash() >= quantity;
		} else{  // find the account; return exception if account not; then compare the amount in the account
			return accname.getBalance()>=quantity;
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
}
