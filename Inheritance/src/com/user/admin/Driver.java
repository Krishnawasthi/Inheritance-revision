package com.user.admin;

public class Driver {

	public static void main(String[] args) {
		
		CustomerUser cu = new CustomerUser(10000);
		cu.user("krishna", "kmaws@gmail.com");
		System.out.println();
		cu.adminUser("kr123#","emcssom");
		System.out.println();
		int sal = cu.customerUser();
		System.out.println("salary of the user: " + sal);

	}

}
