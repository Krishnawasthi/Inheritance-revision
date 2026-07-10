package com.zepto.retail;

public class ClothingProduct extends Product {
         String pazamas = "Wranglar's";
         String pants = "H@m";
         String shirts = "zara"; 
        public void dosome() {
        	
       System.out.println("dosome()........");
       System.out.println("dosome()........"+" " + pazamas+" " + pants + " "+ shirts  );
        	
        }
 
}
   class MensWear extends ClothingProduct {
	 int age = 24;
	 String size = "M";
	public void donotSomething() {
		System.out.println("donotSomething()..........");
		System.out.println("dosome()........"+" "+"Age: "+ + this.age +" "+"Size: " + this.size );
	}
	
   }
   class WomensWear extends ClothingProduct {
	   int age = 29;
	   String size = "L";
	   void donotSomething2() {
			System.out.println("donotSomething()2..........");
			System.out.println("dosome()2........"+" " +"Age: "+this.age +" " + "Size: "+ this.size );
			
		}
	   
   }
