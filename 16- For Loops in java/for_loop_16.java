/*

				For Loop in Java

			Definition:
				The for loop is used when the number of iterations is known or fixed.

			Syntax:

				for (initialization; condition; update) {
					// code to execute
				}

			Rules:

				Initialization is done once at the beginning.

				Condition is checked before every iteration.

				Update statement runs after every iteration.

*/

import java.util.*;

public class for_loop_16
{
	public static void main(String args[])
	{
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i<=n ;i++)
		{
			System.out.println(i);
		}
	}
}

