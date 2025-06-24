public class Jagged_Array_Enhanced
{
	public static void main(String args[])
	{
		int [][] a = {
						{10,50,90,100},
						{20,60,70},
						{70,50,60,80},
					};
		for (int [] column : a)
		{
			for (int  rows : column)
			{
				System.out.print(" "+rows);
			}
			System.out.println("");
		}
	}
}