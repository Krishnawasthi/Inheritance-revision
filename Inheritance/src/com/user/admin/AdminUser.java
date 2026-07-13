package com.user.admin;

public class AdminUser extends User
  {
	
   String emp_id;
   String companyName;
   
   AdminUser(){
   
	  
   }
  
   AdminUser(String empid,String compName){ 
	 
	   this.emp_id = empid;
	   this.companyName = compName;
   }
   
   public void adminUser(String empid , String compName) {
	   
	   System.out.println("AdminUser.adminUser()............");
	   System.out.println("Emp_Id of the User : " + empid );
	   System.out.println("Company name of the User : " + compName);
	   
   }
  
}
;