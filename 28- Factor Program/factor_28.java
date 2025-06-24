import java.util.*;

public class factor_28
{
	public static void main(String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++)
		{
			int a = n%i;
			if ( a == 0)
			{ 
				System.out.println("The Factor is : "+i);
			}
		}
	}
}