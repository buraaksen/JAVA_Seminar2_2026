package model;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Grade {
	private long id;
	private int value;
	private Professor professor;
	private Course course;
	
	private static long counter = 0;
	
	public long getId() {
		return id;
	}
	
	public int getValue() {
		return value;
	}
	public Professor getProfessor() {
		return professor;
	}
	public Course getCourse() {
		return course;
	}
	
	public void setId() {
		id = counter;
		counter++;
		
	}
	public void setValue(int inputValue) {
		if((inputValue>= 1) && (inputValue <= 10)) {
			value = inputValue;
		}else {
			value = 0;
		}
	}
	public void setProfessor(Professor inputProfessor) {
		this.professor = inputProfessor;
	}
	
	public void setCourse(Course inputCourse) {
		this.course = inputCourse;
	}
	
	public Grade() {
		setId();
		setValue(5);;
		setProfessor(new Professor());
		setCourse(new Course());
	}
	
	public Grade(long inputId, int inputValue, Professor inputProfessor , Course inputCourse) {
		setId();
		setValue(inputValue);
		setProfessor(inputProfessor);
		setCourse(inputCourse);
	}
	
	public String toString() {
		String result =  id + ": " + value + " " + professor + " " + course+ ""; 
		return result;
	}
	
	
	public long averageCalc(ArrayList<Grade> gradesLists) {
		
		double total = 0;
		
		for(int i = 0; i< gradesLists.size() ; i++) {
			total += gradesLists.get(i).value;
		}
		
		return (long) (total/gradesLists.size());
	}
	
}
