/* 09 Bitwise Operators
													Bitwise Operators in Java

							These operators work on **integer types** (`byte`, `short`, `int`, `long`, `char`) at the **bit level** 
									1. `&` – Bitwise AND
									
										Operation: Returns 1 for each bit position where **both operands** have 1.	
													Truth Table (bit-level):
													
														  A B | A & B
														  0 0 | 0
														  0 1 | 0
														  1 0 | 0
														  1 1 | 1
														  
										Example: `5 & 7` → `0101 & 0111 = 0101` = 5
									---
									 2. `|` – Bitwise OR

										Operation: Returns 1 if **either operand** has 1 in a given bit position.

														Truth Table:
													  A B | A | B
													  0 0 | 0
													  0 1 | 1
													  1 0 | 1
													  1 1 | 1

										Example: `5 | 7` → `0101 | 0111 = 0111` = 7 .
									---
									3. `^` – Bitwise XOR (Exclusive OR)

										Operation: Returns 1 only when **exactly one** of the bits is 1.
										
															Truth Table:
														  A B | A ^ B
														  0 0 | 0
														  0 1 | 1
														  1 0 | 1
														  1 1 | 0
										Example: `5 ^ 7` → `0101 ^ 0111 = 0010` = 2.
									---

									4. `~` – Bitwise Complement (NOT)

										Operation: Inverts every bit—turns 0 to 1 and 1 to 0 (one’s complement).
										Example**: `~5` = `~00000101` = `11111010` (for 8-bit), which is **-6** in two’s complement 
									---
									5. `<<` – Left Shift

										Operation: Shifts all bits to the left by a specified number of positions.
										Each shift left multiplies the number by 2.
										Example: `5 << 2`: `00000101 << 2 = 00010100` = **20** ([medium.com][3]).
									---
									6. `>>` – Signed Right Shift

										Operation**: Shifts bits to the right, preserving the sign bit (arithmetic shift).
										Fills left bits with the sign bit (0 for positive, 1 for negative) ([docs.oracle.com][4]).
									---
									7. `>>>` – Unsigned Right Shift

										Operation: Shifts bits to the right, filling the leftmost bits with **0**, regardless of sign .
*/

public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5, b = 7;

        System.out.println("a & b = " + (a & b));   // 5
        System.out.println("a | b = " + (a | b));   // 7
        System.out.println("a ^ b = " + (a ^ b));   // 2
        System.out.println("~a = "   + (~a));       // -6

        int x = 5;
        System.out.println("x << 2 = "  + (x << 2));  // 20
        System.out.println("x >> 1 = "  + (x >> 1));  // 2
        System.out.println("x >>> 1 = " + (x >>> 1)); // 2
    }
}
