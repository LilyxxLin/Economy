package WorldEconomy;

public class Account {
	private int idNumber;
	private String ownerName;
	private String bankName;
	private double balance;  // type currency??? default unit: US dollar

	//accessors
	public int getIDNumber(){
		return idNumber
	}

	public String getOwnerName(){
		return ownerName;
	}
	public String getBankName(){
		return bankName;
	}
	public double getBalance(){
		return balance;
	}
	
	// constructor
	public Account(int id, String accn, String ownern, String bankn, double initialDeposit){
		idNumber = id;
		ownerName = ownern;
		bankName = bankn;
		balance = initialDeposit;
	}
	// default constructor
	public Account(int id, String accn, String ownern, String bankn){
		idNumber = id;
		ownerName = ownern;
		bankName = bankn;
		balance = 0.0;
	}

}
