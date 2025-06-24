import java.util.*;

public class Duplicate_Nums_Array
{
	public static void main(String args[])
	{
		System.out.println("Enter an Limit for Array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		int temp=0;
		int b=0;
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println("Enter a "+(i+1)+" Element : ");
			a[i]=sc.nextInt();
		}
		for (int i = 0 ; i<a.length-1 ; i++)
		{
			for (int j = i+1; j<a.length; j++)
			{
				if(a[i] == a[j] && i!=j)
				{
					System.out.println("The Duplicate is : "+a[j]);
						
				}
				
			}	
			
		}		
		
	}
}