import java.util.*;

public class Fibonacci_23
{
	public static void main (String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
		 int a = -1,b = 1 , c ;
		 
		
		for (int i = 1 ; i <=n ; i++)
		{
			c = a+b;
			
			System.out.println(c);
			
			a=b;
			b=c;
		}
	}
}