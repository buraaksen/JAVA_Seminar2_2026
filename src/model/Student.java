package model;

import java.util.EmptyStackException;

public class Student extends Person {
	//1. variables
		private String matriculaNumber;

		private String faculty;
		private int birthYear;
		private Country country;
		private String passportNumber;
		
		//2. getters
		public String getMatriculaNumber() {
			return matriculaNumber;
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
		
		
		private void setFaculty(String inputFaculty) {
			if (inputFaculty != null) {
				faculty = inputFaculty;
			}else {
				faculty= "unkown";
			}
		}
		//no need to check !null data type bc its primitive 
		private void setBirthYear(int inputBirthYear) {
			if((inputBirthYear >= 1950) && (inputBirthYear <= 2020)) {
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
			super();
			setMatriculaNumber("AB123456");
			
			setFaculty("ITF");
			setBirthYear(2006);
			setCountry(Country.Spain);
			setPassportNumber("SP092345");
		}
		
		//5. arg-constructor
		public Student(String inputNumber, String inputName , String inputSurName ,String inputFaculty ,int inputBirthyear ,Country inputCountry , String inputPassportNumber) {
			super(inputName,inputSurName);
			setMatriculaNumber(inputNumber);

			setFaculty(inputFaculty);
			setBirthYear(inputBirthyear);
			setCountry(inputCountry);
			setPassportNumber(inputPassportNumber);
			
		}
		//6. toString
		@Override 
		public String toString() {
			
			//Aref Hosseini (AB123456) ITF, 2006 [Spain], SP092345
			String result = name + " " + surname + " (" + matriculaNumber + ")" + faculty + ", " + birthYear + " [" + country + "], " + passportNumber;
			return result; 
		}
		//7. other functions 
	
		
}
