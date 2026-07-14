package com.overring.ihr4;

class Employee{
	 //no other class can access this cuz it is private
	 void showId() {
		System.out.println("Employee keep your id private");
	}
	//no can make any changes in to this method cuz it is final 
	public final void applyForLeave() {
		System.out.println("not any other Employee can applly for leave from your portal ");
	}
	
	//it is protected so it can be used out side the class or can access by the other classes
	//here return type is void so the child will use this should be return void
	protected void showDetails( String name, int salary , String department) {
		System.out.println("Only you or authorized Employee can see your personal details");
		
	}
	
}
  
  class Manager extends Employee
  {
	  // same method name and with the same parameters 
	  //child class is return the same return type that is void 
	  //covarient(return type): 
	  @Override
	public void showDetails(String name, int salary , String department) {
		//scope is wider than parent class method has 
		System.out.println("we are making giving you the hike for your excellent account of work");
	}
  }

public class Runner {

	
	public static void main(String[] args) {
		
		 Employee e1  = new  Employee();
		 e1.showId();
		 e1.applyForLeave();
		 e1.showDetails("krishna", 2000000,"IT");
  
	}

}
