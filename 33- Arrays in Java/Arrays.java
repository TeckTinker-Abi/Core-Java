/*

									Array in Java

	Definition of Array in Java
		An array in Java is a collection of elements of the same data type, stored in a contiguous memory location, and accessed using an index.
		It is a container object that holds a fixed number of values.

		Example: int[] numbers = {10, 20, 30};
		
		| Feature               | Description                                   |
		| --------------------- | --------------------------------------------- |
		| Fixed Size            | Once created, the size cannot be changed.     |
		| Indexed Access        | Elements are accessed using zero-based index. |
		| Homogeneous           | Stores elements of the **same data type**.    |
		| Stored in Heap Memory | Arrays are objects in Java.                   |
		| Zero-based indexing   | Index starts from 0 to (n-1).                 |

		 Types of Arrays
					1. Single-Dimensional Array

		int[] marks = {80, 90, 85};
		System.out.println(marks[1]); // Output: 90
					2. Multi-Dimensional Array

		int[][] matrix = { {1, 2}, {3, 4} };
		System.out.println(matrix[1][0]); // Output: 3
		
		Common Array Methods & Properties:
		
		| Property/Method          | Description                             |
		| ------------------------ | --------------------------------------- |
		| `array.length`           | Returns number of elements in the array |
		| `Arrays.sort(array)`     | Sorts the array                         |
		| `Arrays.toString(array)` | Converts array to string                |
		| `Arrays.copyOf()`        | Copies the array                        |
		| `Arrays.equals()`        | Compares arrays                         |
		
		Rules of Arrays in Java:
		
				Arrays must be declared with a data type.

				Array size must be specified during initialization.

				Index starts at 0.

				Accessing invalid index gives ArrayIndexOutOfBoundsException.

				All elements are initialized to default values:

				0 for int, 0.0 for double, false for boolean, null for objects.
				
		Array Limitations:
		
				Fixed size – cannot be resized dynamically.

				Cannot store mixed data types.

				To overcome these, use ArrayList, which is dynamic.
				
		 Conclusion:
		 
				Arrays are fixed-size collections of similar data types.

				They are efficient for indexed access.

				Java provides the Arrays utility class for many operations.

				Always validate array index to avoid exceptions.



*/


import java.util.*;
import java.util.Arrays;

class Array
{
	public static void main(String args[])
	{
	 //index values- 0  1  2  3  4  5  6 .........
		int a[] = {10,20,30,60,40,50,70,80,90,100};
		
		//Accesssing a Array Element using Index Values 
		
		System.out.println("The Array Element is : "+a[0]);
		
		// Accessing the array element using For Loop
		
		for (int i=0; i < a.length; i++)
		{
			System.out.println("The Array Elements are : "+a[i]);
		}
		
		
		// Acessing all the Array element using Enhanced for loop
		
		for (int num : a)
		{
			System.out.println("The Elements in the array is : "+num);
		}
		
		
		
		
		int[] c;//Declaring the Array
		c = new int[10]; //Memory Allocate
		int[] d = new int[10]; // combing Both
		
		
		for ( int element : c)
		{
		System.out.println("The Elements in the  c (Enhanced)array is : "+element);//-> it will show the array element like [0,0,0,0,0,0,0,0,0,0}, because the array is an emty and we declared the limit is 10 , so it will the the memory as default (0).
		}
		
		 
		// to Get an Array Input From the User
		
		System.out.println("Enter the Array Limit : ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] b = new int[n]; 
		for (int i = 0; i<n; i++)
		{
			System.out.println("Enter the "+(i+1)+" Element : ");
			b[i]=sc.nextInt();
		}
		
		System.out.println("The Entered Array is : "+b);// it will show the array memory reference -> arrayName is an object, and this prints the object’s memory reference, not its contents.
		System.out.println("The Entered Array is : "+Arrays.toString(b));//-> Arrays is a class in java.util package, and toString() is a static method that returns a readable string like [10, 20, 30].
		
	}
}
		
	