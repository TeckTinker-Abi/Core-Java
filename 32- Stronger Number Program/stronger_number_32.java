import java.util.*;

public class stronger_number_32
{
	public static void main (String args[])
	{
		int num,orginalnum,rem,fact,i,sum=0;
		System.out.println("Enter a Number -> TO check whether the Given Number is Strong Number or Not : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		orginalnum = num;
		
		while(num!=0)
		{
			rem = num%10;
			System.out.println("Split : "+rem);
			fact =1;
			for(i=1; i<=rem; i++)
			{	
				fact *=i;	
			}
			System.out.println("Factorial : "+fact);
			sum += fact;
			num = num/10;
			System.out.println("Final Value : "+sum);
			
		}
		if(sum == orginalnum)
		{
			System.out.println("The Given Number "+orginalnum+" is Stronger Number.");
		}
		else
		{
			System.out.println("The Given Number "+orginalnum+" is Not a Stronger Number.");
		}
	}
}