package edu.rupp.repo;

import java.util.Date;
/*Create a Class “Person” extending class "Dcommon" with the following 
properties: birthDate (Date), lastName (String), firstName (String)
*/
public class Person extends DCommon{
	protected Date birthDate = new Date(); 
	protected String lastName; 
	protected String firstName;
}
