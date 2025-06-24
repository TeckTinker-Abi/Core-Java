public class Reverse_String
{
	public static void main (String args[])
	{
		StringBuilder a = new StringBuilder("I am Abishek");
		
		StringBuilder b = new StringBuilder();
		
		System.out.println("Input String : "+ a);
		
		for (int i = a.length()-1; i>=0; i--)
		{
			b.append((a.charAt(i)));
		}
		System.out.print("After Reverse : "+b);
	}
}