/*
						-----------------------------------------
							Parameterized Constructor in Java
						-----------------------------------------

			► Definition:
				A parameterized constructor is a constructor that accepts arguments to initialize an object with specific values when it is created.

			► Syntax:
				ClassName(Type1 arg1, Type2 arg2, ...) {
					// initialization code
				}

			► Use Case:
				Used when you want to assign values to object properties at the time of object creation.

			► Key Points:
				* It allows object initialization during instantiation.
				* Eliminates the need for separate setter methods after object creation.
				* Can have multiple parameterized constructors using constructor overloading.

							-----------------------------------------
								  Constructor Overloading in Java
							-----------------------------------------

			► Definition:
				Constructor Overloading means having more than one constructor in a class with different parameter lists.

			► Use Case:
				It allows creating objects in different ways with varying information.

			► Rules:
				1. Constructor names must be same as class name.
				2. Parameter list must differ by number, type, or order of parameters.

			► Key Points:
				* Helps initialize objects flexibly.
				* Supports both default and parameterized versions.
				* Enhances readability and reusability of class design.

							-----------------------------------------
								  Combined Summary
							-----------------------------------------

				* Parameterized Constructor initializes object with given values.
				* Constructor Overloading allows multiple ways to construct an object.
				* Improves flexibility and maintainability in object-oriented programming.
*/



class Rectangle
{
	int length,width;
	
	public Rectangle()// Default Construtor
	{
		length = 2;
		width = 6;
	}
	
	Rectangle(int x, int y)// Parameterized Constructors
	{
		length = x;
		width = y;
	}
	
	Rectangle (int x)
	{
		length=width=x;
	}
	
	int area()
	{
		int a = length*width;
		return a;
	}
}

public class Parameterized_Constructors
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		System.out.println("Area of the Triangle : "+r.area());
		
		Rectangle r1 = new Rectangle(10,20);
		System.out.println("Area of the Triangle : "+r1.area());
		
		Rectangle r2 = new Rectangle(20);
		System.out.println("Area of the Triangle : "+r2.area());
	}
}