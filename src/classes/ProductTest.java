package classes;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product("pen", 26.5);
		System.out.println(p1.priceWithDisccount());
		Product.disccount = 0.5;
		System.out.println(p1.priceWithDisccount());
	}
}
