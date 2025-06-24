/*
								Object-Oriented Programming (OOP) in Java 
								
				It is a paradigm that structures software design around objects, which encapsulate both data and behavior. 
				This approach enhances modularity, reusability, and scalability in software development.

									Core Concepts of OOP in Java
				Class and Object :

					Class: A blueprint for creating objects, defining attributes (fields) and behaviors (methods).

					Object: An instance of a class representing a real-world entity with state and behavior.

				Encapsulation :

					Bundles data (fields) and methods that operate on the data into a single unit (class).

					Restricts direct access to some of an object's components, enhancing security and integrity.

				Inheritance :

					Enables a new class (subclass) to inherit attributes and methods from an existing class (superclass).

					Promotes code reusability and hierarchical classification.

				Polymorphism :

					Allows methods to perform different tasks based on the object that invokes them.

					Achieved through method overloading (compile-time) and method overriding (runtime).

				Abstraction :

					Hides complex implementation details and shows only the essential features of an object.

					Implemented using abstract classes and interfaces.

*/

class Rectangle
{
	int length,breath;
	
	void getValues(int x ,int y)
	{
		length =x;
		breath = y;
	}
	
	int area()
	{
		int a = length*breath;
		return a;
	}
}
public class Class_Object
{
	public static void main(String [] args)
	{
		Rectangle r1 = new Rectangle();
		r1.length = 10;
		r1.breath = 20;
		System.out.println("Area is " +r1.area());
		
		Rectangle r2 = new Rectangle();
		r2.length = 10;
		r2.breath = 50;
		System.out.println("Area is " +r2.area());
	}
}
	
