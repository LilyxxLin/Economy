package WorldEconomy;
import java.util.ArrayList;

public class Bank extends Entity{  //implements Account??  // implements transactions
	private static double totalMoney;
	private static int[] FINAL ACCOUNTNOS;  // is this the correct order for final??
	private static int numAccounts; //keep track of the total number of accounts created by this bank
	//private ArrayList<Entity> customers; do we really want a customer arrayList?
	private ArrayList<Account> accountArray;
	
	// constructor
	public Bank (String bankName){
		super.name = bankName;
		accountArray = null; 
		customers = null;
		ACCOUNTNOS = int[10]; 
		// 10 subject to change: I said 10 just so that we can test the program when we run out of account numbers
		for (int i = 0; i < ACCOUNTNOS.length, i++)
			int[i] = i;
	}
	
	//accessor methods
	public String getName(){
		super.getName;
	}
	
	public double getTotalMoney(){
		return totalMoney;
	}
	
	//createAccount() method: assign an id number to the newly created account
	
	public Account createAccount(String accname, String ownername, double quantity){
	    String bankname = this.getName();
	    if (numAccounts< ACCOUNTNOS.length){
    	    int id = ACCOUNTNOS[numAccounts]; 
    	    Account newAcc = new Account (accname, ownername, bankname, quantity, id);
    	    accountArray.add(newAcc); //add this new account to the 
    	    //customers.add(this) do we want this method??
    	    return newAcc;
	    }
	    else{
	        System.out.println("This bank cannot create anymore accounts, please try at another bank :)")
	        // this is silly but you get the idea
	    }
	}
	
		
}

