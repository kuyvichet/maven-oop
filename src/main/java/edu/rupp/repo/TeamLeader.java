package edu.rupp.repo;
/*Create a class “TeamLeader” with properties : projectNum.
Implements the interface View to display:  fullName: UPPERCASE_NAME + number of projects
(use StringBuffer to manipulate string, the fullName should be in UPPERCASE)
*/
public class TeamLeader extends Employee implements View{
	protected int projectNum;
	//method
	public String getDataView(){
		String fullName;		
		StringBuffer buf = new StringBuffer();
		
		buf.append(firstName);
		buf.append(" ");
		buf.append(lastName);
		fullName = buf.toString().toUpperCase();
		
		return "-Team Leader: Full Name: " + fullName+" Project Num: "+this.projectNum;
	}
	//end method
}
