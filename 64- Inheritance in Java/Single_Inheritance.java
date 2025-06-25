/*
								-----------------------------------------
										 Inheritance in Java
								-----------------------------------------

				► Definition:
				Inheritance is an object-oriented programming feature where one class (subclass/child) inherits the properties and behaviors (fields and methods) of another class (superclass/parent).

				► Syntax:
					class SubClass extends SuperClass {
						// additional fields and methods
					}

				► Use Case:
				- Promotes code reusability.
				- Establishes a hierarchical relationship between classes.
				- Helps in method overriding and polymorphism.

								-----------------------------------------
											Types of Inheritance
								-----------------------------------------

				1. Single Inheritance:
				   - One subclass inherits from one superclass.
				   - Java supports this directly.

				2. Multilevel Inheritance:
				   - A class inherits from a subclass which in turn inherits from another class.
				   - Java supports this directly.

				3. Hierarchical Inheritance:
				   - Multiple subclasses inherit from one superclass.
				   - Java supports this directly.

				4. Multiple Inheritance (via Interfaces):
				   - Java does not support multiple inheritance with classes.
				   - Achieved using interfaces.

				5. Hybrid Inheritance:
				   - Combination of two or more types of inheritance.
				   - Achieved using interfaces in Java.

								-----------------------------------------
											Key Concepts
								-----------------------------------------

				- `extends` keyword is used for inheritance between classes.

				- Subclass inherits:
				   - Public and protected members of superclass.
				   - Not private members.

				- Constructor of superclass is called using `super()`.

				- Method Overriding:
				   - Subclass can override superclass method for specialized behavior.

				- IS-A Relationship:
				   - Inheritance represents an “is-a” relationship.

				- Improves modularity and scalability of code.

								-----------------------------------------
											Advantages
								-----------------------------------------

				- Reusability of existing code.

				- Reduces redundancy.

				- Supports polymorphism and runtime binding.

				- Easy to maintain and extend the application.


*/




class Father
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
public class Single_Inheritance
{
	public static void main(String args[])
	{
		Son s = new Son();
		s.house();
		s.car();
	}
}

/*
								-----------------------------------------
										Single Inheritance in Java
								-----------------------------------------

				► Definition:
				Single Inheritance is a type of inheritance where one subclass (child class) inherits from one superclass (parent class).

				► Syntax:
					class Parent {
						// parent class members
					}

					class Child extends Parent {
						// child class members
					}

				► Use Case:
				Used when there is a one-to-one inheritance relationship between two classes. It promotes reusability and method overriding.

								-----------------------------------------
											Key Points
								-----------------------------------------

				- Only one parent class and one child class are involved.

				- The child class gets access to all non-private members (fields and methods) of the parent class.

				- The `extends` keyword is used to define the inheritance.

				- The child class can:
					- Use the parent class's methods and variables.
					- Override the parent class's methods if needed.

				- Parent class constructor is automatically called when a child object is created. You can explicitly call it using `super()`.

				- Enables an "is-a" relationship between child and parent class.

									-----------------------------------------
												Advantages
									-----------------------------------------

				- Simplifies the code by reusing existing logic.

				- Easy to implement and understand.

				- Lays the foundation for more complex inheritance types (like multilevel and hierarchical).

									-----------------------------------------
												Summary
									-----------------------------------------

				- Single Inheritance involves one child and one parent class.

				- It supports code reusability and method overriding.

				- It is the simplest and most common form of inheritance in Java.
*/

	