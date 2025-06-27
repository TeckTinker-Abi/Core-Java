/*
-----------------------------------------------------
                Static Block in Java
-----------------------------------------------------

► Definition:
A static block is a block of code enclosed in `{}` and marked with the `static` keyword. It is executed **only once** when the class is first loaded into memory by the JVM.

► Syntax:
    static {
        // initialization code
    }

-----------------------------------------------------
               Key Characteristics
-----------------------------------------------------

- Executes automatically when the class is loaded, **before the main method** and before any object is created.

- Used to initialize static variables or perform setup operations.

- Can be multiple static blocks in a class — they execute in the order in which they appear.

- Does not belong to any object or instance; runs independently of object creation.

- Static blocks cannot access non-static variables or methods directly.

-----------------------------------------------------
               Use Cases
-----------------------------------------------------

- Initializing complex static variables (like database connections, config files, etc.).

- Performing configuration or setup code that should run once for the entire class.

- Logging or validation that needs to be done at the time of class loading.

-----------------------------------------------------
           Rules and Behavior
-----------------------------------------------------

- Executes **once** per class loader — no matter how many objects are created.

- Runs before constructors or instance initializer blocks.

- Cannot use `this` or `super` inside static blocks.

- Commonly used alongside `static` variables and `static` methods.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Provides a centralized way to perform class-level initialization.

- Reduces duplication by running setup code only once.

- Useful for loading external resources or registering drivers.

-----------------------------------------------------
                 Summary
-----------------------------------------------------

- Static blocks are executed when the class is loaded by JVM.

- They are used for initializing static data or running setup code.

- Only static members can be directly accessed inside static blocks.

- Executes once, regardless of the number of objects created.
*/


class staticclass
{
	static
	{
		System.out.println("From Static Class, static block 1 Executed.");
	}
	
	static
	{
		System.out.println("From Static Class, static block 2 Executed.");
	}
}

public class staticblocks
{
	static
		{
			System.out.println("From Main Class, static block 1 Executed.");
		}
	public static void main(String args[])
	{	
		
		
		staticclass obj = new staticclass();
		
		System.out.println("From Main Class method.");

	}
	
	static
		{
			System.out.println("From Main Class, static  block 2 Executed.");
		}
}
		
	
	
	