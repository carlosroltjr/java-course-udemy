package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		System.out.print("How many students? ");
		int numberOfStudents = entry.nextInt();
		
		System.out.print("How many grades per student? ");
		int numberOfGrades = entry.nextInt();
		
		double[][] classGrades = new double[numberOfStudents][numberOfGrades];
		
		double sum = 0;
		for (int student = 0; student < classGrades.length; student++) {
			for (int grade = 0; grade < classGrades[student].length; grade++) {
				System.out.printf("Enter the grade %d for student %d: ", grade + 1, student + 1);
				classGrades[student][grade] = entry.nextDouble();
				sum += classGrades[student][grade];
			}
		}
		
		double classAverage = sum / (numberOfStudents * numberOfGrades);
		System.out.printf("Class average is: %f\n", classAverage);
		
		for (double[] studentGrades : classGrades) {
			System.out.println(Arrays.toString(studentGrades));
		}
		
		entry.close();
	}
}
