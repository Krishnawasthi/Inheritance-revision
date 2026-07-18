/*📄 1. Payment.java
Purpose

The Payment class acts as the parent (super) class for all payment methods.

What are we achieving?
1. Creating a common blueprint for all payment types.
2. Providing a common method (pay()) that every payment method must have.
3. Achieving Inheritance.
4. Achieving Method Overriding by allowing child classes to provide their own implementation. 
5. Each child class overrides the pay() method and also contains its own unique functionality.

Example:

CreditCard → generatePin()
UPI → scanQRCode()
NetBanking → loginToBank()

This demonstrates Runtime Polymorphism, because calling pay() executes the version belonging to the actual object.*/




package com.updowncasting.payment;


public class Payment
{	
	public void pay()
	{
	System.out.println("Payment.pay()");	
	}	
}

class CreditCard extends Payment
{  
	@Override
	public void pay()
	{
	System.out.println("CreditCard.pay()");	
	}
	
	public void generatePin()
    {
	System.out.println("CreditCard.generatePin()...........");
    }
	
}	
	
class UPI extends Payment
{
	@Override
	public void pay()
	{
	System.out.println("UPI.pay()");	
	}
	public void scanQRCode()
    {
	System.out.println("UPI.scanQRCode()...........");
    }
}

class NetBanking extends Payment
{
	@Override
	public void pay()
	{
	System.out.println("NetBanking.pay()");	
	}
	public void loginToBank()
    {
	System.out.println("NetBanking.loginToBank()...........");
    }
	
}



