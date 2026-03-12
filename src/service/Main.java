package service;

import model.Country;
import model.Course;
import model.Grade;
import model.ProfDegree;
import model.Professor;
import model.Student;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		System.out.println(student1);
		Student student2 = new Student("BR123456", "Burak", "Sen", "ITF", 2005, Country.Turkey, "TR123456");
		System.out.println(student2);
		Student student3 = new Student("TH233456", "Taha", "Njord", "ITF", 2003, Country.Lithuania, "LT653456");
		System.out.println(student3);
		Student student4 = new Student("SL123456", "Abelard", "Torqu", "ITF", 2004, Country.Spain, "SP126556");
		System.out.println(student4);
		
		
		Professor professor1 = new Professor();
		System.out.println(professor1);
		Professor professor2 = new Professor(0, "Taha", "Sen", ProfDegree.bachelor);
		System.out.println(professor2);
		
		Course course1 = new Course();
		System.out.println(course1);
		Course course2 = new Course(0, "C++", 5, professor2);
		System.out.println(course2);
		
		Grade grade1 = new Grade();
		System.out.println(grade1);
		Grade grade2 =new Grade(0, 4, professor2, course2);
		System.out.println(grade2);
	}

}
