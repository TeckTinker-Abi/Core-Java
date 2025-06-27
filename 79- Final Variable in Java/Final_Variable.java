/*
-----------------------------------------------------
                 Final Variables in Java
-----------------------------------------------------

► Definition:
A `final` variable in Java is a constant. Once assigned, its value **cannot be changed**. 
It is a way to create immutable references and constants in Java.

► Syntax:
    final dataType variableName = value;

-----------------------------------------------------
              Key Characteristics
-----------------------------------------------------

- The value of a final variable must be assigned **only once**.

- It can be:
  - A primitive type (e.g., int, float)
  - A reference type (e.g., object, array)

- For **primitive types**, the value itself is constant.
- For **reference types**, the reference is constant, but the object it points to can still be modified.

- Can be declared at:
  - Class level (as a constant)
  - Inside a method (as a local final variable)
  - As a parameter (final parameter)

- Final variables must be **initialized** either:
  - At the time of declaration, or
  - In the **constructor** (if they are instance variables), or
  - In a **static block** (if they are static final variables).

-----------------------------------------------------
             Types of Final Variables
-----------------------------------------------------

1. **Final Instance Variable** – tied to object, value assigned once.
2. **Final Static Variable (Constant)** – tied to class, shared by all objects.
3. **Final Local Variable** – declared inside methods, value fixed within method.
4. **Final Parameters** – used to prevent changing method arguments.

-----------------------------------------------------
               Use Cases
-----------------------------------------------------

- Declaring constants like `PI`, `MAX_VALUE`, configuration limits, etc.

- Making sure critical values are not modified during execution.

- Enhancing security and immutability in code.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Improves code safety by preventing accidental changes.

- Supports the design of immutable classes.

- Makes the code more readable and reliable.

-----------------------------------------------------
                 Summary
-----------------------------------------------------

- A final variable in Java can be assigned only once and cannot be changed afterward.

- Used to declare constants or enforce immutability.

- Helps prevent errors and makes the code robust and maintainable.
*/


class final_Var
{
	final int ABC = 1;
	final int MIN ;
	final int MAX ;
	
	final_Var(int x)
	{
		MIN = x;
		MAX = 100;
	}
	
	void display()
	{
		System.out.println("Final Variable Default Initialized Variable : "+ABC);
		System.out.println("Final Variable Constructor Object  Initialized Variable : "+MIN);
		System.out.println("Final Variable Constructor Initialized Variable : "+MAX);
	}
	
}

public class Final_Variable
{	
	public static void main(String args[])
	{
		final_Var obj = new final_Var(30);
		
		obj.display();
	}
}

		
		