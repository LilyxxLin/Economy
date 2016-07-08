package WorldEconomy;

public class Thing {  // Cargo 还有什么别的characteristics 吗？？
	private String name;
	private double price;
	private int quantity;
	
	public Thing(String n, double p, int q){
		name = n;
		price = p;
		quantity = q;
	}


	public Thing() {
		// TODO Auto-generated constructor stub
	}
		
	public double getPrice(){
		return price;
	}


	public int getQuantity() {
		return quantity;
	}
	

	}
}