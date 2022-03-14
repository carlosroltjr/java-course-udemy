package arrays;

import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many grades?");
		int numberOfGrades = scanner.nextInt();
		
		double[] grades = new double[numberOfGrades];
		for (int i = 0; i < grades.length; i++) {
			System.out.println(String.format("grade %d?", i + 1));
			grades[i] = scanner.nextDouble();
		}
		
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		
		System.out.println(String.format("The average is %f", sum / grades.length));
		
		scanner.close();
	}
}
