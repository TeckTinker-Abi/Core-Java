abstract class Shape
{
	abstract void draw();
	void display()
	{
		System.out.println("Abstract Class");
	}
}

class rectangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("It is a Rectangle Class.");
	}
}

public class AbstractClass
{
	public static void main(String args[])
	{
		rectangle r = new rectangle();
		
		r.display();
		r.draw();
		
	}
}