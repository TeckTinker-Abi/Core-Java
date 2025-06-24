import java.util.*;

public class Upper_Lower
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		StringBuilder a = new StringBuilder(input);
		
		for (int i = 0; i < a.length() ; i++)
		{
			if (a.charAt(i) >= 65  && a.charAt(i) <= 90)
			{
				a.setCharAt(i,((char)((int)a.charAt(i)+32)));
			}
		}
		System.out.println("After Changes : "+a);
	}
}