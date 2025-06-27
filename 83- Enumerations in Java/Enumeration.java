/*
-----------------------------------------------------
               Enumeration (Enum) in Java
-----------------------------------------------------

► Definition:
An **enum** in Java is a special data type used to define a fixed set of **named constants**. It improves type safety and makes code more readable when dealing with a known set of values.

► Syntax:
    enum EnumName {
        CONSTANT1, CONSTANT2, CONSTANT3;
    }

-----------------------------------------------------
              Key Characteristics
-----------------------------------------------------

- Each constant in an enum is an object of that enum type.
- Enums **extend java.lang.Enum** implicitly.
- Enum constants are **public**, **static**, and **final** by default.
- Cannot create instances of enum using `new` keyword.
- Can include **fields, constructors, and methods** like a regular class.
- Can be used in **switch statements**, **if conditions**, and **loops**.

-----------------------------------------------------
             Features of Enum in Java
-----------------------------------------------------

- Type-safe representation of constant values.
- Enums can implement interfaces but **cannot extend** other classes.
- You can define constructors, fields, and methods inside an enum.
- Enums can be used to group related constants like days, directions, states, etc.

-----------------------------------------------------
               Use Cases
-----------------------------------------------------

- Defining a fixed set of constants like:
  - Days of the week
  - Months
  - Directions (NORTH, SOUTH, EAST, WEST)
  - Status codes (SUCCESS, ERROR, PENDING)

- Useful in **switch-case**, **configuration**, **state machines**, etc.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Improves code **readability**, **safety**, and **maintenance**.
- Prevents use of invalid values compared to traditional constants.
- Easier debugging and better integration with tools and IDEs.
- Built-in methods like `.values()`, `.ordinal()`, and `.name()` add utility.

-----------------------------------------------------
                 Summary
-----------------------------------------------------

- Enum is a data type for defining fixed sets of constants.
- Safer and more powerful than using primitive constants.
- Supports methods, constructors, and implements interfaces.
- Widely used in Java applications for clean and maintainable code.
*/


public class Enumeration
{
	enum Gamelevel {
		LOW,MEDIUM,HIGH
		}
		
	public static void main(String args[])
	{
		Gamelevel a = Gamelevel.LOW;
		
		System.out.println(a);
		
		switch(a)
		{
			case HIGH :
				System.out.println("The Game Level is High.");
				break;
			case MEDIUM :
				System.out.println("The Game Level is MEDIUM.");
				break;
			case LOW :
				System.out.println("The Game Level is LOW.");
				break;
		}
		
		for (Gamelevel level : Gamelevel.values()) System.out.println(level);
		
	}
}