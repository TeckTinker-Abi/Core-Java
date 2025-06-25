class GrandFather
{
	void Assest()
	{
		System.out.println("Have 2 ACRES of land in Madurai.");
	}
}

class Father extends GrandFather
{	
	void house()
	{
		System.out.println("Have an 2bhk House. ");
	}
}

class Son extends Father 
{
	void car()
	{
		System.out.println("Have an Own Car. ");
		
	}
}
public class Multilevel_Inheritance
{
	public static void main(String args[])
	{
		Son s = new Son();
		s.Assest();
		s.house();
		s.car();
	}
}