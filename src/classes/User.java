package classes;

public class User {
	String name;
	String email;
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			User user = (User) obj;
			return user.name.equals(this.name) && user.email.equals(this.email);			
		} else {
			return false;
		}
	}
}
