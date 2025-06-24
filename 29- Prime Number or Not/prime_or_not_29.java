import java.util.*;

public class prime_or_not_29
{
	public static void main(String args[])
	{
			System.out.println("Enter a Number : ");
				Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int f = 0 ;
			
			for(int i = 1; i <= n ; i++)
			{
				if(n%i==0)
				{
					f++;
				}
			}
			if(f == 2)
			{
				System.out.println("The Given Number  "+n+" is Prime. ");
			}
			else
			{
				System.out.println("The Given Number  "+n+" is Not a Prime. ");
			}	
	}
}	