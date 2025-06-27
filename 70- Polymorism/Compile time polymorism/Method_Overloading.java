/*
-----------------------------------------------------
           Method Overloading in Java
-----------------------------------------------------

► Definition:
Method Overloading is a feature in Java that allows a class to have more than one method with the same name but different parameter lists.

► Syntax:
    methodName(type1 arg1)
    methodName(type1 arg1, type2 arg2)
    methodName(type1 arg1, int arg2, double arg3)

► Use Case:
Used to increase the readability of the program and provide flexibility by allowing the same method name to handle different types or numbers of arguments.

-----------------------------------------------------
               Key Rules
-----------------------------------------------------

- Methods must have the **same name**.

- Methods must have **different parameter lists**:
  - Different number of parameters
  - Different data types
  - Different sequence of parameters

- Return type alone is **not enough** to distinguish overloaded methods.

- Overloading can occur within the same class or in a subclass (if methods aren't overridden).

-----------------------------------------------------
               Key Points
-----------------------------------------------------

- It is an example of **compile-time polymorphism** (static binding).

- Constructors can also be overloaded in Java.

- Helps write cleaner and more maintainable code.

- Java compiler determines which overloaded method to call based on method signature during compilation.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Improves code readability and clarity.

- Reduces the need for creating multiple method names for similar actions.

- Simplifies coding for developers by allowing method reuse with varying arguments.

-----------------------------------------------------
               Summary
-----------------------------------------------------

- Method Overloading allows multiple methods with the same name but different parameters.

- It occurs within a class and is resolved during compile time.

- It enhances flexibility and organization in method design.
*/



class Caluculation
{
	public static int multiply(int a, int b)
	{
		return a*b;
	}
	public static float multiply(float a, float b)
	{
		return a*b;
	}
	public static float multiply(float a)
	{
		return a*a;
	}
	
}

public class Method_Overloading
{
	public static void main(String args[])
	{
		System.out.println("Value is "+Caluculation.multiply(5,6));
	}
}

