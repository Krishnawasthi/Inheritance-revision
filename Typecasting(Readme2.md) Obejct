## 🔄 Type Casting in Java

Type Casting in Java is the process of converting one data type or one object reference type into another. It allows Java programs to work with different data types while maintaining type safety.

There are **two types of type casting** in Java:

1. **Primitive Type Casting**
2. **Object Type Casting (Reference Type Casting)**
   
## 📌 2. Object Type Casting

Object type casting is used in **Inheritance**.

It allows a parent and child class reference to refer to each other under certain conditions.

There are two types:

- Upcasting
- Downcasting

---

## ⬆️ Upcasting

Upcasting means converting a **Child object** into a **Parent reference**.

```
Child  ----------> Parent
```

It is performed **implicitly** by Java.

### Example

```java
Parent p = new Child();
```

Here,

- Object created → Child
- Reference variable → Parent

This is called **Upcasting**.

---

### ✅ Why do we use Upcasting?

Upcasting provides flexibility.

A parent reference can hold objects of multiple child classes.

Example:

```text
Animal

Dog
Cat
Lion
Tiger
```

```java
Animal obj = new Dog();
Animal obj = new Cat();
Animal obj = new Lion();
```

The same parent reference can refer to different child objects.

This is the foundation of **Runtime Polymorphism**.

---

### What can be accessed after Upcasting?

You can access:

- Parent class variables
- Parent class methods
- Overridden methods (Child version executes)

You **cannot access**

- Child-specific variables
- Child-specific methods

unless you perform Downcasting.

---

## ⬇️ Downcasting

Downcasting means converting a **Parent reference** back into its **actual Child reference**.

```
Parent ----------> Child
```

Downcasting is **explicit**.

### Example

```java
Parent p = new Child();   // Upcasting

Child c = (Child) p;      // Downcasting
```

---

# Why is Downcasting Important?

Consider a generic method:

```java
Object getObject()
```

This method can return different objects.

For example:

- Person
- Employee
- Product
- Payment
- Delivery

Since every class in Java extends `Object`, the method returns an `Object` reference.

```java
Object obj = getObject();
```

Suppose the actual returned object is a `Person`.

The compiler only knows that `obj` is of type `Object`.

So you cannot write:

```java
obj.getName(); ❌
```

because the `Object` class doesn't contain `getName()`.

To access the actual object's features, we convert it back to its original type.

```java
Person p = (Person) obj;
```

Now we can use all methods of the `Person` class.

```java
p.getName();
p.getAge();
```

### 🎯 This is the main purpose of Downcasting.

Downcasting allows us to access **child-specific properties and methods** after a generic object has been returned.

Without Downcasting, we are limited to only the methods available in the `Object` class.

---

# ⚠️ Important Rule

Downcasting is only valid when the parent reference is actually pointing to a child object.

✔️ Correct

```java
Parent p = new Child();

Child c = (Child) p;
```(correct)

❌ Incorrect

```java
Parent p = new Parent();

Child c = (Child) p;
```

Output

```
ClassCastException
```

---

## ✅ Safe Downcasting

Always verify the object's type before downcasting.

```java
if (obj instanceof Person) {
    Person p = (Person) obj;
}
```

This prevents `ClassCastException`.

---

# 📊 Upcasting vs Downcasting

| Feature | Upcasting | Downcasting |
|----------|-----------|-------------|
| Conversion | Child → Parent | Parent → Child |
| Casting | Implicit | Explicit |
| Safe | ✅ Yes | ⚠️ Only if object is actually Child |
| Access Parent Members | ✅ Yes | ✅ Yes |
| Access Child Members | ❌ No | ✅ Yes |
| Runtime Polymorphism | ✅ Yes | ❌ No |
| Main Purpose | Generalization | Access Child-specific features |

## what is typecasting. Upcasting and Dwoncasting:

 <img width="712" height="800" alt="Screenshot 2026-07-17 225145" src="https://github.com/user-attachments/assets/7cb3fe2a-f6cb-445d-8025-7e01fa996391" />

## Major of Downcasting:

<img width="711" height="800" alt="image" src="https://github.com/user-attachments/assets/82bc3575-e5d7-41b6-b6fe-3e29910b327e" />

### Here is the code file that is in "com.upcasting.downcasting" package you can refer it for the example of typecasting.







