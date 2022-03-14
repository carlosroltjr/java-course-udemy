package classes;

public class ValueVsReference {
	static void setDateToDefaultValue(MyDate date) {
		date.day = 1;
		date.month = 1;
		date.year = 1970;
	}
	
	static void incrementPrimitive(int number) {
		number++;
	}
	
	public static void main(String[] args) {
		int a = 2;
		int b = a; // atribuição por valor, cria uma cópia do valor
		
		a++;
		b--;
		
		System.out.println(String.format("a = %d, b = %d", a, b));
		
		MyDate d1 = new MyDate(12, 3, 2022);
		MyDate d2 = d1; // atribuição por referência, usa o mesmo endereço de moméria
		
		d1.day = 31;
		d2.month = 12;
		d1.year = 2025;
		
		d1.printFormattedDate();
		d2.printFormattedDate();
		
		setDateToDefaultValue(d1);
		
		d1.printFormattedDate();
		d2.printFormattedDate();
		
		int c = 5;
		incrementPrimitive(c);
		// como criou uma cópia do valor para ser usado no método, não teve impacto fora dele
		System.out.println(c);
	}
}
