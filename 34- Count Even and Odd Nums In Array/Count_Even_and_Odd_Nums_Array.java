
//TO COUNT THE EVEN AND ODD NUMBERS IN SINGLE DIMENSONAL ARRAY

import java.util.*;

public class Count_Even_and_Odd_Nums_Array
{
	public static void main(String args[])
	{
		System.out.println("Enter a limit of Array: ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a= new int[n];
		int b=0,c=0;
		
		for(int i = 0; i<n; i++) //->to get an input 1 by 1.
		{
			System.out.println("Enter the "+(i+1)+" in Array");
			a[i]=sc.nextInt();
		}
		for(int i = 0; i<a.length; i++)// -> to access the index value of array element 1 by 1.
		{
			if(a[i]%2==0)// -> check the array values is reminder == 0 ,by index values and check ,is the value is even or not.
			{
				b++;
			}
			else
			{
				c++;
			}
		}
		
		//Enhanced for Loop
		
		/*for(int element : a)
		{
			if(element%2==0)
			{
				b++;
			}
			else
			{
				c++;
			}
		}*/
		System.out.println("The Total Even Number in Array are : "+b);
		System.out.println("The Total Odd Number in Array are : "+c);
	}
}		
			