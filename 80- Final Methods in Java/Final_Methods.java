/*
-----------------------------------------------------
                 Final Methods in Java
-----------------------------------------------------

► Definition:
A `final` method in Java is a method that **cannot be overridden** by subclasses. It is declared using the `final` keyword before the method signature.

► Syntax:
    final returnType methodName(parameters) {
        // method body
    }

-----------------------------------------------------
              Key Characteristics
-----------------------------------------------------

- Final methods are **inherited** but **not overrideable**.

- Prevents subclasses from modifying the method's behavior.

- Helps maintain consistent and secure functionality in a class hierarchy.

- Can be **called** from child classes, but cannot be **redefined** in them.

- Can be overloaded within the same class (method overloading is allowed).

-----------------------------------------------------
               Use Cases
-----------------------------------------------------

- Used when the method contains critical logic that must remain unchanged.

- Ensures core functionality is preserved across subclasses.

- Common in base or utility classes where behavior must be fixed.

- Helps avoid accidental or malicious overriding.

-----------------------------------------------------
                Rules and Behavior
-----------------------------------------------------

- Declaring a method as `final` restricts method overriding only.

- A `final` method can still be **inherited** and **used** in the child class.

- Cannot be `abstract` and `final` at the same time (contradictory).

- Static methods can be declared `final`, but they are already not overridden in the same way as instance methods.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Provides security and consistency to important methods.

- Prevents runtime errors due to unintended behavior changes.

- Helps enforce proper design and usage patterns.

-----------------------------------------------------
                 Summary
-----------------------------------------------------

- Final methods cannot be overridden in subclasses.

- Used to lock down important behaviors that should remain unchanged.

- Promotes reliable and secure object-oriented design.
*/



class methods
{
	final int A =5;
	final int B =10;
	
	void display()
	{

		System.out.println("From Normal Methods A : "+A);
		
	}
	
	final void finaldisplay()
	{
		System.out.println("From Final Method, A : "+A);
		System.out.println("From Final Method, B : "+B);
	}
}

class Amethods extends methods
{
	void display()
	{
		System.out.println("From Normal Methods A and B : "+A+" "+B);
	}
	
	//We can't override the finalmethod , if we need to override ->need to change the method to final from normal methods in the Superclass by removing the keyword "final".
	
	/*void finaldisplay
	{
		System.out.println("From Final Method, A : "+A);
		System.out.println("From Final Method, B : "+B);
	}*/
}

public class Final_Methods
{
	public static void main(String args[])
	{
		Amethods obj = new Amethods();
		obj.display();
		obj.finaldisplay();
	}
}