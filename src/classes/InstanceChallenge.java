package classes;

public class InstanceChallenge {
	int number1 = 3;
	static int number2 = 5;
	
	public static void main(String[] args) {
		System.out.println(number2);
		InstanceChallenge c = new InstanceChallenge();
		System.out.println(c.number1);
	}
}
