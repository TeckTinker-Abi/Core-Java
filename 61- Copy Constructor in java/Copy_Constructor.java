/*
				-----------------------------------------
						Copy Constructor in Java
				-----------------------------------------

		Definition:
			A copy constructor is a constructor that creates a new object by copying the fields of another object of the same class.

		Syntax:
			ClassName(ClassName obj) {
				// copy field values from obj to the current object
			}

		Use Case:
			Used when you want to create a duplicate object with the same state as an existing object.

		► Key Points:
			 Java does not provide a built-in copy constructor like C++, but you can define your own.
			 The copy constructor accepts an object of the same class as a parameter.
			 It helps in cloning objects safely without using `clone()` method.
			 Ensures deep copy or shallow copy as needed, based on how fields are copied.
			 Useful in copying complex objects or when you need custom copy behavior.

		► Note:
			- Unlike C++, Java doesn't implicitly call a copy constructor.
			- You have to explicitly create and call it to copy objects.

				-----------------------------------------
						Summary
				-----------------------------------------

		 Copy Constructor duplicates an object’s state.
		 Defined manually in Java; not built-in like in C++.
		 Offers control over deep or shallow copying.
		 Enhances data integrity by preventing reference conflicts.
*/


class ComplexNum 
{
	int real,img;
	
	public ComplexNum()
	{
		real = 10;
		img = 3;
	}
	
	ComplexNum(int x, int y)
	{
		this.real=x;
		this.img=y;
	}
	
	public ComplexNum(ComplexNum c1)
	{
		this.real=c1.real;
		this.img=c1.img;
	}
	
	public String toString()
	{
		return real+" + "+img+"i";
	}
}

public class Copy_Constructor
{
	public static void main(String args[])
	{
		ComplexNum c = new ComplexNum();
		System.out.println("ComplexNum of Default Construct : " +c);
		
		ComplexNum c1 = new ComplexNum(5,8);
		System.out.println("ComplexNum of Parametrized Construct : " +c1);
		
		ComplexNum c2 = new ComplexNum(c1);
		System.out.println("ComplexNum of Copy Construct : " +c2);
	}
}
		
		