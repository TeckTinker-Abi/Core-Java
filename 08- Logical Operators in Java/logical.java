// 06 Logical Operators 

/* 
							Logical Operators & Functions
				
					&& – Logical AND (short-circuit)
						 Returns true only if both operands are true.
						 If the first is false, the second is not evaluated 

					|| – Logical OR (short-circuit)
						 Returns true if at least one operand is true.
						 If the first is true, the second is not evaluated 

					! – Logical NOT
						Unary operator that inverts its boolean operand 


					^ – Logical XOR (exclusive‑or)
						Returns true if exactly one operand is true
						
					|   A   |   B   | A && B | A \|\| B | A ^ B |   !A  |
					----------------------------------------------------
					|  true |  true |  true  |   true   | false | false |
					|  true | false |  false |   true   |  true | false |
					| false |  true |  false |   true   |  true |  true |
					| false | false |  false |   false  | false |  true |


*/
import java.lang.*;

class logical 
{
	public static void main(Sting args[])
	{
		 boolean a = true, b = false;

        System.out.println("a && b = " + (a && b));  // false
        System.out.println("a || b = " + (a || b));  // true
        System.out.println("a ^ b = "  + (a ^ b));   // true
        System.out.println("!a = "     + (!a));      // false
		
		int x = 5, y = 10;
        boolean flag = true;

        System.out.println((x < y) && flag);  // true
        System.out.println((x > y) || flag);  // true
        System.out.println(!(x == y));        // true
        System.out.println((x < y) ^ flag);   // false (both are true)
	}
}
		