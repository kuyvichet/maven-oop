package edu.rupp.repo;

import java.text.SimpleDateFormat;

/*Create a Class “Employee” with the following 
properties: salary (Double), years (years spent in the company) and lastName, birthDate, firstName. 

Implements the interface View with the Employee class to display all the data of an employee.
*/
public class Employee extends Person implements View{
	protected double salary;
	protected float years;// (years spent in the company)
	//and lastName, birthDate, firstName
	
	//method
	public String getDataView(){
		String str;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		
	    String dob = sdf.format(birthDate);
		
		str= "-Employee: Full Name: "+firstName + " " + lastName + " BirthDate: " + dob +
				" Salary: " + this.salary + " Year: " + this.years;
		return str;
	}
	//end method
}
