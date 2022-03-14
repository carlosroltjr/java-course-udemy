package arrays;

import java.util.Arrays;

public class ArrayExercise {
	public static void main(String[] args) {
		double[] student1Grades = new double[3];
		student1Grades[0] = 7.9;
		student1Grades[1] = 5;
		student1Grades[2] = 9.1;
		
		System.out.println(Arrays.toString(student1Grades));
		
		double totalStudent1 = 0;
		for (int i = 0; i < student1Grades.length; i++) {
			totalStudent1 += student1Grades[i];
		}
		
		System.out.println(totalStudent1 / student1Grades.length);
		
		double[] student2Grades =  {6.9, 8, 5.5, 7.3};
		
		double totalStudent2 = 0;
		for (int i = 0; i < student2Grades.length; i++) {
			totalStudent2 += student2Grades[i];
		}
		
		System.out.println(totalStudent2 / student2Grades.length);
	}
}
