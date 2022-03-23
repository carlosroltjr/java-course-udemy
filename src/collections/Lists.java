package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>(); // ordered
		
		User u1 = new User("Gabi");
		
		users.add(u1);
		users.add(new User("Reiner"));
		users.add(new User("Eren"));
		users.add(new User("Sasha"));
		users.add(new User("Bertolt"));
		users.add(new User("Bertolt")); // accept duplicates
		
		System.out.println(users.get(2)); // index access
		
		System.out.println(users.remove(4));
		System.out.println(users.remove(new User("Bertolt")));
		System.out.println(users.remove(new User("Sasha")));
		
		System.out.println(users.contains(new User("Eren"))); // doesn't work without equals in User class
		System.out.println(users.contains(u1)); // reference exists in memory
		
		for (User user : users) {
			System.out.println(user.name);
		}
	}
}
