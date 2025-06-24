import java.util.*;

public class Insert_Value_Array
{
	public static void main(String args[])
	{
		int[] a = {2,3,4,56,78,434,46,646,100};
		System.out.println("Enter the Index Value to Insert : ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		System.out.println("Enter the Insert Value : ");
		int value = sc.nextInt();
		System.out.println("Before Insert : "+Arrays.toString(a));
		/*
		for (int i = 0; i<a.length; i++)
		{
			if (i==index)
			{
				a[i]=value;
			}
		}
		
		System.out.println("After Insert : "+Arrays.toString(a));	*/
		
		for (int i =a.length-1; i>index; i--)
		{
				a[i]=a[i-1];
		}
		a[index]=value;
		System.out.println("After Move and Insert : "+Arrays.toString(a));
	}
}



