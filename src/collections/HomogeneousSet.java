package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HomogeneousSet {
	public static void main(String[] args) {
		SortedSet<String> names = new TreeSet<>();
		names.add("Gabi");
		names.add("Carlos");
		names.add("Eren");
		
		for  (String name : names) {
			System.out.println(name);
		}
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(15);
		numbers.add(9);
		
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
