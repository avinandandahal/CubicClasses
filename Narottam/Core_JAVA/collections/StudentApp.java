package com.cubic.training.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Course  c1= new Course(scanner.nextInt(), scanner.next(), scanner.next());
		//Student s1= new Student(scanner.nextInt(), scanner.next(), new Course(scanner.nextInt(), scanner.next(), scanner.next()));
		
		
		
		
		
		ArrayList<Student> student = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Details of Student and Course No :: " + (i + 1));
			
			//student.add(s1);
			
			student.add(new Student(scanner.nextInt(), scanner.next(),
					new Course(scanner.nextInt(), scanner.next(), scanner.next())));
		}

		for (Student s : student) {
			System.out.print(s.sID + " ");
			System.out.print(s.sName + " ");
			System.out.print(s.course.cID + " ");
			System.out.print(s.course.cName + " ");
			System.out.println(s.course.professor + " ");
			//System.out.println(s);
		}
		scanner.close();
	}
}

