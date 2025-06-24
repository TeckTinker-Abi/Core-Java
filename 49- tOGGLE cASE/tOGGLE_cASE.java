import java.util.*;

public class tOGGLE_cASE
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		StringBuilder a = new StringBuilder(input);
		
		if (a.charAt(0) >= 65  && a.charAt(0) <= 90)
		{
			a.setCharAt(0,((char)((int)a.charAt(0)+32)));
		}
		
		
		for (int i = 1; i < a.length() ; i++)
		{
			if(a.charAt(i) == 32)
			{
				i++;
				if (a.charAt(i) >= 65  && a.charAt(i) <= 90)
				{
					a.setCharAt(i,((char)((int)a.charAt(i)+32)));
				}
			}
			
			else if (a.charAt(i) >= 90  && a.charAt(i) <= 122)
			{
				a.setCharAt(i,((char)((int)a.charAt(i)-32)));
			}
		}
		System.out.println("tOGGLE_cASE : "+a);
	}
}