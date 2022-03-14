package classes.dinner;

public class Dinner {
	public static void main(String[] args) {
		Person p = new Person("Carlos", 66.4);
		Food f1 = new Food("Bread", 0.1);
		Food f2 = new Food("Meat", 0.3);
		
		System.out.println(p.weight);
		
		p.eat(f1);
		p.eat(f2);
		
		System.out.println(p.weight);
	}
}
