/*
-----------------------------------------------------
              Polymorphism in Java
-----------------------------------------------------

► Definition:
Polymorphism is one of the four core concepts of object-oriented programming (OOP). 
It allows objects to take on multiple forms by enabling the same method or operator to behave differently based on the context.

► Meaning:
"Poly" means many, and "morph" means forms — so polymorphism means "many forms".

► Use Case:
Used to achieve flexibility and dynamic behavior in programs, allowing the same interface to be used for different underlying data types.

-----------------------------------------------------
               Types of Polymorphism
-----------------------------------------------------

1. Compile-Time Polymorphism (Static Polymorphism):
   - Achieved through **method overloading** and **operator overloading** (limited in Java).
   - Method resolution happens at compile time.

2. Run-Time Polymorphism (Dynamic Polymorphism):
   - Achieved through **method overriding** using inheritance.
   - Method resolution happens at runtime based on the object type.

-----------------------------------------------------
               Key Concepts
-----------------------------------------------------

- **Method Overloading**:
  Same method name with different parameter lists within the same class.

- **Method Overriding**:
  A subclass provides a specific implementation of a method already defined in its superclass.

- **Upcasting**:
  A superclass reference variable can refer to a subclass object.

- **Dynamic Binding**:
  The method that gets called is determined at runtime based on the object, not the reference type.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Enhances code reusability and scalability.

- Promotes clean and organized code through abstraction.

- Simplifies maintenance and reduces complexity.

-----------------------------------------------------
               Summary
-----------------------------------------------------

- Polymorphism enables one interface to be used with different types or behaviors.

- Java supports both compile-time and runtime polymorphism.

- It is essential for achieving flexibility and extensibility in object-oriented programming.
*/
