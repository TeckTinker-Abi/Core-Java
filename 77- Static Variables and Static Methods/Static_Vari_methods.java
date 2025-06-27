/*
-----------------------------------------------------
       Static Variables and Static Methods in Java
-----------------------------------------------------

► Definition of 'static':
The keyword `static` in Java is used to indicate that a particular variable or method belongs to the **class itself**, rather than to instances (objects) of the class.

-----------------------------------------------------
          Static Variables (Class Variables)
-----------------------------------------------------

► Definition:
A static variable is shared by **all instances** of a class. It is declared using the `static` keyword and initialized only once at class loading time.

► Characteristics:
- Belongs to the class, not to any specific object.
- All objects share the same copy of the static variable.
- Can be accessed using the class name or object reference.
- Initialized only once, regardless of how many objects are created.

► Use Case:
Used for values that should be common to all instances, like a counter, a constant, or a configuration.

-----------------------------------------------------
           Static Methods (Class Methods)
-----------------------------------------------------

► Definition:
A static method is one that can be called without creating an object of the class. It belongs to the class rather than any object.

► Characteristics:
- Can access only **static data members** and **call other static methods**.
- Cannot use `this` or `super` keywords.
- Invoked using the class name.

► Use Case:
Used for utility or helper methods that do not depend on instance variables, such as `Math.pow()`, `main()` method, etc.

-----------------------------------------------------
           Rules and Restrictions
-----------------------------------------------------

- A static method cannot access non-static (instance) variables or methods directly.
- A static block can be used to initialize static variables.
- Static members are loaded into memory when the class is loaded by the JVM.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Improves memory efficiency since static members are shared.
- Useful for shared constants, counters, or utility methods.
- Provides global access without object creation.

-----------------------------------------------------
                 Summary
-----------------------------------------------------

- Static variables and methods are associated with the **class**, not instances.
- Static variables are shared across all objects.
- Static methods can be called without object creation.
- Ideal for common data, utility code, and memory-efficient programming.
*/


class staticclass
{
	static int a = 100; // Static Variable
	int b = 50;   // -> Instance Variable 
	
	void display()
	{
		System.out.println("Static variable A : "+a);
		System.out.println("Instance Variable B : "+b);
	}
	
	static void static_Method()
	{
		System.out.println("Static Variable A from The Static Method : "+a);
		//System.out.println("Instance Variable B from The Static Method : "+b);// error: non-static variable b cannot be referenced from a static context
	}
	
}

public class Static_Vari_methods
{
	public static void main(String args[])
	{
		staticclass obj1 =new staticclass();
		obj1.display();
		obj1.static_Method();
		
		staticclass obj2 = new staticclass();
		obj2.b = 150;
		obj2.display();
		obj2.static_Method();
		
		obj1.display();
		
		obj2.a = 200;
		
		obj2.display();
		obj1.display();
		
	}
}
		