/*
						--------------------------------------------------
									Hybrid Inheritance in Java
						--------------------------------------------------

			► Definition:
			Hybrid Inheritance is a combination of two or more types of inheritance (like single, multilevel, and hierarchical inheritance) in a single program.

			► Example Structure (Conceptual):
				- One class inherits from two or more classes (hierarchical),
				- One of those parent classes may itself be derived from another class (multilevel),
				- Or multiple interfaces may be implemented (multiple inheritance via interface).

			► Use Case:
			Used when complex relationships exist between classes that require combining multiple inheritance types to achieve the desired functionality.

						--------------------------------------------------
									  Key Points
						--------------------------------------------------

			- Java does **not support hybrid inheritance using classes alone** to avoid ambiguity problems like the **Diamond Problem**.

			- Hybrid inheritance is **achieved in Java through interfaces**, not by extending multiple classes.

			- You can extend one class and implement multiple interfaces in a single class.

			- This helps combine the benefits of multiple, hierarchical, and multilevel inheritance safely.

			- Helps design modular, flexible, and reusable code structures.

						--------------------------------------------------
									  Advantages
						--------------------------------------------------

			- Enables use of multiple inheritance behavior safely using interfaces.

			- Supports complex design needs by combining different inheritance types.

			- Promotes flexibility and avoids code duplication.

							--------------------------------------------------
										  Summary
							--------------------------------------------------

			- Hybrid Inheritance is a mix of different inheritance types.

			- Java supports hybrid inheritance **through a combination of class and interface inheritance**.

			- It provides the flexibility of multiple inheritance while avoiding its pitfalls.
			*/



class calculator   //->Parent class 
{
	 public int a,b;
	 
	 
}


class sum extends calculator // derived class
{
	sum(int x,int y)
	{
		this.a = x;
		this.b = y;
	}
	 
	int sum ()
	{
		int c = a+b;
		return c;
	}
}

class average extends sum // multilevel inheritance
{
	average(int x,int y)
	{
		super(x,y);
	}
	
	
	float avr()
	{
		float d = sum()/100;
		return d;
	}
}

class sub extends calculator //-> Single Inheritance
{
	sub(int x,int y)
	{
		this.a = x;
		this.b = y;
	}
	 
	 int sub ()
	 {
		int c = a+b;
		return c;
	}
}

public class Hybrid_Inheritance
{
		public static void main(String args[])
		{
			average av = new average(100,60);
			
			System.out.println("The Sum value of the numbers is " +av.sum());
			System.out.println("The Average value of the numbers is " +av.avr());
			
			sub s = new sub(10,60);
			
			System.out.println("The Sub value of the numbers is " +s.sub());
		}
}
			
			
			
			