/*
			-----------------------------------------
					Array of Objects in Java
			-----------------------------------------

			► Definition:
				An array of objects in Java is a collection where each element is a reference to an object. 
				It allows storing multiple objects of the same class in a single array structure.

			► Syntax:
				ClassName[] arrayName = new ClassName[size];

			► Use Case:
				Used when you need to manage and operate on a fixed-size collection of related objects efficiently.

			-----------------------------------------
						  Key Points
			-----------------------------------------

			 -> All elements in the array must be objects of the same class type.

			 -> Arrays store object references, not the actual objects themselves.

			 -> You must initialize each object in the array separately using constructors.

			 -> Can be used in loops to access or modify each object in the array.

			 -> Commonly used in cases like student records, employee data, product listings, etc.

			 -> Useful for batch processing of objects using loops.

			-----------------------------------------
						   Rules
			-----------------------------------------

			1. The array must be declared with a class type.
			2. Each object must be instantiated before use.
			3. Index starts from 0 and goes up to (length - 1).
			4. Can be combined with constructor overloading for dynamic initialization.

			-----------------------------------------
						  Summary
			-----------------------------------------

			 Array of Objects helps store multiple object instances in one array.
			 Supports code reuse, easy iteration, and better data organization.
			 Each element in the array must be created using `new` before accessing its members.
			*/



class array
{
	public int Rollno;
	public String Name;
	
	array(int x, String y)
	{
		this.Rollno=x;
		this.Name=y;
	}
	
	void display ()
	{
		System.out.println("Rollno : "+Rollno);
		System.out.println("Name   : "+Name);
		System.out.println("-------------------------");
	}
}
public class ArraysofObject
{
		public static void main(String args[])
		{
		
			array [] student;
			student = new array[5];
			
			student[0] = new array(2209,"Abishek");
			student[1] = new array(2210,"Ajith");
			student[2] = new array(2211,"Abu");
			student[3] = new array(2212,"Yasin");
			student[4] = new array(2213,"Allen");
			
			for (int i = 0; i<student.length; i++)
			{
				student[i].display();
			}
		}
}