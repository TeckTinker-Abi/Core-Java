import java.util.Arrays;

public class Ascending_and_Descending_Array
{
	public static void main(String args[])
	{
		int[] a = {8,6,95,45,6,13,5,4,2,51};
		
		int temp;
		
		System.out.println("Before Array : "+Arrays.toString(a));
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i]>a[j])// -> for descending a[i]<a[j] 
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After Array Short : "+Arrays.toString(a));
	}
}
			