package model;

public class Professor {
	//1. variables
	private long id;
	private String name;
	private String surname;
	private ProfDegree degree;
	
	private static long counter = 0;
	
	//2. getters 
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public ProfDegree getDegree() {
		return degree;
	}
	
	//3. setter
	public void setId() {
		
		id = counter;
		counter++;
		
	}
	public void setName(String inputName) {
		if((inputName != null) && (!inputName.isEmpty()) && (inputName.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			name= inputName;
			}
			else {
				name = "unkown";
			}
	}
	public void setSurname(String inputSurname) {
		if ((inputSurname != null)&& (!inputSurname.isEmpty()) &&(inputSurname.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))){
			surname = inputSurname;
			}else {
				surname = "unkown";
			}
	}
	public void setDegree(ProfDegree inputDegree) {
		if (inputDegree != null) {
			degree = inputDegree;
		}else {
			degree = ProfDegree.unkown;
		}
	}
	//4. no args constructors
	public Professor() {
		setId();
		setName("burak");
		setSurname("Sen");
		setDegree(ProfDegree.bachelor);
	}
	//5. args constructors 
	public Professor(long inputId, String inputName, String inputSurname, ProfDegree inputDegree  ) {
		setId();
		setName(inputName);
		setSurname(inputSurname);
		setDegree(inputDegree);
		
	}
	
	//6. toString
	public String toString() {
		String result = "Id: " + id + " " + name + " " + surname + " " + degree;
		return result;
	}
}
