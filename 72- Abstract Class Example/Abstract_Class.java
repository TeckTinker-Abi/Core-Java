abstract class Mobile
{
	void voicecall()
	{
		System.out.println("Voice Call is Default.");
	}
	
	abstract void camera();
	abstract void touchdisplay();
}

class samsung extends Mobile
{
	void camera()
	{
		System.out.println("It has a 8px Camera.");
	}
	
	@Override
	void touchdisplay()
	{
		System.out.println("It has a Lcd Display.");
	}
}

class oppo extends Mobile
{
	void camera()
	{
		System.out.println("It has a 8px Camera.");
	}
	
	@Override
	void touchdisplay()
	{
		System.out.println("It has a LED Display.");
	}
}

class vivo extends Mobile
{
	void camera()
	{
		System.out.println("It has a 8px Camera.");
	}
	
	@Override
	void touchdisplay()
	{
		System.out.println("It has a  Display.");
	}
	
	void fingerprint()
	{
		System.out.println("It have an In Display FingerPrint.");
	}
	
}

public class Abstract_Class
{
	public static void main(String args[])
	{
		samsung s1 = new samsung ();
		
		s1.voicecall();
		s1.camera();
		s1.touchdisplay();
		
		oppo o1 = new oppo ();
		
		o1.voicecall();
		o1.camera();
		o1.touchdisplay();
		
		vivo v1 = new vivo ();
		
		v1.voicecall();
		v1.camera();
		v1.touchdisplay();
		v1.fingerprint();
		
	}
}