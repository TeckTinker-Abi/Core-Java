/*

		Sum and Average Program in Java

	Definition:

		Sum is the total of a series of numbers.

		Average is the sum of the numbers divided by how many numbers there are.

*/



import java.util.*;

public class Sum_and_average_22
{
	public static void main(String args[])
	{
		System.out.println("Enter a Total Number - Going ton input : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 int sum = 0 ;
		 float average = 0;
		
		for (int i =1; i<=n ; i++)
		{
			System.out.println("Enter a "+i+"Number");
			
			int num = sc.nextInt();
			
			 sum = sum+num;
			
			 average = sum/n;
		}
		System.out.println("The Sum Of The Given Number is : "+sum);
		System.out.println("The Average Of The Given Number is : "+average);
	}
}