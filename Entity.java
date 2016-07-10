package worldEconomy;
import java.util.*;

public abstract class Entity implements Transactionable{ // abstract because we never want to instantiate this class
	private String name;
	//private double totalAsset;
	private double cash;
	protected ArrayList<Account> accountArray;
	
	public Entity(String name, double cash){ // constructor
		this.name = name;
		this.cash = cash;
		accountArray= new ArrayList<Account>();
	}
	
	//accessor
	public String getName(){
		return this.name;
	}
	public double getCash(){
		return this.cash;
	}
  
	public void changeCash(double amount){
		this.cash += amount;
	}
	
}
