package worldEconomy;

import java.util.ArrayList;

public class CanBuy extends Entity{
	protected Thing[] thingArray;
	private ArrayList<Account> accountArray;
			
	public CanBuy(String name, double cash){
		super(name,cash);
		thingArray = new Thing[Thing.DICTIONARY.length];
		accountArray = new ArrayList<Account>();
	}

	public boolean enoughItem(String thingStr, double quantity){
		int index = Thing.getIndex(thingStr);
		if (index>=0){  // if the item is found
			return thingArray[index].getQuantity()>=quantity;
		}else { // if getItemIndex returns -1;
			System.out.println(this.getName()+ " does not have the item that you are looking for... sorry :(");
			return false; // or prompt the user to retype???
		}
	}
	public void deposit (Account accname, double quantity){ // what is the appropriate return type?
		if (this.getCash() >= quantity){
			accname.changeBalance(quantity); 
			this.changeCash(quantity*-1);
			System.out.println(this.getName() + " deposited " + quantity + " dollars to" + accname.getAccName());
		}else
			System.out.println("Amount attempted to be deposited exceeds cash.");
		
	}
	
	public void withdraw(Account accname, double quantity){
		if(accname.getBalance() - quantity < 0)
			System.out.println("Amount attempted to be withdrawn exceeds balance");
		else{
			accname.changeBalance(quantity * -1);//What is the appropriate return type>>
			this.changeCash(quantity);
			System.out.println(this.getName() + " withdrew " + quantity + " dollars from" + accname.getName());
		}
	}
	
	public Account openAccount(Bank bankName, String accName, double initialDeposit){
		Account newAcc = bankName.createAccount(accName, this.getName(), initialDeposit);
		this.accountArray.add(newAcc);
		return newAcc;
	}

}
