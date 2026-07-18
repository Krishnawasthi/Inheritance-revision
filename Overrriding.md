# 🔄 Method Overriding in Java

**Method Overriding** is a feature of **Runtime Polymorphism** where a **child class provides its own implementation** of a method already defined in its **parent class**.

## ✅ Rules

* Method name must be the **same**.
* Parameters must be **identical**.
* Return type must be the **same** (or **Covariant Return Type**).
* Access modifier cannot be **more restrictive**.
* `static`, `final`, and `private` methods **cannot be overridden**.
* Constructors **cannot** be overridden.


<img width="537" height="348" alt="image" src="https://github.com/user-attachments/assets/6921c4c5-e86c-468f-93ef-c85b6ae3b481" />


<img width="1457" height="1075" alt="image" src="https://github.com/user-attachments/assets/687efc06-4bc6-4135-b198-95f9d2a36996" />


  

## 💻 Example

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();   // Output: Dog barks
    }
}
```

## 🚀 Advantages

* Supports **Runtime Polymorphism**.
* Enables **Dynamic Method Dispatch**.
* Improves **code reusability** and **flexibility**.
* Allows child classes to customize inherited behavior.

> **Key Point:** In Method Overriding, the method to execute is decided **at runtime** based on the actual object, not the reference type.
