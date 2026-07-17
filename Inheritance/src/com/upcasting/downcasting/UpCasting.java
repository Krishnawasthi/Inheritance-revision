package com.upcasting.downcasting;

class Employee
{
	String name = "Krishna";
	
	
	public void showDetails1() 
	{
		
		System.out.println("Employee.showDetails1()");
		System.out.println("name of the Emp: " + name );
	}
	
}

class Manager extends Employee
{
	int salary = 200000;
	public void showDetails2() 
	{
		
		System.out.println("Manager.showDetails2()");
		System.out.println("name of the manager: " + name );
		System.out.println("name of the manager: " + salary );
	}

}



public class UpCasting 
{
  public static void main(String[] args)
{

	   
	    System.out.println();
		System.out.println("here we are downcasting:");
		
		Employee e3 = new Manager();   // Upcasting

		Manager m1 = (Manager) e3; // Downcasting ✓
		m1.showDetails1();
		m1.showDetails2();
	
}
		
	
}
