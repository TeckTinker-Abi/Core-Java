import java.util.*;

public class do_while_15
{
	public static void main (String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		do {
			System.out.println(i);
			i = i+2;
		}
		while(i<=n);
	}
}
