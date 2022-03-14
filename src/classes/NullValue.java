package classes;

public class NullValue {
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		MyDate d1 = Math.random() > 0.5 ? new MyDate() : null;
		
		if (d1 != null) {
			d1.month = 3;
			d1.printFormattedDate();
		}
		
		String s2 = Math.random() > 0.5 ? "" : null;
		
		if (s2 != null) {
			System.out.println(s2.concat("...."));			
		}
	}
}
