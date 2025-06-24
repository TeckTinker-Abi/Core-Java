import java.util.*;

public class armstrong_number_25
{
	public static void main(String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int digit1,digit2,digit3,temp;
		
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
}	
		
	
class armstrong_number1
{
	public static void main(String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		
		int digit1,digit2,digit3;
		
		digit3 = temp%10;
		temp = temp/10;
		
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
}	
