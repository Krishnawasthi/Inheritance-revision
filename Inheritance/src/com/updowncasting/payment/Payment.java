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



