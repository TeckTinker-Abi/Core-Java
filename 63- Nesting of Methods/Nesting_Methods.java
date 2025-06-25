/*
					-----------------------------------------
							 Nesting of Methods in Java
					-----------------------------------------

		► Definition:
		Nesting of methods refers to the concept where one method calls another method within the same class.

		► Syntax:
			void methodA() {
				methodB(); // methodB is called (nested) inside methodA
			}

			void methodB() {
				// some logic
			}

		► Use Case:
		Used to organize code into smaller, reusable pieces. Enhances modularity and avoids repetition.

					-----------------------------------------
								Key Points
					-----------------------------------------

		- Methods must be defined within a class.

		- A method can call another method directly if both are in the same class.

		- It helps reduce code duplication by delegating tasks to other methods.

		- It improves readability and maintainability.

		- Nesting does not mean defining a method inside another method, which is not allowed in Java.

		- All methods must be defined separately, but can be invoked from one another.

					-----------------------------------------
								Benefits
					-----------------------------------------

		- Encourages method reusability and modular design.

		- Helps break complex logic into smaller, manageable parts.

		- Makes the code easier to test and debug.

				-----------------------------------------
							Summary
				-----------------------------------------

		- Nesting of methods means calling one method from another.

		- It improves structure, modularity, and clarity in programming.

		- Actual method definition inside another is not allowed in Java.
*/



class Shape
{
	public int length,width;
	
	public Shape(int x, int y)
	{
		this.length=x;
		this.width=y;
	}
	
	int area()
	{
		int a = length*width;
		return a;
	}
	
	void display ()
	{
		int AREA = area();
		System.out.println("The Area of the Rectangle : "+AREA);
	}
}

public class Nesting_Methods
{	
	public static void main(String args[])
	{
		Shape a = new Shape(10,20);
		
		a.display();
	}
}
