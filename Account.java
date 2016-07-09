package WorldEconomy;

public class Account {
	private String accname;
	private String ownerName;
	private String bankName;
	private double quantity;  // type currency??
	private int idNumber;

	//accessor methods
	public double getQuantity(){
		return quantity;
	}
	public String getAccName(){
		return accname;
	}
	public String getBankName(){
		return bankName;
	}
	
	//constructor method
	public Account(String an, String on, String bn, double q, int id){
	    accname = an;
	    ownerName = on;
	    bankName = bn;
	    quantity = q;
	    idNumber = id;
	}

	
}
