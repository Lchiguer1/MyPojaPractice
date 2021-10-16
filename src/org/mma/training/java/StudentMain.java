package org.mma.training.java;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {


		//1-No ar Constructor
		Student s1 = new Student();

		//2- Setting Variables
		s1.setId(10);
		s1.setFirstName("Ilyas");
		s1.setLastName("Woodard");
		s1.setMajor("Business");
		s1.setYear("Senior");

		//System.out.println(s1);


		//2-field constructors

		Student s2 = new Student(11,"Habiba", "Ibrahimi","Physics","Junior");
		Student s3 = new Student(12,"Ayah", "Dadsi", "IT","Senior");
		Student s4 = new Student(13,"Fatma", "Chiguer","IT","Freshman");
		Student s5 = new Student(14,"Tariq", "Hasan","Business", "Junior");
		Student s6 = new Student(15,"Ahmed", "Hasan","Arabic", "Senior");
		Student s7 = new Student(16,"Mohammad", "Ali","IT", "Senior");
		Student s8 = new Student(16,"Mohammad", "Mustafa","IT", "Senior");
		
		//3-Creating an arrayList

		List<Student> students = new ArrayList<>();// make sure you import Student object class
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);

		//System.out.println(students);

		//4- Creating Loop
		for(Student s : students) {
			if(s.getYear().equalsIgnoreCase("Senior"))
				System.out.println(s.getFirstName()+ "  " + s.getLastName() + " is a senior " );
		}

	}

}
