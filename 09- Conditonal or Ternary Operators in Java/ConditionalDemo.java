/* 07  Conditional Operators  OR Ternary Operators 

		Syntax -> condition ? valueIfTrue : valueIfFalse;
		
				condition — a boolean expression

		valueIfTrue — evaluated and returned if condition is true

		valueIfFalse — evaluated and returned if condition is false
*/


public class ConditionalDemo {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Basic use-case
        int max = (a > b) ? a : b;
        System.out.println("Max is " + max); // 10

        // Inline usage in method call
        System.out.println((a >= b)
                           ? "A is greater or equal"
                           : "B is greater");

        // Nested conditionals
        int n1 = 4, n2 = 9, n3 = 7;
        int largest = (n1 >= n2) 
                      ? ((n1 >= n3) ? n1 : n3)
                      : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest: " + largest); // 9
    }
}
