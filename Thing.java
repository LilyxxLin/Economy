package WorldEconomy;

public class Thing {
	private String name;
	private double price;
	private int quantity;
	
	public Thing(String n, double p, int q){
		name = n;
		price = p;
		quantity = q;
	}
	
	public Thing() { // do we want a default at all??
	}
		
	public double getPrice(){
		return price;
	}


	public int getQuantity() {
		return quantity;
	}
	

	}
}
