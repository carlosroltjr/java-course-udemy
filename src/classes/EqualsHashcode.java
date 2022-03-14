package classes;

public class EqualsHashcode {
	public static void main(String[] args) {
		User u1 = new User("Carlos", "carlos@gmail.com");
		User u2 = new User("Carlos", "carlos@gmail.com");
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
}
