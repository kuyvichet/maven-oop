package edu.rupp.repo;
/*Create a class “Developer” extends employee with properties: comment.
 Add a constructor so we can create a Developer from an Employee Object.
Implement the Interface View to display:  fullName + comment  + salary
*/
public class Developer extends Employee implements View{
	protected String comment;
	
	public Developer(Employee e){
		firstName = e.firstName;
		lastName = e.lastName;
		salary = e.salary;
	}
	//method
	public String getDataView(){
		String str;
		str= "-Developer: Full Name: "+firstName + " " + lastName + " Comment: " + this.comment + " Salary: " + salary;
		return str;
	}
	//end method
}
