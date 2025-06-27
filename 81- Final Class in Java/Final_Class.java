/*
-----------------------------------------------------
                  Final Class in Java
-----------------------------------------------------

► Definition:
A `final` class in Java is a class that **cannot be extended** by any other class. It is declared using the `final` keyword before the class name.

► Purpose:
Used to prevent inheritance and ensure that the class's functionality remains unchanged and secure.

-----------------------------------------------------
               Key Characteristics
-----------------------------------------------------

- A final class **cannot be subclassed**.
- All methods inside a final class are automatically non-overridable.
- Final classes can still be **instantiated** (objects can be created).
- A final class **can extend** another class but cannot be extended itself.
- A final class can **implement interfaces**.

-----------------------------------------------------
               Use Cases
-----------------------------------------------------

- Used in API design to prevent clients from modifying critical behavior.
- To create **immutable** classes that cannot be altered by subclassing.
- To ensure **security** and **consistency** in class behavior.

-----------------------------------------------------
               Rules and Restrictions
-----------------------------------------------------

- Declaring a class `final` disallows inheritance.
- A final class cannot be abstract.
- Final classes can contain static and non-static methods and variables.
- Constructors in final classes can be overloaded, but not overridden.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Prevents accidental or intentional modification of class behavior.
- Ensures **immutability** when used with final variables.
- Improves **security** in sensitive application components.
- Enhances **code reliability and maintainability**.

-----------------------------------------------------
                 Summary
-----------------------------------------------------

- Final class = class that **cannot be extended**.
- Used for safety, immutability, and to prevent unwanted inheritance.
- Promotes consistent behavior and secure code design.
*/


final class Finalclass
{
	void display()
	{
		System.out.println("From the Final Class.");
	}
}

/*
	Final-Class.java:9: error: cannot inherit from final Finalclass class b extends Finalclass
	
	Final classes should be directly call from main class methods.
                ^
class b extends Finalclass
{
	void display()
	{
		System.out.println("From the Derived class.");
	}
	
}
*/

public class Final_Class
{	
	public static void main(String args[])
	{
		Finalclass obj = new Finalclass();
		obj.display();
	}
}