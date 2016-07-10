package worldEconomy;

public class Main {
	public static void main (String[] args){
		// setup
		Person alice = new Person ("Alice", 1000);
		Person lucas = new Person ("Lucas", 1000);
		Person lily = new Person("Lily", 1000);
		Shop nasties = new Shop ("Bear Necessities");
		Bank tompkins = new Bank ("Tompkins Trust Company", 10000.0);
		
		// test
		Account nastiesAcc1 = nasties.openAccount(tompkins, "Bear Necessities' Account 1", 5000);
		Account aliceAcc1 = alice.openAccount(tompkins, "Alice's Account 1", 800);
		lily.buy(nasties, "Carrot", 50, null, null); 
		//toString: lily (uses cash) buys 50 carrots from BearNecessity (receives cash)
		Account lucasAcc1 = lucas.openAccount (tompkins, "Lucas' Account 1", 100);
		alice.buy(lily, "Book", 2, aliceAcc1, lucasAcc1); // should return error message...
		lucas.deposit (lucasAcc1, 300); 
		//toString should print out amount of money before and after deposit
		lucas.buy (nasties, "Car", 2, lucasAcc1, nastiesAcc1);
		// this should print an error message --> not enough money



	}

}
