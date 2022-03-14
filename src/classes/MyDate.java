package classes;

public class MyDate {
	int day;
	int month;
	int year;
	
	MyDate() {
		day = 1;
		month = 1;
		year = 1970;
	}
	
	MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	String getFormattedDate() {
		return String.format("%d/%d/%d", day, month, year);
	}
	
	void printFormattedDate() {
		System.out.println(getFormattedDate());
	}
}
