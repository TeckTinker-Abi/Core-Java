/*

								Two-Dimensional (2D) Array in Java

	Definition:
	
			A 2D array in Java is an array of arrays. It is used to store tabular data, such as a matrix (rows and columns).
			int[][] matrix = new int[3][4]; // 3 rows and 4 columns
	
	Rules for 2D Arrays:
	
			Declaration Syntax:
					dataType[][] arrayName;
					or
					dataType arrayName[][];
			
			Initialization:
						Static:
								int[][] arr =   {
												  {1, 2, 3},
												  {4, 5, 6}
											`	};
						Dynamic:
								int[][] arr = new int[3][4]; // 3 rows and 4 columns
			
			Accessing Elements:
								Use arrayName[row][column]:
					
								arr[0][2] = 7; // sets value at 1st row, 3rd column.
				
	Uses of 2D Arrays in Java :
	
			Representing matrices and tables (e.g., marks of students).

			Storing image pixel data.

			Grid-based games like Tic-Tac-Toe or Chess.

			Pathfinding algorithms and simulations.

			Representing graphs using adjacency matrices.

	Limitations of 2D Arrays :
	
			Fixed Size: Once created, the size cannot be changed.

			Memory Waste: Unused elements still occupy space.

			No Built-in Bounds Checking: Accessing invalid indices throws ArrayIndexOutOfBoundsException.

			Complex Manipulation: Operations like insert/delete rows/columns are not directly supported.

			Not Type Flexible: You must declare a single data type per array (e.g., all int).
			
	Key Points :
			Arrays in Java are zero-indexed.

			You can use nested loops to iterate through 2D arrays.

			You can use Arrays.deepToString() for printing:


*/


import java.util.*;

public class TwoD_Array
{
	public static void main(String args[])
	{
		int [][] a ={
						{10,20,30},
						{40,50,60},
						{70,80,90},
					};
		for (int i = 0 ; i<3; i++)
		{
			for (int j = 0; j<3; j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("Enter a Column Limit : ");
		Scanner sc = new Scanner(System.in);
		int col = sc.nextInt();
		System.out.println("Enter a Row Limit : ");
		int row = sc.nextInt();
		int [][] b = new int[col][row];
		
		for (int i = 0; i<col; i++)
		{
			for (int j = 0; j<row; j++)
			{
				System.out.println("Enter a First Row "+(i+1)+"  value.");
				b[i][j] = sc.nextInt();
			}
		}
		for (int i = 0 ; i<col; i++)
		{
			for (int j = 0; j<row; j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println("");
		}
		System.out.println(Arrays.deepToString(b));
	}
}


