package service;

import model.Country;
import model.Student;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		System.out.println(student1);
		Student student2 = new Student("BR123456", "Burak", "Sen", "ITF", 2005, Country.Turkey, "TR123456");
		System.out.println(student2);
	}

}
