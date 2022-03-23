package collections;

import java.util.HashSet;
import java.util.Set;

public class HeterogeneousSet {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(1.2); // double -> Double
		set.add(true); // boolean -> Boolean
		set.add("test"); // String
		set.add(3); // int -> Integer
		set.add('x'); // char -> Character
		
		System.out.println("The size is: " + set.size());
		
		set.add("Test");
		set.add('x'); // don't accept duplicates
		
		System.out.println("The size is: " + set.size());
		
		System.out.println(set.remove("test"));
		System.out.println(set.remove(4));
		System.out.println(set.remove('x'));
		
		System.out.println("The size is: " + set.size());
		
		System.out.println(set.contains('x'));
		System.out.println(set.contains(1.2));
		
		Set numbers = new HashSet();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println(set);
		System.out.println(numbers);
		
		set.addAll(numbers); // Union
		System.out.println(set);
		
		set.retainAll(numbers); // Intersection
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
	}
}
