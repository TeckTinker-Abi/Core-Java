/*
-----------------------------------------------------
            Anonymous Class in Java
-----------------------------------------------------

► Definition:
An anonymous class in Java is a **class without a name**. It is defined and instantiated **at the same time**, usually to override methods or provide implementation of an interface or abstract class on the spot.

► Use Case:
Used when you need to create a **one-time object** with a specific behavior, especially for short-lived use cases like event handling or callbacks.

-----------------------------------------------------
              Key Characteristics
-----------------------------------------------------

- Created using the `new` keyword along with a class or interface name.

- Instantiated directly without explicitly defining a separate class.

- Used to override methods or provide custom implementation instantly.

- Commonly used in:
  - GUI event handling
  - Thread creation
  - Functional interfaces (with Java 8+)

- Cannot have constructors because it has no name.

- Can extend a class or implement an interface, but only **one** at a time.

- Limited in scope and cannot be reused elsewhere.

-----------------------------------------------------
              Rules and Behavior
-----------------------------------------------------

- Cannot declare static members inside the anonymous class (except static final constants).

- Can access final or effectively final variables from the enclosing scope.

- Anonymous class is compiled as an inner class and named like `Outer$1.class`.

- Helps reduce code clutter for simple implementations.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Provides concise code for short-term use.

- Improves readability when a full class definition would be excessive.

- Useful for quick overrides without creating separate class files.

-----------------------------------------------------
                Summary
-----------------------------------------------------

- Anonymous class is a one-time-use class without a name.

- Commonly used for implementing interfaces or abstract classes briefly.

- Helps keep code short and focused, especially in event-driven and functional programming scenarios.
*/


abstract class A
{
	abstract void a();
}

class B
{
	void display()
	{
	  A AnoClass = new A(){
	   
		   void a()
		   {
				System.out.println("From Ananomus Class.");
		   }
	   
			
		};
		AnoClass.a();
	}
}

public class AnonyumousInnerClass 
{
	public static void main(String args[])
	{	
		B obj = new B();
		obj.display();
	}
}
	