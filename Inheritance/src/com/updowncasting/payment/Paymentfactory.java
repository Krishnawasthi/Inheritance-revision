/* 📄 2. PaymentFactory.java
Purpose

The PaymentFactory class is responsible for creating payment objects.

Instead of creating objects manually using:

new CreditCard();
new UPI();
new NetBanking();

we ask the factory to create the required object.

What are we achieving?
1. Implementing the Factory Design Pattern.
2. Centralizing object creation in one place.
3. Reducing dependency on concrete classes.
4. Returning objects based on user input.
5. Returning an Object reference so the same method can return different types of payment objects.

Example Flow
User selects "CreditCard"
          │
          ▼
PaymentFactory.getPayment("CreditCard")
          │
          ▼
Creates CreditCard object
          │
          ▼
Returns the object

The calling code doesn't need to know how the object was created. */


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
