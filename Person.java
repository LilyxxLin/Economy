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
	public void buy(Entity from, String thingType, double quantity, Account accname){ //if accname == null then cash
		
		if(enoughItem(thingType, quantity) && enoughMoney(accname, quantity))
		{
			int pricePaid = quantity * thingArray[getItemIndex(thingType)].getPrice();
			if(accname == null)
			{
				this.subtractCash(pricePaid);
				this.addCash(pricePaid)
			}	
			else //catch exception if accname is not valid
			{
				this.withdraw(pricePaid);
				from.deposit(pricePaid);
			}
				
		}
		else
			System.out.println("Error. Transaction could not be processed. Please try again!")
		
	}
	
	public void deposit (Account accname, double quantity){ // what is the appropriate return type?
		accname.changeBalance(quantity);
	}
	
	public void withdraw(Account accname, double quantity){
		if(accname.getBalance - quantity) < 0)
			System.out.println("Amount attempted to be withdrawn exceeds balance");
		else
			accname.changeBalance(quantity * -1);//What is the appropriate return type>>
		
	}
	
	public void openAccount (Bank bankname, String accname, double initialDeposit){
		Account newAcc = bankname.createAccount(accname, this.getName(), initialDeposit);
		this.accountArray.add(newAcc);
	}
	


	
}
