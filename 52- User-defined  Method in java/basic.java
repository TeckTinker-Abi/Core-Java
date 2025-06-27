import java.util.*;

class Method {

    Scanner sc = new Scanner(System.in);

    /**
     *  TYPE 1: With Return Type and Without Arguments
     *  Definition: Takes no input but returns a value.
     *  Use Case: When input is taken inside the method and output is needed outside.
     */
    public int add() {
        System.out.print("Enter Number A: ");
        int a = sc.nextInt();
        System.out.print("Enter Number B: ");
        int b = sc.nextInt();
        return a + b;
    }

    /**
     *  TYPE 2: Without Return Type and With Arguments
     *  Definition: Accepts input but does not return a value.
     *  Use Case: When input is passed directly and output is printed inside.
     */
    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    /**
     *  TYPE 3: With Return Type and With Arguments
     *  Definition: Accepts input and returns a result.
     *  Use Case: Ideal when both input and output need to be reused or processed.
     */
    public int mul(int a, int b) {
        return a * b;
    }

    /**
     *  TYPE 4: Without Return Type and Without Arguments
     *  Definition: Neither accepts input nor returns a result.
     *  Use Case: Useful for small tasks where both input and output are handled inside.
     */
    public void div() {
        System.out.print("Enter Number A: ");
        int a = sc.nextInt();
        System.out.print("Enter Number B: ");
        int b = sc.nextInt();
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
	

    /**
     *  TYPE 5: Recursive Method
     *  Definition: A method that calls itself.
     *  Use Case: Useful for repetitive problems like factorial, Fibonacci, etc.
     */
    public int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    /**
     *  TYPE 6: Overloaded Method (Simulating Default Arguments)
     *  Definition: Two methods with same name but different parameters.
     *  Use Case: Provides flexibility to call method with or without parameters.
     */
    public void greet() {
        greet("Guest");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    //  Close Scanner at the end
    public void closeScanner() {
        sc.close();
    }
}

public class Basic {
    public static void main(String[] args) {
        Method n = new Method();


        // TYPE 1
        System.out.println("Addition: " + n.add());

        // TYPE 2
        n.sub(20, 10);

        // TYPE 3
        System.out.println("Multiplication: " + n.mul(10, 5));

        // TYPE 4
        n.div();

        // TYPE 5
        System.out.println("Factorial of 5: " + n.factorial(5));

        // TYPE 6 (Overloaded)
        n.greet();            // default
        n.greet("Abishek");   // with parameter

        // Closing scanner
        n.closeScanner();
    }
}

