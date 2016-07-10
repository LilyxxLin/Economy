package WorldEconomy;

public class Main {
  public static void main (String[] args){
    //construct the initial setup
    setup();
    
  }
  
  public static void setup (){
    Person alice = new Person ("Alice", 1000);
    Person lucas = new Person ("Lucas", 1000);
    Person lily = new Person("Lily", 1000);
    Shop shop1 = new Shop ("Bear Necessity");
    Bank bank1 = new Bank ("Tompkins Trust Company");
  }

}
