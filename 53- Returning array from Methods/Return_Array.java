import java.util.Arrays;
import java.util.*;

public class Return_Array
{
	
	
	public static int[] sortarr()
	{
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter a Limit : ");
	
		int limit = sc.nextInt();
		
		int b[] = new int[limit];
		
		for (int i = 0; i <  limit; i++)
		{
			System.out.println("Enter a "+(i+1)+" Value : ");
			b[i] = sc.nextInt();
		
		}
		Arrays.sort(b);
		return b;
	}
	
	public static void main(String args[])
	{
	  int [] n = sortarr();
	  
	  for (int a : n) System.out.print(a);
	  
	}
}
