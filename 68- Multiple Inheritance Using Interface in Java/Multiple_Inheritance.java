/*
							--------------------------------------------------
									   Multiple Inheritance in Java
							--------------------------------------------------

			► Definition:
			Multiple Inheritance is a type of inheritance in which a class can inherit features from more than one parent class.

			► Conceptual Syntax:
				class A { ... }
				class B { ... }
				class C extends A, B { ... }   // Not allowed in Java..
				
				


			► Use Case:
			Used when a class needs to inherit functionalities from multiple sources.

							--------------------------------------------------
										  Key Points
							--------------------------------------------------

			- Java does **not support multiple inheritance with classes** to avoid **ambiguity issues** such as the **Diamond Problem**.

			- However, Java **supports multiple inheritance through interfaces**.

			- A class can implement multiple interfaces using the `implements` keyword.

			- Java interfaces provide a safe way to achieve multiple inheritance without the ambiguity of method resolution.

			- If two interfaces have the same method signature, the implementing class must override that method to resolve the conflict.

				Interface1      Interface2
				 \            /
				  \          /
				   \        /
				Class (implements both)

							--------------------------------------------------
										  Advantages
							--------------------------------------------------

			- Allows a class to inherit behavior from multiple sources using interfaces.

			- Promotes modularity and flexibility in design.

			- Eliminates redundancy and improves reusability through abstraction.

							--------------------------------------------------
										  Summary
							--------------------------------------------------

			- Java does not allow multiple inheritance with classes.

			- Multiple inheritance is achieved in Java using **interfaces**.

			- This avoids the problems of class-based multiple inheritance while providing flexibility in code design.
*/


interface A
{
	public void displayA();
}

interface B
{
	public void displayB();
}

class C implements A,B
{
	public void displayA()
	{
		System.out.println("From interface A. ");
	}
	
	public void displayB()
	{
		System.out.println("From interface B. ");
	}
	
	public void displayC()
	{
		System.out.println("From Class. ");
	}
}
	
public class Multiple_Inheritance
{
	public static void main(String args[])
	{
		C a = new C();
		
		a.displayA();
		a.displayB();
		a.displayC();
	}
}
