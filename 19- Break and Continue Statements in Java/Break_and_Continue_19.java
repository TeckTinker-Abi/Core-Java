/* 		Break and Continue Statements

	break: Used to exit from a loop or switch statement early.

	continue: Skips current iteration and goes to next loop cycle.

*/

import java.util.*;

public class Break_and_Continue_19
{
	public static void main (String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0 ; i<=n ; i++)
		{
			if ( i == 8)
			{
				continue;
			}
			System.out.println(i);
			if ( i == 10 )
			{
				break;
			}
		}
	}
}