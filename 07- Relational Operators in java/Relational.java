// 05 Relational Operators 

/*
	| Operator | Meaning                  | Example  | Result                                            |
	| :------: | ------------------------ | -------- | ------------------------------------------------- |
	|   `==`   | Equal to                 | `a == b` | `true` if `a` equals `b`|
	|   `!=`   | Not equal to             | `a != b` | `true` if `a` is not `b`                          |
	|    `>`   | Greater than             | `a > b`  | `true` if `a` is larger                           |
	|    `<`   | Less than                | `a < b`  | `true` if `a` is smaller                          |
	|   `>=`   | Greater than or equal to | `a >= b` | `true` if `a` ≥ `b`                               |
	|   `<=`   | Less than or equal to    | `a <= b` | `true` if `a` ≤ `b`                               |

*/

import java.lang.*;

class Relational 
{
	public static void main(Sting args[])
	{
		 int a = 10, b = 20;
        char c1 = 'A', c2 = 'B';

        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a > b);   // false
        System.out.println(a < b);   // true
        System.out.println(a >= 10); // true
        System.out.println(a <= b);  // true

        System.out.println(c1 < c2); // true ('A' < 'B' based on Unicode)
	}
}
		