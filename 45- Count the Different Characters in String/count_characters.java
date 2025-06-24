public class count_characters
{
	public static void main (String args[])
	{
		StringBuffer a = new StringBuffer("Abishek SIT@2K25");
		 
		int upper=0,lower=0,vowels=0,symbols=0,number=0,space=0;
		
		for (int i = 0; i<a.length(); i++)
		{
			if (a.charAt(i) >= 97 && a.charAt(i) <=122)
			{
				lower++;
			}
			if (a.charAt(i) >= 65 && a.charAt(i) <=90)
			{
				upper++;
			}
			if (a.charAt(i) >= 48 && a.charAt(i) <=57)
			{
				 number++;
			}
			if (a.charAt(i) == 32 )
			{
				space++;
			}
			if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U' ||
				a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u')
			{
			  vowels++;
			 
			}
		}
		System.out.println(a);
		System.out.println(a.length());
		System.out.println("Lower : "+lower);
		System.out.println("Upper : "+upper);
		System.out.println("Number : "+number);
		System.out.println("Space : "+space);
		System.out.println("Vowels : "+vowels);
		System.out.println("Symbols : "+(a.length()-(upper+lower+number+space)));
	}
}