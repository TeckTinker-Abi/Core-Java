public class Jagged_Array 
{
	public static void main(String args[])
	{
		int [][] a = {
						{10,50,90,100},
						{20,60,70},
						{70,50,60,80},
					};
					
		for (int i = 0; i<a.length; i++)
		{
			for (int j = 0; j<a[i].length; j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
	}
}