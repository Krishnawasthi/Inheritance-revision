
/*📄 3. Driver.java
Purpose

1. The Driver class is the client of the application.

2. It interacts with the PaymentFactory, receives the object, and performs different types of casting.

What are we achieving?
Step 1

1. Request an object from the factory.(User wants a object from factory)

Object obj = PaymentFactory.getPayment("CreditCard");

2. The factory decides which object to create.

Step 2

1. Convert the Object reference into a Payment reference.

Payment payment = (Payment) obj;

2. Although the actual object is CreditCard, we first access it using its parent class.

This demonstrates Upcasting.

Step 3

Call the overridden method.

payment.pay();

Java executes

CreditCard.pay()

because the actual object is a CreditCard.

This demonstrates Runtime Polymorphism.

Step 4

Downcast back to the child class.

CreditCard card = (CreditCard) payment;

Now we can access child-specific methods.

card.generatePin();

This demonstrates Downcasting.

🔄 Complete Project Flow
                 Driver
                    │
                    ▼
      PaymentFactory.getPayment()
                    │
                    ▼
     Creates Required Payment Object
                    │
                    ▼
      Returns Object Reference
                    │
                    ▼
      Cast Object → Payment
                    │
                    ▼
        Runtime PolyMorphism
          payment.pay()
                    │
                    ▼
      Cast Payment → CreditCard
                    │
                    ▼
      Access Child-Specific Methods   */
package com.updowncasting.payment;

public class Driver {

	public static void main(String[] args) {
		
		Object obj = Paymentfactory.getPayment("UPI");  //users can call which type of object they want  
		   Payment payment = (Payment) obj;  //Up casting 
		   payment.pay();   
//		   CreditCard cc = (CreditCard) payment; //down casting 
//		   cc.pay();
//		   cc.generatePin();
		   UPI u = (UPI) payment;
		   u.pay();
		   u.scanQRCode();
		   
// what is the reason of this is we can access the object on the users call.. 

	}

}
