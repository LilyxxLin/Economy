package worldEconomy;

public class Thing{
	private String name;
	private double price;
	private double quantity;
	public static final String[] DICTIONARY = {"car", "book", "carrot"};

	public Thing(String n, double p, double q){ // constructor
		this.name = n;
		this.price = p;
		this.quantity = q;
	}
	
	public static int getIndex(String s){ //returns index that corresponds to the string, and -1 if not found
		for (int i = 0; i < DICTIONARY.length; i++)
			if(s.toLowerCase().equals(DICTIONARY[i]))
				return i;
		return -1;
	}

	public double getPrice(){ // accessor
		return this.price;
	}
	public double getQuantity() {
		return this.quantity;
	}
	//change the quantity of the item in the list
	public void changeQuantity(double quantityChanged){
		this.quantity += quantityChanged;
	}
	
	public void printThingStatus(){
		System.out.println(this.quantity + " " + this.getName() + ". Each " + this.getName() + " is worth " + this.getPrice());
	}

}
