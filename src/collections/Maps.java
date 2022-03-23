package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> users = new HashMap<>();
		
		users.put(1, "Carlos");
		users.put(1, "Carlos");
		
		System.out.println(users.size());
		
		users.put(1, "Gabi");
		
		System.out.println(users);
		
		users.put(2, "Eren");
		users.put(3, "Reiner");
		users.put(98, "Anna");
		
		System.out.println(users.isEmpty());
		System.out.println(users.keySet());
		System.out.println(users.values());
		System.out.println(users.entrySet());
		System.out.println(users.containsKey(98));
		System.out.println(users.containsValue("Eren"));
		System.out.println(users.get(1));
		
		for (int key : users.keySet()) {
			System.out.println(key);
		}
		
		for (String value : users.values()) {
			System.out.println(value);
		}
		
		for (Entry<Integer, String> registry : users.entrySet()) {
			System.out.println(registry.getKey());
			System.out.println(registry.getValue());
		}
	}
}
