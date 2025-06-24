	import java.util.*;


	class method 
	{	
		Scanner sc = new Scanner(System.in);
		//With return type and without arguments.
		public int add ()
		{
			
			System.out.print(" Enter a Number A : ");
			int a = sc.nextInt();
			System.out.println(" Enter a Number B : ");
			int b = sc.nextInt();
			return a+b;
		}
		
		//without reuturn type and with arguments.
		public void sub (int a, int b)
		{
			
			System.out.println("Subraction of Two Values is "+a+" and "+b+" : "+(a-b));
		}
		
		//with returntype and with arguments
		public int  mul(int a, int b)
		{
			return a*b;
		}
		
		//without returntype and without arguments
		public void div()
		{
			
			System.out.println(" Enter a Number A : ");
			int n = sc.nextInt();
			System.out.println(" Enter a Number B : ");
			int m = sc.nextInt();
			
			System.out.println("Divisable value is :" +(n/m));
		}
		
		public void closescanner(){
			sc.close();
		}
		
		public int factorial(int n)
		{
			if (n==1) {
				return 1;
			}
			else 
			{
				return (n*factorial(n-1));
			}
		}
	}
			



	public class basic 
	{
		public static void main(String args[])
		{
			method n = new method();
			
			System.out.println("Addition Of Two value is : "+n.add());
			
			n.sub(10,5);
			
			System.out.println("Multiply of two number is 10 and 5 : "+ n.mul(10,5));
			
			n.div();
			
			System.out.println("Factorial of " + 5 + " is: " + n.factorial(5));
			
			
			
			
		}
	}