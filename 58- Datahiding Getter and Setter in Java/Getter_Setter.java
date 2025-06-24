/*
					Data hiding in Java
 
 * Definition:
	 * Restricting direct access to an object's internal data (its fields),
	 * exposing only safe, controlled access through methods using encapsulation.
 
 * Why hide data?
	 * - Data integrity: Prevents invalid field modifications .
	 * - Reduced coupling: Shields implementation details from external code .
	 * - Security: Blocks unauthorized access to sensitive data.
 
 * How it works:
	 * 1. Declare fields private — they’re inaccessible directly from outside.
	 * 2. Offer public getters/setters or controlled methods for access and modifications.
	 * 3. Add validation/auth checks inside setters to enforce invariants :contentReference.
 
 * Key concepts:
	 * - Encapsulation bundles data + methods, restricting access through language constructs .
	 * - Data hiding is a specific aspect of encapsulation — hiding internal state via private fields.
	 * - Information hiding emphasizes abstract interfaces shielding implementation details.

 * Benefits:
	 * • Maintainability: Internal changes don’t affect clients .
	 * • Robustness: Prevents invalid states via validated access .
	 * • Modular & secure code: Limits coupling and unauthorized data access .
 
 * Summary:
	 * Declare data members private;
	 * expose necessary behaviour via public methods;
	 * use getters/setters to validate and safely access or modify the hidden state.
 */



class Rectangle 
{
	private int length,width;
	
	//Getter 
	
	int getLength()
	{
		return length;
	}
	
	int getWidth()
	{
		return width;
	}
	
	//Setter
	
	void setLength(int l)
	{
		if (l > 0)
		
			 length = l;
		else
			
			length = 0;
			
		
	}

	void setWidth(int w)
	{
		if (w >0)
			width = w;
		else
			width = 0;
	}
	 
	int area()
	{
		int result = length*width;
		return result;
	}
	

}

public class Getter_Setter 
{
	public static void main(String [] args)
	{
		Rectangle r1 = new Rectangle();
		r1.setLength(10);
		r1.setWidth(98);
		System.out.println("Length : "+r1.getLength());
		System.out.println("Width : "+r1.getWidth());
		System.out.println("Area : "+r1.area());
		
	}
}