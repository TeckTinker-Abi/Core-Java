import java.util.*;

public class perfect_number_31
{
	public static void main(String args[])
	{
		System.out.println("Enter a Number - To check Whether it's perfect number ot not ! : ");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0 ;
		
		for (int i = 1; i < n; i++)
		{
			if(n%i==0)
			{
				sum += i;
			}
		}
		if (sum == n)
		{
			System.out.println("The Entered Number "+n+" is Perfect Number");
		}
		else
		{
			System.out.println("The Entered Number "+n+" is not Perfrct Number");
		}
	}
}