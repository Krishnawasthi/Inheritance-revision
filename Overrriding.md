# 🔄 Method Overriding in Java

**Method Overriding** is a feature of **Runtime Polymorphism** where a **child class provides its own implementation** of a method already defined in its **parent class**.

## ✅ Rules

* Method name must be the **same**.
* Parameters must be **identical** (Params should be same) same in terms of (Order, Type, Number).
* Return type must be the **same** (**except Covariant Return Type** **this features comes  from java5** ).
* Access modifier should be same or widen or cannot be **more restrictive**.
* `static`, `final`, and `private` methods **cannot be overridden**.
* Constructors **cannot** be overridden.


  <img width="501" height="257" alt="image" src="https://github.com/user-attachments/assets/56098c56-5aa9-4439-a75b-51983d7b4544" />



<img width="537" height="348" alt="image" src="https://github.com/user-attachments/assets/6921c4c5-e86c-468f-93ef-c85b6ae3b481" />


<img width="450" height="350" alt="image" src="https://github.com/user-attachments/assets/687efc06-4bc6-4135-b198-95f9d2a36996" />


  

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

# 🎯 Why Do We Need Method Overriding?

Suppose a parent class has a method that performs a general task.

Different child classes may need to perform the **same task in different ways**.

Instead of creating different method names, Java allows us to override the parent's method.

This makes programs:

- ✅ More flexible
- ✅ More reusable
- ✅ Easier to maintain
- ✅ Runtime polymorphism possible
- ✅ Makes Code Flexible
- ✅ Improves Maintainability
- ✅ Enables Parent References to Call Child Implementations
- ✅ Follows the Open/Closed Principle (extend behavior without modifying existing code)

---

# 📌 Rules of Method Overriding

A method can be overridden only if the following rules are satisfied:

### ✅ 1. Method name must be the same

```java
class Parent {
    void display() {}
}

class Child extends Parent {
    void display() {}   // Correct
}
```

---

### ✅ 2. Parameters must be the same

```java
void show(int a)
```

Both parent and child methods must have identical parameters.

---

### ✅ 3. Return type must be same (or Covariant Return Type)

```java
Parent getObject()

Child getObject()   // Allowed
```

---

### ✅ 4. Access modifier cannot be more restrictive

Allowed:

```java
protected → public
```

Not Allowed:

```java
public → private ❌
```

---

### ✅ 5. Cannot override static methods

Static methods belong to the class, not the object.

They are **method hidden**, not overridden.

---

### ✅ 6. Final methods cannot be overridden

```java
final void show()
```

Child class cannot change its implementation.

---

### ✅ 7. Private methods cannot be overridden

Private methods are not inherited.

---

### ✅ 8. Constructors cannot be overridden

Constructors are used to create objects.

Each class has its own constructor.

---

# 🏗 Basic Example

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

        Dog d = new Dog();
        d.sound();

    }

}
```

### Output

```
Dog barks
```

The parent's implementation is replaced by the child's implementation.

---

# ⚡ Runtime Polymorphism

```java
Animal a = new Dog();

a.sound();
```

Output

```
Dog barks
```

⭐ Important Points About Method Overriding


## 🔹 @Override Annotation
It is optional, but highly recommended.
Helps the compiler detect mistakes while overriding.
Improves code readability.
@Override
void show() { }

## 🔹 Static Methods Cannot Be Overridden
Static methods belong to the class, not the object.
They are method hidden, not overridden.
class Parent {
    static void display() {}
}

class Child extends Parent {
    static void display() {}   // Method Hiding
}


## 🔹 Final Methods Cannot Be Overridden

A final method cannot be redefined by the child class.

final void show() {}
#### . if you don't want that some other class override this method so make it as final.

## 🔹 Private Methods Cannot Be Overridden

Private methods are not inherited, so they cannot be overridden.


## 🔹 Covariant Return Type
### return type of child class method must be same as parent class method return-type or child of parent method return-type.

While overriding, the child class can return:

The same return type, or
A subclass (child class) of the parent's return type.
class Animal {}

class Dog extends Animal {}

class Parent {
    Animal getAnimal() {
        return new Animal();
    }
}

class Child extends Parent {
    @Override
    Dog getAnimal() {      // Covariant Return Type
        return new Dog();
    }
}


