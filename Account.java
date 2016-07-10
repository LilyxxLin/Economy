package WorldEconomy;

public class Account {
	private int idNumber;
	private String ownerName;
	private String bankName;
	private double balance;  // type currency??? default unit: US dollar

	// constructor
	public Account(int id, String accn, String ownern, String bankn, double initialDeposit){
		this.idNumber = id;
		this.ownerName = ownern;
		this.bankName = bankn;
		this.balance = initialDeposit;
	}
	// default constructor
	public Account(int id, String accn, String ownern, String bankn){
		this.idNumber = id;
		this.ownerName = ownern;
		this.bankName = bankn;
		this.balance = 0.0;
	}

	//accessors
	public int getIDNumber(){
		return this.idNumber
	}
	public String getOwnerName(){
		return this.ownerName;
	}
	public String getBankName(){
		return this.bankName;
	}
	public double getBalance(){
		return this.balance;
	}

}
