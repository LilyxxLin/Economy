package WorldEconomy;

public class Thing {
	private String name;
	private double price;
	private int quantity;
	
	//constructor
	public Thing(String n, double p, int q){
		name = n;
		price = p;
		quantity = q;
	}
    //accesor methods
	public double getPrice(){
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	//change the quantity of the item in the list
	public void changeQuantity(double quantityChanged){
		quantity = quantity + quantityChanged;
	}

	}
}
