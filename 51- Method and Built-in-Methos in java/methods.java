/* 

									Java Methods

				Definition:
						A method is a block of code that performs a specific task. 
						It enhances code reusability.
				*/

				/*
				Types of Methods:

									   Methods
									   /     \
						   User-defined       Standard Library
							  Methods               Methods

						1. User-defined Methods - Created by the programmer.
						2. Standard Library Methods - Predefined methods from Java libraries.
						   Examples: System.out.println(), Math.sqrt(), length(), etc.
				*/

				/*
				Method Declaration:

						Syntax:
						accessModifier returnType methodName(parameter1, parameter2, ...) {
							// method body
						}

						Example:
						public int addition(int a, int b) {
							return a + b;
				`		}
				*/

				/*
				Components of Method Declaration:

						1. Access Modifier   - Controls access (public, private, protected, default)
						2. Return Type       - Data type returned by the method (int, void, String, etc.)
						3. Method Name       - Identifier for the method (e.g., addition)
						4. Parameter List    - Inputs passed to the method (e.g., int a, int b)
						5. Method Body       - The block of code that defines the logic
				*/

				/*
				Types of User-defined Methods:

						1. With return type and with parameters
						2. With return type and without parameters
						3. Without return type and with parameters
						4. Without return type and without parameters
				*/
				

				/*
				Recursive Method:

						A recursive method is one that calls itself.
						Example: Finding factorial of a number
				*/

				/*/*	public int factorial(int n) {
						if (n == 0 || n == 1)
							return 1;
						else
							return n * factorial(n - 1); // recursive call
					}

				Java Built-in (Standard Library) Methods

				--------------------------------------------------
				1. java.lang Package (automatically imported)
				--------------------------------------------------

				String Class Methods:
				/*
				str.length();             // Returns length of the string
				str.charAt(index);        // Returns character at index
				str.substring(0, 5);      // Extracts substring
				str.toUpperCase();        // Converts to uppercase
				str.toLowerCase();        // Converts to lowercase
				str.equals("abc");        // Compares content
				str.equalsIgnoreCase();   // Compares ignoring case
				str.trim();               // Removes leading/trailing spaces
				str.indexOf("a");         // Finds first occurrence of a character
				str.replace('a', 'b');    // Replaces characters
				*/

				//Math Class Methods:
				/*
				Math.sqrt(16);       // Square root of 16
				Math.pow(2, 3);      // 2 raised to power 3
				Math.max(a, b);      // Returns larger of a and b
				Math.min(a, b);      // Returns smaller of a and b
				Math.abs(-10);       // Absolute value
				Math.random();       // Random double between 0.0 and 1.0
				Math.round(4.5);     // Rounds to nearest long
				Math.ceil(4.3);      // Rounds up to nearest int
				Math.floor(4.7);     // Rounds down to nearest int
				*/

				//Wrapper Classes:
				/*
				Integer.parseInt("123");     // Converts string to int
				Integer.toString(123);       // Converts int to string
				Integer.valueOf("123");      // Converts string to Integer object
				*/

				/*--------------------------------------------------
				2. java.util Package
				--------------------------------------------------

				Scanner Class:
				/*
				Scanner sc = new Scanner(System.in);
				sc.next();         // Reads a single word
				sc.nextLine();     // Reads an entire line
				sc.nextInt();      // Reads integer
				sc.nextDouble();   // Reads double
				sc.hasNext();      // Checks if input is available
				*/

				/*Arrays Class:
				/*
				Arrays.sort(arr);               // Sorts the array
				Arrays.toString(arr);           // Returns string representation
				Arrays.binarySearch(arr, key);  // Searches for key
				Arrays.copyOf(arr, newLength);  // Copies array to new length
				*/

				/*Collections Class:
				/*
				Collections.sort(list);         // Sorts list in ascending order
				Collections.reverse(list);      // Reverses the list
				Collections.shuffle(list);      // Shuffles the list randomly
				Collections.max(list);          // Returns max element
				Collections.min(list);          // Returns min element
				*/

				/*--------------------------------------------------
				3. java.io Package
				--------------------------------------------------

				File Class:
				/*
				File f = new File("test.txt");
				f.exists();         // Checks if file exists
				f.createNewFile();  // Creates file if not exists
				f.delete();         // Deletes the file
				f.getName();        // Gets the name of file
				f.length();         // Returns file size in bytes
				*/

				/*BufferedReader
				/*
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				br.readLine();      // Reads a line of input
				*/

				/*--------------------------------------------------
				4. java.time Package (Java 8 and above)
				--------------------------------------------------

				LocalDate, LocalTime, LocalDateTime:
				/*
				LocalDate.now();                    // Gets current date
				LocalTime.now();                    // Gets current time
				LocalDateTime.now();                // Gets current date and time
				LocalDate.of(2025, 6, 24);          // Creates specific date
				LocalDate.parse("2025-06-24");      // Parses string to date
				*/

				/*--------------------------------------------------
				5. java.math Package
				--------------------------------------------------

				BigInteger & BigDecimal:
				/*
				BigInteger a = new BigInteger("123456789");
				BigInteger b = new BigInteger("987654321");
				a.add(b);         // Adds a and b
				a.multiply(b);    // Multiplies a and b
				a.mod(b);         // Returns a % b
				a.pow(2);         // Raises a to power 2
				*/

				/*--------------------------------------------------
				Summary Table:

				Package      | Class         | Common Methods
				-------------|---------------|---------------------------
				java.lang    | String        | length(), charAt(), equals()
				java.lang    | Math          | sqrt(), pow(), random()
				java.util    | Scanner       | next(), nextLine(), nextInt()
				java.util    | Arrays        | sort(), toString(), binarySearch()
				java.util    | Collections   | sort(), max(), shuffle()
				java.io      | File          | exists(), delete(), length()
				java.time    | LocalDate     | now(), parse(), of()
				java.math    | BigInteger    | add(), multiply(), mod()

*/


public class methods
{
	public static void main(String args[])
	{
		System.out.println("Absolute Value : "+Math.abs(-10));
		System.out.println("Ceil Value : "+Math.ceil(5.66));
		System.out.println("Round Value : "+Math.round(2.66));
		System.out.println("Cos theta Value : "+Math.cos(10));
	}
}