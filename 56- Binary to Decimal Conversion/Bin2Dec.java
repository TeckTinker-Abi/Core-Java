import java.util.*;

public class Bin2Dec
{
	public static void bin2dec(int n)
	{
		int i = 0,result =0;
		while (n != 0)
		{
			int reminder = n%10;
			result += reminder*Math.pow(2,i);
			n = n/10;
			i++;
		}
		System.out.print(result);
	}
	
	public static void main(String args[])
	{
	
		System.out.println("Enter a Binary Value : ");
		 
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		bin2dec(n);
	}
}
	