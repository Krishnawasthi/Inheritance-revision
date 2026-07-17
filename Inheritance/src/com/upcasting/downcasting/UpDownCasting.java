
//----------------------------------**************************UPCASTING*******************************---------------------------------
//Upcasting: Upcasting is the typecasting of a child object to a parent object. Upcasting can be done implicitly. 
//Upcasting gives us the flexibility to access the parent class members but it is not possible to access all the child class members using this feature.
// Instead of all the members, we can access some specified members of the child class. For instance, we can access the overridden methods.

//----------------------------------**************************DOWNCASTING*******************************---------------------------------
//Downcasting: Similarly, downcasting means the typecasting of a parent object to a child object. Downcasting cannot be implicit.

//we can forcefully cast a parent to a child which is known as downcasting.
//After we define this type of casting explicitly, the compiler checks in the background if this type of casting is possible or not. 
//If it's not possible, the compiler throws a ClassCastException. 

package com.upcasting.downcasting;
 

//********************* parent class************************
class Parent{

	String name;
	
	void method() {
		
		System.out.println("method from parent");
	}
}
//********************* child class************************
     
class Child extends Parent {   //inheritance
	
	int id;
 @Override                    //method overriding making changes in the method of parent in the child class
void method() {
		System.out.println("method from child");
	}

}
public class UpDownCasting {

	public static void main(String[] args) {
		 
//		*************************UPCASTING*******************************
		//upcasting: converting child class object into parent class or we can say parent class is referring the child class obejcts.
		//not everything can be access by the parent class only specified things like methods who are overridden can only access by the parent class from the child class
		Parent p = new Child();     // Parent : converting into parent type ,  p is reference variable, Child(): child class obejct 
		 p.name = "krishna";
		 System.out.println(p.name);
		 p.method();
		
		
//**************************DOWNCASTING******************************
		 System.out.println();
		 
		
//downcasting can not be done by implicitly
//Child: converting into child type, c is reference variable,(Child): explicitly type cast or telling compiler to forcefully type cas
		 //p is the reference var of parent class that is pointing to the properties of parent class.
		       Child c = (Child) p;
		       c.id = 1;
		       System.out.println(c.id);
		       System.out.println(c.name);
		       c.method();
		 
	}

}
