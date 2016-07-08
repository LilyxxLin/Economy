package WorldEconomy;
// do we want a transaction class?? NO
public class Transaction {
	
	private Person buyer;
	private Person seller;
	private Thing thing;
	private Money worth;
	
	public Transaction(Person b, Person s, Thing c, Money w)
	{
		buyer = b;
		seller = s;
		thing = c;
		worth = w;
	}
	
	
	// should I do a transact method or make them into buy and sell methods??
	public boolean transact(){ 
		boolean done = true;
		try{
			
		}catch(Exception e){
			System.out.println("Transaction failed:( try again later!");
			done = false;
		}
		// move the cargo from seller to buyer
		//move the money from buyer to seller
		//print to screen/file the transaction
		return done; // if transaction worked so that it can proceed
	}

}
