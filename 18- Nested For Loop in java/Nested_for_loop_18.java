/*  Nested Loops
		Use Case: When dealing with multi-dimensional data structures or performing complex iterations. */



import java.util.*;

public class Nested_for_loop_18
{
	public static void main(String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
		 for ( int i = 0 ; i <= n ; i++) // check condition satisfied ? if go in - 1 st round -> i = 0
			{
			 for ( int j = 0 ; j <= i ; j++) // Check the condition is satisfied ? if print . then increase the value of j by 1 , now check the condition - not satisfied.then comeout and i will return to i loop, then i will get the increment then check the condition ......
			
			 {
				 System.out.print("*");
			 }
			 
			System.out.println(" ");
		 }
	}			
}		