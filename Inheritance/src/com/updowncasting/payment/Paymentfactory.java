package com.updowncasting.payment;

public class Paymentfactory {

	public static Object getPayment(String paymentType)
	{
		Object obj = null;
		if(paymentType.equalsIgnoreCase("CreditCard")) 
		{
			 obj = new CreditCard();
		}
		else if(paymentType.equalsIgnoreCase("UPI")) 
		{
			 obj = new UPI();
		}
		else if(paymentType.equalsIgnoreCase("NetBanking")) 
		{
			 obj = new NetBanking();
		}
        else {
			
			System.out.println(" Invalid type ");
		}
		return obj;
	}
	
}
