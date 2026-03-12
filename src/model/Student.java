package model;

import java.util.EmptyStackException;

public class Student {
	//1. variables
		private String matriculaNumber;
		private String name;
		private String surname;
		private String faculty;
		private int birthYear;
		private Country country;
		private String passportNumber;
		
		//2. getters
		public String getMatriculaNumber() {
			return matriculaNumber;
		}
		public String getName() {
			return name;
		}
		public String getSurname(){
			return surname;
		}
		public String getFaculty() {
			return faculty;
		}
		public int getBirthYear() {
			return birthYear;
		}
		public Country getCountry() {
			return country;
		}
		public String getPassportNumber() {
			return passportNumber;
		}
		//3. setters
		
		
		public void setMatriculaNumber(String inputMatriculaNumber) {
			if((inputMatriculaNumber != null) && (!inputMatriculaNumber.isEmpty())&& (inputMatriculaNumber.matches("[A-Z]{2}[0-9]{6}"))) {
				matriculaNumber = inputMatriculaNumber;
			}else {
				matriculaNumber = "unkown";
			}
			
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
		
		private void setFaculty(String inputFaculty) {
			if (inputFaculty != null) {
				faculty = inputFaculty;
			}else {
				faculty= "unkown";
			}
		}
		//no need to check !null data type bc its primitive 
		private void setBirthYear(int inputBirthYear) {
			if((birthYear >= 1950) && (birthYear <= 2020)) {
				birthYear = inputBirthYear;
			}else {
				birthYear = 2008; 
			}
		}
		//enums are referenced data type
		private void setCountry(Country inputCountry) {
			if (inputCountry != null) {
				country = inputCountry;
			}else {
				country = Country.unkown;
			}
			
		}
		
		private void setPassportNumber(String inputPassportNumber) {
			if((inputPassportNumber != null) && (!inputPassportNumber.isEmpty()) && (inputPassportNumber.matches("[A-Z]{2}[0-9]{6}")) ) {
				passportNumber = inputPassportNumber;
			}else {
				passportNumber = "unkown";
			}
		}
		
		//4. nor-arg constructor
		public Student() {
			setMatriculaNumber("AB123456");
			setName("Aref");
			setSurname("Hosseini");
			setFaculty("It");
			setBirthYear(2006);
			setCountry(Country.Spain);
			setPassportNumber("SP092345");
		}
		
		//5. arg-constructor
		public Student(String inputNumber, String inputName , String inputSurName ,String inputFaculty ,int inputBirthyear ,Country inputCountry , String inputPassportNumber) {
			setMatriculaNumber(inputNumber);
			setName(inputName);
			setSurname(inputSurName); 
			setFaculty(inputFaculty);
			setBirthYear(inputBirthyear);
			setCountry(inputCountry);
			setPassportNumber(inputPassportNumber);
			
		}
		//6. toString
		
		//7. other functions 
}
