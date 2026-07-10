package com.bank.system;

public class SavingsAccount extends Account {
  
	int rate = 10;
	
	public int calculateInterest(int amount)
	{
		return amount*rate/100;
	}
	
	public int forexTax()
	{
		return 250;
		
	}
	
}
