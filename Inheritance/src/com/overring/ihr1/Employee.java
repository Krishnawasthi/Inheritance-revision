package com.overring.ihr1;
  
 class Employee1 {

	 String empName;
	 String empId;
	
	Employee1( String empName, String empId){
		
		this.empName = empName;
		this.empId = empId;
	}
	
	public void displayEmpDetails() {
		
		System.out.println("here are the empdetails of Employee.........");
		
	}

}
 
    class Manager extends Employee1{
    	   int salary;
    	   
    	 Manager(String empName, String empId, int salary) {
    	        super(empName, empId);   // Calls parent constructor
    	        this.salary = salary;
    	    }
    	
    	
    	@Override
    	public void displayEmpDetails() {     //we are Overriding the method of parent class in the child class
    		
      		System.out.println("  want to provide salray : ");
    		System.out.println("emp salary :" + this.salary);
    	}
    	
    }
    
  public class Employee extends Object{    
	  
	  public static void main(String[] args) {
		   
		  Manager mg = new Manager("krishna","krish@123",200000);
		  mg.displayEmpDetails();
		  System.out.println("emp empName :" +  mg.empName);
	  	  System.out.println("emp empId :" +  mg.empId);
		
		  
	}
  }
    
    
    
