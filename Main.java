package WorldEconomy;

public class Main {
  public static void main (String[] args){
    //construct the initial setup
    setup();
    Account aliceAcc1 = alice.openAccount (TompkinsTrustCompany, "aliceAccount1", 800);
    lily.buy (BearNecessities, "Carrot", 50, null, null); //toString: lily (uses cash) buys 50 carrots from BearNecessity (reveices cash)
    Account lucasAcc1 = lucas.openAccount (TompkinsTrustCompany, "LucasAcc1", 100);
    alice.buy (lily, "Book", 2, aliceAccount1, null, aliceAcc1);  // should return error message...
    lucas.deposit (lucasAcc1, 300); //toString should print out the current account
    
    
    
  }
  
  public static void setup (){
    Person alice = new Person ("Alice", 1000);
    Person lucas = new Person ("Lucas", 1000);
    Person lily = new Person("Lily", 1000);
    Shop BearNecessities = new Shop ("Bear Necessities");
    Bank TompkinsTrustCompany = new Bank ("Tompkins Trust Company");
  }
  
  public static 

}
