# 🔥 Method Overloading in Java

Method Overloading is a feature of **Compile-Time Polymorphism** where multiple methods have the **same name** but **different parameter lists**.

It improves **code readability**, **reusability**, and allows a method to perform similar tasks with different inputs.

---

# 📌 Rules of Method Overloading

✅ Method name must be the **same**.

✅ Parameter list must be **different** by:
- Number of parameters
- Data type of parameters
- Order of parameters

✅ Return type **alone cannot** overload a method.

✅ Access modifiers can be different.

✅ Static methods **can also be overloaded**.

<img width="522" height="272" alt="Screenshot 2026-07-18 222752" src="https://github.com/user-attachments/assets/68d816d2-5706-4b6c-9964-1a178426bbfc" />


<img width="650" height="472" alt="Screenshot 2026-07-18 222808" src="https://github.com/user-attachments/assets/e6c9e804-e406-43f0-9e66-0b34225c447c" />


---

# ✅ Valid Ways to Overload

### 1️⃣ Different Number of Parameters

```java
void add(int a)
void add(int a, int b)
```

---

### 2️⃣ Different Data Types

```java
void print(int a)
void print(double a)
```

---

### 3️⃣ Different Order of Parameters

```java
void display(int a, String name)
void display(String name, int a)
```

---

# ❌ Invalid Overloading

Changing only the return type is **not** considered method overloading.

```java
int sum(int a, int b)
double sum(int a, int b)   // ❌ Compile-Time Error
```

Reason: Java identifies overloaded methods using the **method signature**, and the return type is **not** part of the signature.

---

# 📝 Method Signature

A method signature consists of:

- Method Name
- Number of Parameters
- Data Types of Parameters
- Order of Parameters

**Return type is NOT included.**

Example:

```java
void show(int a)
void show(String a)
```

These are different signatures, so overloading is valid.

---

# ⚡ Compile-Time Polymorphism

Method overloading is resolved during **compile time**.

The compiler decides which method to call based on the arguments passed.

```java
add(10);        // Calls add(int)

add(10, 20);    // Calls add(int, int)
```

---

# 📌 Can Static Methods Be Overloaded?

✅ Yes.

Static methods can also be overloaded because they follow the same rules as instance methods.

```java
static void test()

static void test(int a)
```

---

# 📌 Can Constructors Be Overloaded?

✅ Yes.

Constructors can also be overloaded by changing their parameter list.

```java
Student()

Student(int id)

Student(int id, String name)
```

---

# 📌 Advantages of Method Overloading

- ✅ Improves code readability
- ✅ Increases code reusability
- ✅ Reduces duplicate method names
- ✅ Provides flexibility for different inputs
- ✅ Supports Compile-Time Polymorphism
  
<img width="800" height="600" alt="image" src="https://github.com/user-attachments/assets/8808374f-1562-4c5a-8e01-0d6559b1e3d7" />

---

# 🚫 Common Mistakes

❌ Changing only the return type

❌ Using the same parameter list

❌ Thinking `static` methods cannot be overloaded

❌ Confusing Method Overloading with Method Overriding

---

# 🆚 Method Overloading vs Method Overriding

| Method Overloading | Method Overriding |
|--------------------|-------------------|
| Compile-Time Polymorphism | Run-Time Polymorphism |
| Same class | Parent & Child classes |
| Same method name | Same method name |
| Different parameters | Same parameters |
| Inheritance not required | Inheritance required |
| Return type can differ (if parameters differ) | Return type must be same or covariant |

---

# 🎯 Key Interview Points

- ✔️ Method Overloading is **Compile-Time Polymorphism**.
- ✔️ Method name must remain the same.
- ✔️ Parameter list must be different.
- ✔️ Return type alone cannot overload a method.
- ✔️ Static methods can be overloaded.
- ✔️ Constructors can be overloaded.
- ✔️ The compiler selects the overloaded method during compilation.

---

## 📚 Topics Covered

- ✅ Method Overloading
- ✅ Compile-Time Polymorphism
- ✅ Method Signature
- ✅ Static Method Overloading
- ✅ Constructor Overloading
- ✅ Rules of Overloading
- ✅ Advantages
- ✅ Common Interview Questions
- ✅ Overloading vs Overriding

---
⭐ If you found this repository helpful, don't forget to **Star ⭐** it!
