/*
				While Loop in Java

			Definition:
				The while loop is used to execute a block of code repeatedly as long as the condition is true.

			Syntax:
					while (condition) {
						// code to execute
					}
			Rules:
				Condition is checked before entering the loop.
				If the condition is false initially, loop won't execute.

*/

import java.util.*;

 public class While_14
 {
	public static void main(String args[])
	{
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 0;
		while (i<=a)
		{
			System.out.println(i);
			i++;
		}
	}
 }