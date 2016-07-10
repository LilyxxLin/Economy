package worldEconomy;

public class Main{
	public static void main (String[] args){
		try {
			// setup
			Shop nasties = new Shop("Bear Necessities");
			Shop cornellstore = new Shop("Cornell Store");
			Person alice = new Person("Alice", 1000);
			Person lucas = new Person("Lucas", 1000);
			Person lily = new Person("Lily", 1000);
			Bank tompkins = new Bank("Tompkins Trust Company", 10000.0);
			Bank boa = new Bank("Bank of America", 50000.0);
			
			// test
			Account nastiesAcc1 = nasties.openAccount(tompkins, "Bear Necessities' Account 1", 5000);
			Account aliceAcc1 = alice.openAccount(tompkins, "Alice's Account 1", 800);
			lily.buy(nasties, "Carrot", 50, null, null); 
			lily.buy(nasties, "Moon", 50, null, null); // exceptional
			Account lucasAcc1 = lucas.openAccount (tompkins, "Lucas' Account 1", 100);
			alice.buy(lily, "Book", 2, aliceAcc1, lucasAcc1); // should return error message...
			lucas.deposit (lucasAcc1, 300); 
			lucas.buy (nasties, "Car", 2, lucasAcc1, nastiesAcc1);
		}
		catch(NullPointerException E)
		{
			System.out.println("Sorry, more accounts can't be created Our account limit of 2 has been exceeded.");
		}
	}

}
