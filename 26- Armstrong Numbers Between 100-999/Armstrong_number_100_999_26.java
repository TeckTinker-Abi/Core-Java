import java.util.*;

public class armstrong_number_100_999_26
{
	public static void main(String args[])
	{
		System.out.println("Enter any three digit number to check the given number is Armstrong or not ! : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int digit1,digit2,digit3,temp;
		
		if ( n>= 100 && n<=999)
		{
			digit3 = n%10;
			temp = n/10;
			
			digit2 = temp%10;
			temp = temp/10;
			
			digit1=temp;
			
			int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
			
			if (result == n)
			{			
				System.out.println("the Given Number is armstrong_number :  "+result);
			}
			else
			{
				System.out.println("The Given Number is Not Amstrong Number .");
			}
		}
		else 
		{ 
			System.out.println("You have Entered a incorrect digit of values , Try Again");
		}
	}
}

class Amstrong_Nums_100_999
{
	public static void main(String args[])
	{
		int digit1,digit2,digit3,temp,number;
		
		for (number = 100; number<=999;	number++)
		{
			temp = number;
			
			digit3 = temp%10;
			temp = temp/10;
			
			digit2 = temp%10;
			temp = temp/10;
			
			digit1 = temp;
			
			int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
			if (number == result)
			{
				System.out.println(result+"is Amstrong Number");
			}
		}
	}
}
