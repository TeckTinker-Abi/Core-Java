//04 Type Casting in java 
/* 
	Widening casting 
		byte -> short -> char -> int -> long -> float -> double
	Narrowing Casting 
		double -> float -> long -> int -> char -> short -> byte
*/

/*
Primitive Data Types
			Built-in types that store actual values and have fixed sizes and ranges—efficient and fast.

| Type      | Size    | Range / Values                   | Use Cases                                                                    |
| --------- | ------- | -------------------------------- | ---------------------------------------------------------------------------- |
| `byte`    | 8-bit   | −128 to 127                      | Memory-saving in large arrays ([geeksforgeeks.org][1], [docs.oracle.com][2]) |
| `short`   | 16-bit  | −32,768 to 32,767                | When `int` is overkill                                                       |
| `int`     | 32-bit  | \~−2.1B to +2.1B                 | Default integer type                                                         |
| `long`    | 64-bit  | \~−9.2×10¹⁸ to +9.2×10¹⁸         | Large integer values                                                         |
| `float`   | 32-bit  | \~6–7 decimal digits             | Memory-efficient decimals                                                    |
| `double`  | 64-bit  | \~15–16 decimal digits           | Default decimal type                                                         |
| `boolean` | depends | `true` or `false`                | Logical flags                                                                |
| `char`    | 16-bit  | Unicode characters (0 to 65,535) | Single characters, Unicode text                                              |

*/

import java.lang.*;

class casting 
{
	public static void main (String args[])
	{
		int a = 20;
		double b=a , d = 25.67 ;
		int c=(int)d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}