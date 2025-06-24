/*

			 Enhanced For Loop in Java (For-Each Loop)

			Definition:
				The enhanced for loop (or for-each loop) is used to iterate over arrays and collections easily.

			Syntax:

				for (type element : arrayOrCollection) {
					// use element
				}

			Use Case:
				Use enhanced for loop when you want to traverse all elements in a collection or array without using index.

*/

public class Enhanced_for_loop_17
{
	public static void main(String args[])
	{
		int numbers[] ={10,20,60,70};
		
		for (int n : numbers)
		{
			System.out.println(n);
		
		}
	}
}