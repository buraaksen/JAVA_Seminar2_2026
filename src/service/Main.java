package service;

import java.lang.invoke.CallSite;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import model.Country;
import model.Course;
import model.Grade;
import model.Person;
import model.ProfDegree;
import model.Professor;
import model.Student;

public class Main {
	private static ArrayList<Student> allStudents = new ArrayList<>();
	private static ArrayList<Professor>allProfessors = new ArrayList<>();
	private static ArrayList<Course> allCourses = new ArrayList<>();
	private static ArrayList<Grade> allGrades = new ArrayList<>();
	public static void main(String[] args) {
		
		
		
		System.out.println("-------Students-----");
		Student student1 = new Student();
		Student student2 = new Student("BR123456", "Burak", "Sen", "ITF", 2005, Country.Turkey, "TR123456");
		Student student3 = new Student("TH233456", "Taha", "Njord", "ITF", 2003, Country.Latvia, "LT653456");
		Student student4 = new Student("SL123456", "Abelard", "Torqu", "ITF", 2004, Country.Spain, "SP126556");
		allStudents.add(student1);
		allStudents.add(student2);
		allStudents.add(student3);
		allStudents.add(student4);
		
		for (int i= 0; i<allStudents.size(); i++) {
			if(allStudents.get(i).getCountry().equals(Country.Latvia)) {
				System.out.println(allStudents.get(i));
			}
		}
		
		System.out.println("-------Professors------");
		Professor professor1 = new Professor();
		Professor professor2 = new Professor(0, "Taha", "Sen", ProfDegree.bachelor);
		allProfessors.addAll(Arrays.asList(professor1, professor2));
		
	
		System.out.println(allProfessors);
		
		System.out.println("-------Courses------");
		Course course1 = new Course();
		Course course2 = new Course(0, "C++", 5, professor2);
		allCourses.addAll(Arrays.asList(course1, course2));
		
		
		
		System.out.println("-------Grades------");
		Grade grade1 = new Grade();
		System.out.println(grade1);
		Grade grade2 =new Grade(0, 4, professor2, course2);
		System.out.println(grade2);
		allGrades.add(grade1);
		allGrades.add(grade2);
	
		System.out.println(grade1.averageCalc(allGrades));
		
		System.out.println("-------Persons------");
		Person person1 = new Person("BUrak", "Sen");

	}

}
