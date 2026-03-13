package model;

public class Professor extends Person {
	//1. variables
	private long id;
	
	private ProfDegree degree;
	
	private static long counter = 0;
	
	//2. getters 
	public long getId() {
		return id;
	}

	public ProfDegree getDegree() {
		return degree;
	}
	
	//3. setter
	private void setId() {
		
		id = counter;
		counter++;
		
	}

	private void setDegree(ProfDegree inputDegree) {
		if (inputDegree != null) {
			degree = inputDegree;
		}else {
			degree = ProfDegree.unkown;
		}
	}
	//4. no args constructors
	public Professor() {
		super();
		setId();
		setDegree(ProfDegree.bachelor);
	}
	//5. args constructors 
	public Professor(long inputId, String inputName, String inputSurname, ProfDegree inputDegree  ) {
		super(inputName, inputSurname);
		setId();
		setDegree(inputDegree);
		
	}
	
	//6. toString
	public String toString() {
		String result ="Professor id: " +  id + ": " + name + " " + surname + " (" + degree + ")";
		return result;
	}
}
