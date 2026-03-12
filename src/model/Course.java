package model;

public class Course {
	private long id;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 0;
	
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public Professor getProfessor() {
		return professor;
	}
	
	
	//setters 
	private void setId() {
		
		id = counter;
		counter++;
		
	}
	private void setTitle(String inputTitle) {
		if ((inputTitle != null)&& (!inputTitle.isEmpty())){
			title = inputTitle;
			}else {
				title = "unkown";
			}
	}
	private void setCreditPoints(int inputCreditPoints) {
		if((inputCreditPoints >= 1) && (inputCreditPoints <= 10)) {
			creditPoints = inputCreditPoints;
		}else {
			creditPoints = 0;
		}
	}
	private void setProfessor(Professor inputProfessor) {
	 professor = inputProfessor;
	}
	
	
	//no arg constructor
	public Course() {
		setId();
		setTitle("JAVA");
		setCreditPoints(2);
		setProfessor(new Professor());
	}
	
	//arg constructor
	public Course(long inputId,String inputTitle, int inputCreditPoints, Professor inputProfessor) {
		setId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(inputProfessor);
	}
	public String toString() {
		String result = "Id: " + id + " " + title + " " + creditPoints + " " + professor;
		return result;
	}
}
