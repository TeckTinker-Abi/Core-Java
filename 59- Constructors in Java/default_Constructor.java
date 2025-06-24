/*
					Constructors in Java 
 
 * Definition:
	 * A constructor is a special method-like block called automatically upon object creation,
	 * with the same name as the class and no return type.
 
 * Key Features:
	 * - Name matches the class name.
	 * - No return type—not even void.
	 * - Automatically invoked when using the `new` keyword.
	 * - Can be overloaded: multiple constructors with different parameters.
	 
 * Types of Constructors:
	 * 1. Default Constructor
	 *    - No args, automatically provided by compiler if none defined.
	 *    - Initializes fields to default values: 0, null, false, etc. 
	 *
	 * 2. No‑Arg Constructor
	 *    - Explicitly defined without parameters.
	 *    - Used to perform setup or default initialization.
	 *
	 * 3. Parameterized Constructor
	 *    - Accepts parameters to initialize the object with custom values.
	 *
	 * 4. Copy Constructor
	 *    - Takes another object of the same class to create a copy.
	 *    - Java doesn't auto-generate this; you must define it manually.
	 
 * - Supports chaining:
	 *     • `this(...)` to call another constructor in the same class.
	 *     • `super(...)` to invoke a superclass's constructor.
	 * - Access modifiers allowed on constructors: public, protected, package-private, private.
	 * - Cannot be declared final, static, abstract, or synchronized.
	 * - Not inherited by subclasses—each class must define its own constructors.
 
 * Common Types:
	 * - Default (no-arg) constructor: auto-generated if no constructors are provided.
	 * - No-argument constructor: explicitly defined without parameters.
	 * - Parameterized constructor: accepts arguments for customized initialization.
	 * - Copy constructor: creates a new object by copying fields of another object.
 
 * Benefits:
	 * - Ensures objects are initialized to a consistent, valid state.
	 * - Enables flexibility in object creation through overloads.
	 * - Centralizes initialization logic for easier maintenance.
 
 * Restricting Access:
	 * - Private constructors prevent object creation outside the class,
	 *   useful in Singletons or utility classes.
 
 * Summary:
	 * Use constructors to build objects right:
	 *   • Same name, no return type
	 *   • Overload for flexibility
	 *   • Chain calls to reuse logic
	 *   • Apply access modifiers to control instantiation
 */






class Rectangle 
{
	int length, width;
	
	Rectangle()
	{
		System.out.println("Constructor Called ");
		length = 40;
		width = 50;
		
	}
	
	int area ()
	{
		int a = length*width;
		return a ;
	}
	
}

public class default_Constructor
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		System.out.println("Area : "+r1.area());
	}
}