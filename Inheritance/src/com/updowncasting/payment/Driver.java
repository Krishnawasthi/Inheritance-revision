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
