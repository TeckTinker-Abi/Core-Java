import java.util.*;

public class prime_or_not_1_999_30
{
	public static void main(String args[])
	{
		int f = 0;
		
		for (int i = 1; i<=999; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				if(i%j==0)
				{
					f++;
				}
			}
			if(f == 2)
			{
				System.out.println("The Given Number  "+i+" is Prime. ");
			}
			f=0;
		}
	}
}