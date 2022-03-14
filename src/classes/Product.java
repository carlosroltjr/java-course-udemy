package classes;

public class Product {
	private String name;
	private double price;
	static double disccount = 0.25;
	
	public Product() {
	
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double priceWithDisccount() {
		return price * (1 - disccount);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
