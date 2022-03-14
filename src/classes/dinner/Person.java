package classes.dinner;

public class Person {
	String name;
	double weight;
	
	Person(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	void eat(Food food) {
		if ( food != null) {
			weight += food.weight;			
		}
	}
}
