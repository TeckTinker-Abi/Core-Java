/*
		-----------------------------------------------------
				Method with Varargs in Java
		-----------------------------------------------------

		► Definition:
		Varargs (short for variable-length arguments) allow a method to accept **zero or more arguments** of the same type.

		► Syntax:
			returnType methodName(type... variableName) {
				// method body
			}
			
		► Use Case:
		Used when the number of input arguments is not fixed, and you want to pass multiple values to a single parameter.

		-----------------------------------------------------
					   Key Points
		-----------------------------------------------------

		- Introduced in Java 5 using the ellipsis (`...`) notation.
		- Only **one varargs parameter** is allowed per method.
		- The varargs parameter must be the **last parameter** in the method declaration.
		- Internally, varargs are treated as an **array**.
		- Useful for creating flexible methods that can handle a variety of input lengths.

		-----------------------------------------------------
					   Advantages
		-----------------------------------------------------

		- Increases method flexibility by allowing multiple inputs without overloading.
		- Reduces code duplication and simplifies method definitions.
		- Enhances readability and maintainability of code.

		-----------------------------------------------------
					   Summary
		-----------------------------------------------------

		- Varargs allow a method to receive multiple values as arguments.
		- Declared using `type... name`, and treated as an array inside the method.
		- Ideal for methods where argument count can vary.
*/



public class varargs
{
	public static void getnames(String... names)
	{
		for (String name:names) System.out.println(name);
	}
	
	public static void main (String args[])
	{
		getnames("abi","anbu");
	}
}
/*
class Greeting {

    // Varargs with other parameter
    static void greet(String greeting, String... names) {
        for (String name : names) {
            System.out.println(greeting + ", " + name);
        }
    }

    public static void main(String[] args) {
        greet("Hello", "Alice", "Bob", "Charlie");
        greet("Hi");  // No name given
    }
}


o/p -> 	Hello, Alice
		Hello, Bob
		Hello, Charlie

*/