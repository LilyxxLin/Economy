package WorldEconomy;

public class Account {
	private int idNumber;
	private String accName;
	private String ownerName;
	private String bankName;
	private double balance;  // type currency??? default unit: US dollar

	public Account(int id, String accn, String ownern, String bankn, double initialDeposit){ // constructor
		this.idNumber = id;
		this.accName = accn;
		this.ownerName = ownern;
		this.bankName = bankn;
		this.balance = initialDeposit;
	}
	public Account(int id, String accn, String ownern, String bankn){ // default constructor
		this.idNumber = id;
		this.accName = accn;
		this.ownerName = ownern;
		this.bankName = bankn;
		this.balance = 0.0;
	}

	public int getIDNumber(){ //accessor
		return this.idNumber;
	}
	public String getAccName(){
		return this.accName;
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
	
	public void transferTo(Account toAcc, double quantity){
		if(this.balance < quantity){
			System.out.println("Insufficient balance; transfer unsuccessful.");
		} else{
			this.balance -= quantity; // password??? method changeBalance()
			toAcc.balance += quantity;
		}
	}
}
