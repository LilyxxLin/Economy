package WorldEconomy;

public class Thing{
	private String name;
	private double price;
	private int quantity;
	
	public Thing(String n, double p, int q){ // constructor
		this.name = n;
		this.price = p;
		this.quantity = q;
	}

	public double getPrice(){ // accessor
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}
	//change the quantity of the item in the list
	public void changeQuantity(int quantityChanged){
		this.quantity += quantityChanged;
	}

}
