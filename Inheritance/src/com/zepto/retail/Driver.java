package com.zepto.retail;

public class Driver {

	public static void main(String[] args) {
		
		Product obj = new Product();
		System.out.println(obj.prodName) ;  //String prodName;
		System.out.println(obj.brand) ;                          //String brand;
		System.out.println(obj.industry); 
		                                           // String industry;
		obj.doSomething();
		
		
		ClothingProduct cp = new ClothingProduct();
		cp.dosome();
		cp.doSomething();
		System.out.println();
		MensWear mw = new MensWear();
		mw.dosome();
		mw.donotSomething();
		System.out.println();
		WomensWear ww = new WomensWear();
		ww.dosome();
		ww.donotSomething2();
	}

}
