import java.util.*;


public class multiplication_table_27
{
	public static void main(String args[])
	{
		System.out.println("Enter the Table : ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		System.out.println("Enter a Limit : ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n ; i++)
		{
			int result = i*t;
			System.out.println("Mupltipilication of "+i+"*"+t+"="+result);
		}
	}
}