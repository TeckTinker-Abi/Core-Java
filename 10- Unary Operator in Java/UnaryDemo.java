/* 08 Unary Operators 
		1. + – Unary Plus
				Indicates a positive value (essentially has no effect): +a
				Also triggers numeric promotion for byte, short, and char to int 


		2. - – Unary Minus (Negation)	
				Negates a numeric value: -a → if a = 5, then -a = -5

		3. ++ – Increment
				++a (prefix): increment first, then use value
				a++ (postfix): use the original value, then increment 

		4. -- – Decrement
				--a (prefix): decrement first, then use value
				a-- (postfix): use the original value, then decrement 

		5. ! – Logical NOT
				Inverts a boolean: !true → false, !false → true

		6. ~ – Bitwise NOT (for integer types)
				Flips all bits of an integer: ~x gives the bitwise complement
*/




public class UnaryDemo {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(+x);    // 5
        System.out.println(-x);    // -5

        System.out.println(++x);   // x=6, prints 6
        System.out.println(x++);   // prints 6, then x=7
        System.out.println(--x);   // x=6, prints 6
        System.out.println(x--);   // prints 6, then x=5o

        boolean flag = false;
        System.out.println(!flag); // prints true

        int n = 2;                 // binary: 000...0010
        System.out.println(~n);    // prints -3 (two's complement) 
    }
}
