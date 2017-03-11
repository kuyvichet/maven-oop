package edu.rupp.repo;

import java.util.Date;
/*Create a Class "DCommon" with the following 
properties : id (Long), createdDate (Date), updatedDate (Date), createdBy String, 
       updatedBy String, state Long, version Long
*/
public class DCommon {
	protected long id; 
	protected Date createdDate = new Date(); 
	protected Date updatedDate = new Date();
	protected String createdBy; 
	protected String updatedBy; 
	protected long state; 
	protected long version;

}
