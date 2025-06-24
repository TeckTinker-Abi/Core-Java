import java.util.*;

public class Dec2Bin
{	
	public static void dec2bin(int n)
	{
		int [] b = new int[1000];
		int i = 0;
		while (n >0)
		{
			b[i] = n%2;
			n = n/2;
			i++;
		}
		for (int j = i-1; j>=0; j--)
		{
			System.out.print(b[j]);
		}
		
	}
	
		public static void main (String aargs[])
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a Decimal value : "); 
		int a = sc.nextInt();
		
		dec2bin(a);
		
	}
}
