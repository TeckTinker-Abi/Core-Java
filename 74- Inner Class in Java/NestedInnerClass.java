
/*
-----------------------------------------------------
                Inner Class in Java
-----------------------------------------------------

► Definition:
An inner class in Java is a class defined within another class. It is also known as a nested class.

► Use Case:
Used to logically group classes that are only used in one place and to increase encapsulation and readability.

-----------------------------------------------------
               Types of Inner Classes
-----------------------------------------------------

1. **Non-static (Member) Inner Class**:
   - Defined inside another class without the `static` keyword.
   - Has access to all members (including private) of the outer class.

2. **Static Nested Class**:
   - Defined using the `static` keyword.
   - Can only access static members of the outer class.

3. **Local Inner Class**:
   - Defined inside a method or a block.
   - Scope is restricted to the method or block where it is defined.

4. **Anonymous Inner Class**:
   - A class without a name.
   - Defined and instantiated in a single expression.
   - Commonly used for implementing interfaces or abstract classes on the fly.

-----------------------------------------------------
                Key Points
-----------------------------------------------------

- Inner classes help in logically grouping classes and improving encapsulation.

- Non-static inner classes require an object of the outer class to be instantiated.

- Static nested classes can be instantiated without an outer class object.

- Local and anonymous classes are useful in event handling and short-lived use cases.

- Inner classes can access private members of the outer class.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Helps organize code in a more readable and maintainable way.

- Facilitates encapsulation by hiding inner implementation details.

- Enables closer coupling between related classes.

-----------------------------------------------------
                 Summary
-----------------------------------------------------

- Inner classes are defined within another class.

- Java supports four types: member, static, local, and anonymous.

- They provide better encapsulation, readability, and maintainability.
*/



class shape
{	
		int a = 58;
		class Shape1
		{
			int b = 60;
			void display()
			{
				
				System.out.println(a);
				System.out.println(b);
			}
		}
		
		void base1 ()
		{
			Shape1 sp1 = new Shape1();
			sp1.display();
			int c = 20;
			System.out.println(c);
			System.out.println("B from InnerClass "+sp1.b);
			
		}
}

public class NestedInnerClass
{
	public static void main(String args[])
	{
		shape Sh = new shape();
		Sh.base1();
		shape.Shape1 Sh1 = new shape().new 	Shape1();
		Sh1.display();
	}
}	