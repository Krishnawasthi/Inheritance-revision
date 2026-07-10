package com.bank.system;

public class Driver {
 public static void main(String[] args) {
	Account acc = new Account();
	
	 acc.openAccount();
	 acc.closeAccount();
	 acc.approveAccount();
	 
	 SavingsAccount s = new SavingsAccount();
	 int amount = 10000;
	 int intrest = s.calculateInterest(amount);
	 System.out.println();
	 
	 System.out.println("your total intrest count on you total  "+ amount + " is : "+ intrest);
	 
	 System.out.println();
	 s.approveAccount();
	 s.closeAccount();
	 
	 System.out.println();
	 int forextax = s.forexTax();
	 System.out.println("And your forex duties are implemeted for rs : " + forextax );
	 
	 PrimiumAccount pa = new PrimiumAccount();
	 pa.premiumServices();
}
}
