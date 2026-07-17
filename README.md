☕ Java Object-Oriented Programming (Inheritance) Interview Guide
Welcome to the comprehensive Java OOPs interview preparation repository! Below you will find detailed answers and code examples for core object-oriented concepts.
❓ Interview Questions & Detailed Answers
1. What is inheritance, and why do we need it? 🤔
   
•	What it is: Inheritance is a core mechanism in Object-Oriented Programming (OOP) that allows one class (the Child/Subclass) to acquire the properties (fields) and behaviors (methods) of another class (the Parent/Superclass). In Java, it is implemented using the extends keyword.
•	Why we need it:
o	Code Reusability: You don't have to rewrite the same code. Common properties and behaviors are defined once in the parent class and inherited by multiple subclasses.
o	Method Overriding (Runtime Polymorphism): It allows the child class to provide a specific implementation of a method that is already provided by its parent class.
o	Cleaner Code Architecture: It establishes a clear, hierarchical relationship (an "IS-A" relationship, e.g., a Dog IS-A Animal).

2. How does method overriding work? 🔄
Method overriding happens when a subclass provides a specific implementation for a method that is already defined in its superclass.
•	How it works behind the scenes: It is governed by Runtime Polymorphism (or Dynamic Method Dispatch). When a overridden method is called through a parent class reference, Java determines which method to execute at runtime based on the actual object the reference is pointing to, not the type of the reference variable.
•	Rules for Overriding:
o	The method must have the exact same name and same parameter list as in the parent class.
o	The return type must be the same or a covariant type (a subclass of the original return type).
o	The access modifier cannot be more restrictive (e.g., if the parent method is protected, the overriding method can be protected or public, but not private).
o	Use the @Override annotation to ensure compile-time checks.

3. Why is multiple inheritance not supported in Java? ❌👥
Java does not support multiple inheritance with classes (i.e., a class cannot extend more than one class) to avoid the Diamond Problem and to keep the language simple.
•	The Diamond Problem: Consider a scenario where Class A has a method foo(). Class B and Class C both extend Class A and override foo(). If Class D tries to extend both B and C simultaneously, and calls foo(), compiler gets confused: "Should I execute the version from B or C?"
•	Java's Solution: To avoid this ambiguity, Java banned multiple inheritance of classes. However, you can achieve multiple inheritance functionality using Interfaces, because a class can implement multiple interfaces, and interface conflict rules are strictly handled by Java compilers.

4. Difference between method overriding and method hiding. ⚖️
While they look similar, their underlying mechanisms are completely different:
Feature	Method Overriding 🔄	Method Hiding 🙈
Method Type	Applies to Instance methods (non-static).	Applies to Static methods.
Binding Time	Runtime Binding (Dynamic polymorphism based on object type).	Compile-time Binding (Static polymorphism based on reference type).
Behavior	The child method completely replaces the parent method at runtime.	The child method merely hides the parent method; the parent method is still accessible via a parent reference.

5. Can we override a private method? Why or why not? 🔒
No, we cannot override a private method.
•	Why? In Java, private methods are only visible and accessible within the class they are declared in. A subclass doesn't even know the private method exists.
•	If you write a method with the exact same signature in the child class, it is treated as a brand-new, completely independent method belonging exclusively to the child class. It is not an override.

6. Can we override a static method in Java? ⚡
No, you cannot override a static method. If you define a static method with the same signature in a child class, it results in Method Hiding.
•	Why? Overriding relies on instance-based runtime dynamic binding. However, static methods belong to the Class itself, not to any specific instance/object of the class. They are resolved at compile-time based on the reference variable's type.


7. Can a subclass access private members of the parent class? If not, how can it use them? 🗝️
•	Direct Access: No. A subclass cannot directly access private fields or methods of its parent class (e.g., parentPrivateField = 10; will cause a compilation error).

•	How to use them instead:
1.	Getter and Setter Methods: The parent class can expose public or protected getters and setters to allow safe reading/writing of private data.
2.	Constructors: The child class can pass data to the parent class's private fields using the super() constructor call.
3.	Alternative Visibility: If architecture allows, change the visibility from private to protected so subclasses can access it directly.

  
8. What happens if a parent and child class have the same variable name? How can we access both? 🏷️
When a child class declares a variable with the same name as an inherited variable from the parent class, it is called Variable Shadowing (or Field Hiding). Unlike methods, variables do not exhibit polymorphism.
•	How to access both inside the child class:
o	Use this.variableName to access the child class variable.
o	Use super.variableName to access the parent class variable.
<img width="600" height="350" alt="image" src="https://github.com/user-attachments/assets/985f650f-438b-445d-9942-72e1b9ba8f16" />



