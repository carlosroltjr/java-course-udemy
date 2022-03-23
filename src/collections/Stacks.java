package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
	public static void main(String[] args) {
		Deque<String> spells = new ArrayDeque<>();
		
		spells.push("1- Opt");
		spells.push("2- Shock");
		spells.push("3- Spell pierce");
		
		System.out.println(spells.peek());
		System.out.println(spells.element());
		
		System.out.println(spells.pop());
		System.out.println(spells.poll());
		System.out.println(spells.pop());
		System.out.println(spells.poll());
		System.out.println(spells.pop());
	}
}
