/*
	Scanner = best for beginners (easy and flexible) -> Scanner is like a tool that reads input from the keyboard.

	BufferedReader = faster but needs parsing -> Used to read big text or file input. Faster than Scanner but needs extra steps.
			
		Notes:
			Always returns a String
			It's a way to get input from the keyboard.
			It reads everything as text (string), so you must convert it to a number if needed.
			You must convert it to number if needed:
				int age = Integer.parseInt(br.readLine());

	Console = works only in real terminal. -> Used in real console or terminal (not in Eclipse or VS Code).

	args[] = not live input, passed during program start . -> Inputs are given when starting the program, like this: java InputExample Hello 25
	
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

					  public java.util.Scanner(java.lang.Readable);
					  public java.util.Scanner(java.io.InputStream);
					  public java.util.Scanner(java.io.InputStream, java.lang.String);
					  public java.util.Scanner(java.io.InputStream, java.nio.charset.Charset);
					  public java.util.Scanner(java.io.File) throws java.io.FileNotFoundException;
					  public java.util.Scanner(java.io.File, java.lang.String) throws java.io.FileNotFoundException;
					  public java.util.Scanner(java.io.File, java.nio.charset.Charset) throws java.io.IOException;
					  public java.util.Scanner(java.nio.file.Path) throws java.io.IOException;
					  public java.util.Scanner(java.nio.file.Path, java.lang.String) throws java.io.IOException;
					  public java.util.Scanner(java.nio.file.Path, java.nio.charset.Charset) throws java.io.IOException;
					  public java.util.Scanner(java.lang.String);
					  public java.util.Scanner(java.nio.channels.ReadableByteChannel);
					  public java.util.Scanner(java.nio.channels.ReadableByteChannel, java.lang.String);
					  public java.util.Scanner(java.nio.channels.ReadableByteChannel, java.nio.charset.Charset);
					  public void close();
					  public java.io.IOException ioException();
					  public java.util.regex.Pattern delimiter();
					  public java.util.Scanner useDelimiter(java.util.regex.Pattern);
					  public java.util.Scanner useDelimiter(java.lang.String);
					  public java.util.Locale locale();
					  public java.util.Scanner useLocale(java.util.Locale);
					  public int radix();
					  public java.util.Scanner useRadix(int);
					  public java.util.regex.MatchResult match();
					  public java.lang.String toString();
					  public boolean hasNext();
					  public java.lang.String next();
					  public void remove();
					  public boolean hasNext(java.lang.String);
					  public java.lang.String next(java.lang.String);
					  public boolean hasNext(java.util.regex.Pattern);
					  public java.lang.String next(java.util.regex.Pattern);
					  public boolean hasNextLine();
					  public java.lang.String nextLine();
					  public java.lang.String findInLine(java.lang.String);
					  public java.lang.String findInLine(java.util.regex.Pattern);
					  public java.lang.String findWithinHorizon(java.lang.String, int);
					  public java.lang.String findWithinHorizon(java.util.regex.Pattern, int);
					  public java.util.Scanner skip(java.util.regex.Pattern);
					  public java.util.Scanner skip(java.lang.String);
					  public boolean hasNextBoolean();
					  public boolean nextBoolean();
					  public boolean hasNextByte();
					  public boolean hasNextByte(int);
					  public byte nextByte();
					  public byte nextByte(int);
					  public boolean hasNextShort();
					  public boolean hasNextShort(int);
					  public short nextShort();
					  public short nextShort(int);
					  public boolean hasNextInt();
					  public boolean hasNextInt(int);
					  public int nextInt();
					  public int nextInt(int);
					  public boolean hasNextLong();
					  public boolean hasNextLong(int);
					  public long nextLong();
					  public long nextLong(int);
					  public boolean hasNextFloat();
					  public float nextFloat();
					  public boolean hasNextDouble();
					  public double nextDouble();
					  public boolean hasNextBigInteger();
					  public boolean hasNextBigInteger(int);
					  public java.math.BigInteger nextBigInteger();
					  public java.math.BigInteger nextBigInteger(int);
					  public boolean hasNextBigDecimal();
					  public java.math.BigDecimal nextBigDecimal();
					  public java.util.Scanner reset();
					  public java.util.stream.Stream<java.lang.String> tokens();
					  public java.util.stream.Stream<java.util.regex.MatchResult> findAll(java.util.regex.Pattern);
					  public java.util.stream.Stream<java.util.regex.MatchResult> findAll(java.lang.String);
					  public java.lang.Object next();
					  static {};
					}
	
*/




import java.util.Scanner;
import java.io.*;


class Getting_Inputs
{
	public static void main (String args[])
	{
		Scanner a = new Scanner(System.in);
		int ab = a.nextInt();
		System.out.println(ab);
	}
}


class sample_bufferedreader
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name : ");
		String b = br.readLine();
		
		System.out.println("Name : "+b);
	}
}


/*
-> import java.io.*;
	This line imports Java I/O (Input/Output) classes.
	It is needed to use BufferedReader and InputStreamReader.

-> public class InputExample {
	This line defines a class called InputExample.
	Every Java program needs a class.

-> public static void main(String[] args) throws IOException {
	This is the starting point of the program.
	throws IOException is added because BufferedReader.readLine() might throw an error if something goes wrong.

-> BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.in gets input from the keyboard.

-> InputStreamReader converts the input into characters.

-> BufferedReader helps to read text line by line.
	This line creates a BufferedReader object named br.

-> System.out.print("Enter your name: ");
	This line asks the user to enter their name.
	It shows the message in the terminal.

-> String name = br.readLine();
	This line waits for the user to type something and press Enter.
	Whatever is typed is saved as a String in the variable name.

-> System.out.println("Hello " + name);
	This line displays the greeting, using the name you typed.
*/

class consoleinput 
{
	public static void main (String args[])
	{
		Console console = System.console();
		
		if (console == null){
			System.out.println("Console is not available");
			return;
		}
		
		String name = console.readLine("Enter Your name : ");
		String age = console.readLine("Enter your Age : ");
		int agetxt = Integer.parseInt(age);
		System.out.println("Name : " + name + ",AGE : " + agetxt);
	}
}
/*
-> public class InputExample {
	Defines the class named InputExample.

-> public static void main(String[] args) {
	This is the main method — where your Java program starts.

-> Console console = System.console();
	This line gets the system's console (keyboard + terminal).
	If you're running in an IDE like Eclipse or VS Code, this will return null.

-> if (console == null) { ... }
	Checks if the console is available.
	If not (like in IDE), it prints a message: "Console not available" and stops the program.

-> String name = console.readLine("Enter your name: ");
	This line shows a message and waits for you to type your name.
	The input is stored in the variable name.

-> System.out.println("Hello " + name);
	Finally, it prints the name entered by the user.

*/

// Hide user input password example using the console input 

class passinput
{
	public static void main (String args [])
	{
		Console console = System.console();
		
		if (console == null){
			System.out.println("Console is not Available");
			return;
		}
		
		String Username = console.readLine("Enter the username : ");
		
		char[] arraypassword = console.readPassword("Enter the password : ");
		
		String Password = new String(arraypassword);//optional to cating the char to the string 
		
		System.out.println("Your Username : " + Username + "Your Password : " + Password);
	}
}