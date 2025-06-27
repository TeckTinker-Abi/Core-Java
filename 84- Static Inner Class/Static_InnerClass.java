/*
-----------------------------------------------------
             Static Inner Class in Java
-----------------------------------------------------

► Definition:
A static inner class is a **nested class** that is declared with the `static` keyword inside an outer class. It does **not need a reference** to an instance of the outer class.

► Use Case:
Used when the inner class does not require access to non-static members of the outer class.

-----------------------------------------------------
             Key Characteristics
-----------------------------------------------------

- Declared using the `static` keyword inside another class.

- Can access only **static members** of the outer class directly.

- Cannot access non-static members of the outer class unless an object of the outer class is created.

- Can contain both static and non-static members.

- Can be instantiated **without creating an instance of the outer class**.

- Acts more like a top-level class that is logically grouped inside another class.

-----------------------------------------------------
                Syntax Rules
-----------------------------------------------------

- Defined as:  
    static class InnerClass {  
        // members  
    }

- Accessed from outside using:  
    OuterClass.InnerClass obj = new OuterClass.InnerClass();

- Can have constructors, methods, and variables like a normal class.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Reduces memory overhead since it does not require an outer class object.

- Useful for grouping helper classes logically inside the outer class.

- Improves code organization and encapsulation.

-----------------------------------------------------
                Summary
-----------------------------------------------------

- A static inner class is a nested class that does not depend on outer class instances.

- It can access only static members of the outer class directly.

- It can be instantiated independently, and is useful for utility-like inner classes.
*/


class Outer {
    static int outerStatic = 100;
    int outerNonStatic = 200;

    // Static Inner Class
    static class Inner {
        void display() {
            System.out.println("Accessing static member of outer class: " + outerStatic);

            // Cannot access non-static member directly
            // System.out.println(outerNonStatic); //  Error
        }
    }
}

public class Static_InnerClass {
    public static void main(String[] args) {
        // Creating object of static inner class without outer class object
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}