package model;

public class Person {
	protected String name;
	protected String surname;
	
	public String getNames() {
		return name;
	}
	public String getSurnames(){
		return surname;
		
	}
	
	public void setNames(String inputName) {
		if((inputName != null) && (!inputName.isEmpty()) && (inputName.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			name= inputName;	
		}else {
			name = "unkown";
		}
	}
	public void setSurnames(String inputSurname) {
		if ((inputSurname != null)&& (!inputSurname.isEmpty()) &&(inputSurname.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))){
			surname = inputSurname;
		}else {
			surname = "unkown";
		}
	}
	
	public Person() {
		setNames("John");
		setSurnames("Green");
	}
	
	public Person(String inputName, String inputSurname) {
		setNames(inputName);
		setSurnames(inputSurname);
	}
	
	
	
}
