package service;

import java.util.ArrayList;

import model.Country;
import model.Course;
import model.Grade;
import model.Person;
import model.ProfDegree;
import model.Professor;
import model.Student;

public class Main {

	private static ArrayList<Professor>profLists = new ArrayList<>();
	private static ArrayList<Grade> gradeLists = new ArrayList<>();
	public static void main(String[] args) {
		
		
		
		System.out.println("-------Students-----");
		Student student1 = new Student();
		System.out.println(student1);
		Student student2 = new Student("BR123456", "Burak", "Sen", "ITF", 2005, Country.Turkey, "TR123456");
		System.out.println(student2);
		Student student3 = new Student("TH233456", "Taha", "Njord", "ITF", 2003, Country.Lithuania, "LT653456");
		System.out.println(student3);
		Student student4 = new Student("SL123456", "Abelard", "Torqu", "ITF", 2004, Country.Spain, "SP126556");
		System.out.println(student4);
		
		System.out.println("-------Professors------");
		Professor professor1 = new Professor();
		Professor professor2 = new Professor(0, "Taha", "Sen", ProfDegree.bachelor);
		profLists.add(professor1);
		profLists.add(professor2);
	
		System.out.println(profLists);
		
		System.out.println("-------Courses------");
		Course course1 = new Course();
		System.out.println(course1);
		Course course2 = new Course(0, "C++", 5, professor2);
		System.out.println(course2);
		System.out.println("-------Grades------");
		Grade grade1 = new Grade();
		System.out.println(grade1);
		Grade grade2 =new Grade(0, 4, professor2, course2);
		System.out.println(grade2);
		gradeLists.add(grade1);
		gradeLists.add(grade2);
	
		System.out.println(grade1.averageCalc(gradeLists));
		
		System.out.println("-------Persons------");
		Person person1 = new Person("BUrak", "Sen");

	}

}
