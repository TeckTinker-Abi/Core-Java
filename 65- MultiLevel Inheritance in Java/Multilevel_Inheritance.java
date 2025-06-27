/*
						-----------------------------------------------
								 Multilevel Inheritance in Java
						-----------------------------------------------

		► Definition:
		Multilevel Inheritance is a form of inheritance where a class is derived from a class which is also derived from another class, forming a chain of inheritance.

		► Syntax:
			class A {
				// base class members
			}

			class B extends A {
				// derived from A
			}

			class C extends B {
				// derived from B
			}

		► Use Case:
		Used when there is a hierarchical relationship where each level builds upon the features of the previous level.

						-----------------------------------------------
									   Key Points
						-----------------------------------------------

		- A chain of inheritance is created where one class inherits from another, which in turn inherits from another.

		- The last class in the chain inherits members from all its ancestor classes.

		- The `extends` keyword is used at each level to inherit from the previous class.

		- Supports code reusability through multiple levels.

		- Enhances modular and layered class structure.

		- Constructors of all parent classes are called in order from top to bottom during object creation.

						-----------------------------------------------
									   Advantages
						-----------------------------------------------

		- Increases reusability by extending functionalities across multiple levels.

		- Reduces code duplication and improves maintainability.

		- Supports hierarchical program structure.

						-----------------------------------------------
									   Summary
						-----------------------------------------------

		- Multilevel Inheritance involves a chain of classes, each derived from another.

		- Provides layered extension of functionality and better class organization.

		- It is supported directly in Java using the `extends` keyword.
*/



class GrandFather
{
	void Assest()
	{
		System.out.println("Have 2 ACRES of land in Madurai.");
	}
}

class Father extends GrandFather
{	
	void house()
	{
		System.out.println("Have an 2bhk House. ");
	}
}

class Son extends Father 
{
	void car()
	{
		System.out.println("Have an Own Car. ");
		
	}
}
public class Multilevel_Inheritance
{
	public static void main(String args[])
	{
		Son s = new Son();
		s.Assest();
		s.house();
		s.car();
	}
}