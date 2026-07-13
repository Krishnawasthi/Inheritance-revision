package com.account.interest;

public class Account {
	 
        double amount;
        
        Account(double amount){  
        	
        	this.amount = amount;
        	
        }
      public void showBalance() {
    	  System.out.println("your amount is : ");
    	 System.out.println(amount);
    	 
      }
}
      
  class SavingAccount extends Account{
	  
	  double interest;
       
	  SavingAccount(double amount, double interest){
		  
		  super(amount);
		  this.interest = interest; 
	  }
	  public double totalInterest(){
		  
				   double interest1 = amount*interest/100;
				   
				   return interest1;
	  
	  }
	
	
  
	public static void main(String[] args) {
		
//   	Account am = new Account(1000000);
// 	  am.showBalance();
		
     SavingAccount sa =  new SavingAccount(100000, 10);
	   
	      System.out.println(sa.totalInterest());
	
	      
	      } 

}
