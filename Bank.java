package worldEconomy;
import java.util.ArrayList;

public class Bank extends Entity{  //implements Account??  // implements transactions
	private static final int[] ACCOUNTNOS = new int[10];
	
	static { // method run at compile time, hence no name or input
		for(int i = 0; i < ACCOUNTNOS.length; i++)
			ACCOUNTNOS[i] = 100001 + i;
	}
	
	private static int numAccounts = 0; //keep track of the total number of accounts created by this bank
	//private ArrayList<Entity> customers; do we really want a customer arrayList?
	
	// constructor
	public Bank(String bankName, double cash){
		super(bankName, cash);
		// 10 subject to change: I said 10 just so that we can test the program when we run out of account numbers
		
	}
	
	//accessor methods

	
	//createAccount() method: assign an id number to the newly created account
	
	public Account createAccount(String accname, String ownername, double quantity){
	    String bankname = this.getName();
	    if (numAccounts< ACCOUNTNOS.length){
	    	    int id = ACCOUNTNOS[numAccounts]; 
	    	    Account newAcc = new Account (id, accname, ownername, bankname, quantity);
	    	    accountArray.add(newAcc); //add this new account to the 
	    	    //customers.add(this) do we want this method??
	    	    System.out.println("A new account " + accname + " has been created at bank " + getName());
	    	    numAccounts++;
    	    return newAcc;
	    }
	    else{
	        System.out.println("This bank cannot create anymore accounts, please try at another bank :)");
	        return null;
	        // this is silly but you get the idea
	    }
	}
	
		
}

