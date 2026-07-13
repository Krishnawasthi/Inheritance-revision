package com.user.admin;

public class User 
{

	public String name;
	public String email;

   User()
   {
	
	
	
   }
   User(String name, String email){
	   
	   this.name = name;
	   this.email = email;
	   
   }
   public void  user(String name,String email) {
	   
	   System.out.println("ser.user().......... ");
	   System.out.println("Name of the User : " + name);
	   System.out.println("Email of the User : " + email);
   }
  
}
