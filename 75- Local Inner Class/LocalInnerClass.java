/*
-----------------------------------------------------
             Local Inner Class in Java
-----------------------------------------------------

► Definition:
A local inner class is a class defined **within a method**, constructor, or a block, and its scope is **restricted** to that method or block.

► Use Case:
Used when a class is required only for a **short duration** or **specific logic** within a method.

-----------------------------------------------------
              Key Characteristics
-----------------------------------------------------

- Declared inside a method, constructor, or initializer block.

- It cannot be accessed from outside the method where it is defined.

- Can access **final or effectively final** local variables of the enclosing method (Java 8 and above).

- Cannot use access modifiers like `public`, `private`, `protected`, or `static`.

- It can extend a class or implement an interface.

-----------------------------------------------------
             Rules and Behavior
-----------------------------------------------------

- Local inner classes are compiled into separate `.class` files with names like `Outer$1Inner.class`.

- They are instantiated inside the method where they are defined.

- They can access members of the enclosing class directly, including private members.

- Used when you need helper classes to encapsulate logic that doesn’t need to be reused elsewhere.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Helps in organizing classes that are used only within a specific method.

- Improves encapsulation and reduces code pollution in the outer class.

- Useful in GUI applications and event-driven programming.

-----------------------------------------------------
                Summary
-----------------------------------------------------

- Local inner class is a class defined inside a method or block.

- It is limited to the scope of that method and is not visible outside.

- Offers encapsulated, method-specific logic in a clean, modular way.
*/



class shape
{
	void display()
	{
		class A
		{
			void display1()
			{
				System.out.println("From Local Inner Class.");
			}
			
		}
		
		A localclass = new A();
		localclass.display1();
	}
}
public class LocalInnerClass
{
	public static void main(String args[])
	{
		shape ObjLocal = new shape();
		ObjLocal.display();
	}
}