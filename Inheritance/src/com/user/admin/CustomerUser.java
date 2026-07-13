package com.user.admin;

public class CustomerUser extends AdminUser {
   
	int salary;
	CustomerUser(int sal){
		
		this.salary = sal;
	}
	
	public int customerUser() {
		
		return salary;
		
	}
}
