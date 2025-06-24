import java.util.*;

class Factorial
{
	public static void main (String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 1;
		
		for ( int i = 1 ; i<=n ; i++)
		{
			 sum = sum*i;
		}
		System.out.println("Factorial of Given Numeber is : "+sum);
	}
}


class Sum_and_average
{
	public static void main(String args[])
	{
		System.out.println("Enter a Total Number - Going ton input : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 int sum = 0 ;
		 float average = 0;
		
		for (int i =1; i<=n ; i++)
		{
			System.out.println("Enter a "+i+"Number");
			
			int num = sc.nextInt();
			
			 sum = sum+num;
			
			 average = sum/n;
		}
		System.out.println("The Sum Of The Given Number is : "+sum);
		System.out.println("The Average Of The Given Number is : "+average);
	}
}
		
class Fibonacci
{
	public static void main (String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
		 int a = -1,b = 1 , c ;
		 
		
		for (int i = 1 ; i <=n ; i++)
		{
			c = a+b;
			
			System.out.println(c);
			
			a=b;
			b=c;
		}
	}
}

class reverse_number
{
	public static void main (String args[])
	{
		
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int reverse = 0,rem;
		
		while (n!=0)
		{
			 rem = n%10;
			 reverse = (reverse*10)+rem;
			 n = n/10;
			 
		}
			System.out.println("Reversed Number : "+reverse);
	}		
}	

class armstrong_number
{
	public static void main(String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int digit1,digit2,digit3,temp;
		
		digit3 = n%10;
		temp = n/10;
		
		digit2 = temp%10;
		temp = temp/10;
		
		digit1=temp;
		
		int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
		
		if (result == n)
		{			
			System.out.println("the Given Number is armstrong_number :  "+result);
		}
		else
		{
			System.out.println("The Given Number is Not Amstrong Number .");
		}
		
	
	}
}	
		
	
class armstrong_number1
{
	public static void main(String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		
		int digit1,digit2,digit3;
		
		digit3 = temp%10;
		temp = temp/10;
		
		digit2 = temp%10;
		temp = temp/10;
		
		digit1=temp;
		
		int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
		
		if (result == n)
		{			
			System.out.println("the Given Number is armstrong_number :  "+result);
		}
		else
		{
			System.out.println("The Given Number is Not Amstrong Number .");
		}
		
	
	}
}	

class armstrong_number_100_999
{
	public static void main(String args[])
	{
		System.out.println("Enter any three digit number to check the given number is Armstrong or not ! : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int digit1,digit2,digit3,temp;
		
		if ( n>= 100 && n<=999)
		{
			digit3 = n%10;
			temp = n/10;
			
			digit2 = temp%10;
			temp = temp/10;
			
			digit1=temp;
			
			int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
			
			if (result == n)
			{			
				System.out.println("the Given Number is armstrong_number :  "+result);
			}
			else
			{
				System.out.println("The Given Number is Not Amstrong Number .");
			}
		}
		else 
		{ 
			System.out.println("You have Entered a incorrect digit of values , Try Again");
		}
	}
}

class Amstrong_Nums_100_999
{
	public static void main(String args[])
	{
		int digit1,digit2,digit3,temp,number;
		
		for (number = 100; number<=999;	number++)
		{
			temp = number;
			
			digit3 = temp%10;
			temp = temp/10;
			
			digit2 = temp%10;
			temp = temp/10;
			
			digit1 = temp;
			
			int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
			if (number == result)
			{
				System.out.println(result+"is Amstrong Number");
			}
		}
	}
}

class multiplication_table
{
	public static void main(String args[])
	{
		System.out.println("Enter the Table : ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		System.out.println("Enter a Limit : ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n ; i++)
		{
			int result = i*t;
			System.out.println("Mupltipilication of "+i+"*"+t+"="+result);
		}
	}
}

class factor 
{
	public static void main(String args[])
	{
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++)
		{
			int a = n%i;
			if ( a == 0)
			{ 
				System.out.println("The Factor is : "+i);
			}
		}
	}
}
		
class prime_or_not
{
	public static void main(String args[])
	{
			System.out.println("Enter a Number : ");
				Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int f = 0 ;
			
			for(int i = 1; i <= n ; i++)
			{
				if(n%i==0)
				{
					f++;
				}
			}
			if(f == 2)
			{
				System.out.println("The Given Number  "+n+" is Prime. ");
			}
			else
			{
				System.out.println("The Given Number  "+n+" is Not a Prime. ");
			}	
	}
}	

class prime_or_not_1_999
{
	public static void main(String args[])
	{
		int f = 0;
		
		for (int i = 1; i<=999; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				if(i%j==0)
				{
					f++;
				}
			}
			if(f == 2)
			{
				System.out.println("The Given Number  "+i+" is Prime. ");
			}
			f=0;
		}
	}
}

class perfect_number
{
	public static void main(String args[])
	{
		System.out.println("Enter a Number - To check Whether it's perfect number ot not ! : ");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0 ;
		
		for (int i = 1; i < n; i++)
		{
			if(n%i==0)
			{
				sum += i;
			}
		}
		if (sum == n)
		{
			System.out.println("The Entered Number "+n+" is Perfect Number");
		}
		else
		{
			System.out.println("The Entered Number "+n+" is not Perfrct Number");
		}
	}
}

class strong_number
{
	public static void main (String args[])
	{
		int num,orginalnum,rem,fact,i,sum=0;
		System.out.println("Enter a Number -> TO check whether the Given Number is Strong Number or Not : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		orginalnum = num;
		
		while(num!=0)
		{
			rem = num%10;
			System.out.println("Split : "+rem);
			fact =1;
			for(i=1; i<=rem; i++)
			{	
				fact *=i;	
			}
			System.out.println("Factorial : "+fact);
			sum += fact;
			num = num/10;
			System.out.println("Final Value : "+sum);
			
		}
		if(sum == orginalnum)
		{
			System.out.println("The Given Number "+orginalnum+" is Stronger Number.");
		}
		else
		{
			System.out.println("The Given Number "+orginalnum+" is Not a Stronger Number.");
		}
	}
}
		 