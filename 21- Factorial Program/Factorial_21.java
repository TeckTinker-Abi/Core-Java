import java.util.*;

public class Factorial_21
{
	public static void main (String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 1;
		
		for ( int i = 1 ; i<=n ; i++)
		{
			 sum = sum*i;
		}
		System.out.println("Factorial of Given Numeber is : "+sum);
	}
}
