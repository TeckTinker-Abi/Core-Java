import java.util.*;

public class reverse_number_24
{
	public static void main (String args[])
	{
		
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int reverse = 0,rem;
		
		while (n!=0)
		{
			 rem = n%10;
			 reverse = (reverse*10)+rem;
			 n = n/10;
			 
		}
			System.out.println("Reversed Number : "+reverse);
	}		
}