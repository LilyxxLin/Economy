package worldEconomy;

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
		this(id, accn, ownern, bankn, 0.0);
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
	
	public void changeBalance(double quantity){
		this.balance += quantity;
	}
	
	public void transferTo(Account toAcc, double quantity){
		if(this.balance < quantity){
			System.out.println("Insufficient balance; transfer unsuccessful.");
		} else{
			this.balance -= quantity; // password??? method changeBalance()
			toAcc.balance += quantity;
		}
		System.out.println(quantity + "dollars were transferred from " + this.getName()+ " to " + toAcc.getName());
	}
	
	public void printAccountStatus(){
		System.out.println(this.getAccName() + " of " + this.getBankName() 
		+ "(id: " + id + ") currently has " + balance + " dollars in it.");
	}
}
