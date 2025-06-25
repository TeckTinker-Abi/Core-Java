/*
		--------------------------------------------------
				Hierarchical Inheritance in Java
		--------------------------------------------------

		► Definition:
		Hierarchical Inheritance is a type of inheritance where multiple subclasses inherit from a single superclass.

		► Syntax:
			class Parent {
				// parent class members
			}

			class Child1 extends Parent {
				// inherits from Parent
			}

			class Child2 extends Parent {
				// inherits from Parent
			}

		► Use Case:
		Used when multiple classes share common behavior or properties from a single parent class but have their own specialized features.

				--------------------------------------------------
								Key Points
				--------------------------------------------------

		- One superclass is extended by two or more subclasses.

		- Each subclass gets a copy of the parent class’s accessible members.

		- Promotes code reusability and structured class design.

		- Enables method overriding in each child class for customized behavior.

		- The `extends` keyword is used by each child class to inherit from the common parent.

		- Parent class constructor is invoked when a child object is created.

				--------------------------------------------------
							   Advantages
				--------------------------------------------------

		- Common properties and methods are defined once in the parent class.

		- Reduces redundancy and improves consistency.

		- Easier maintenance and better organization of code.

				--------------------------------------------------
								Summary
				--------------------------------------------------

		- Hierarchical Inheritance involves one parent class and multiple child classes.

		- Allows sharing of common functionality while enabling child-specific behaviors.

		- Directly supported in Java using the `extends` keyword.

*/




class Shape 
{
	int length,width,radius;
	
}

class Rectangle extends Shape
{
	Rectangle(int x, int y)
	{
		this.length = x ;
		this.width = y ;
	}
	
	int area ()
	{
		int a = length*width;
		return a;
	}
}

class Circle extends Shape
{
	Circle(int x)
	{
		this.radius = x ;
		
	}
	
	float Radius()
	{
	 return 3.14f*(radius*radius);
	}
	
}

class Square extends Shape
{
	Square(int x)
	{
		this.length = x ;
	}
	
	int area ()
	{
		
		return length*length;
	}
}

public class Hierachical_Inheritance
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(10,20);
		System.out.println("Area of Rectangle is "+r.area());
		
		Circle c = new Circle(5);
		System.out.println("Radius of circle is "+c.Radius());
		
		Square s = new Square(10);
		System.out.println("Area of Square is "+s.area());
		
	}
}