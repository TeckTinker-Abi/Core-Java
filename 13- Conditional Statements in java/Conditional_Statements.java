
/* Condtional Statements 


Conditional statements are used to make decisions in your program.
They help you control the flow based on true/false conditions.

	Types of Conditional Statements in Java:
if statement

if-else statement

if-else if ladder

nested if statement

switch statement

Ternary (? :) operator — short form of if-else	

*/

import java.util.Scanner;


//if Statement -> Executes a block of code only if the condition is true.

class IfExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5) {
            System.out.println("Number is greater than 5");
        }
    }
}

// if-else Statement -> Executes one block if true, another if false
class IfElseExample {
    public static void main(String[] args) {
        int number = 3;

        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
        }
    }
}

//if-else if Ladder -> Checks multiple conditions one by one.


class IfElseIfLadder {
    public static void main(String[] args) {
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}

// Nested if Statement -> One if inside another — like multi-level checking.

class NestedIfExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Allowed to vote");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Too young to vote");
        }
    }
}

// switch Statement-> Good for checking multiple fixed values (like days, options).



class SwitchcaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Entered Number is one");
                break;
            case 2:
                System.out.println("Entered Number is two");
                break;
            case 3:
                System.out.println("Entered Number is three");
                break;
            default:
                System.out.println("Number not in 1–3");
        }
        sc.close();
    }
}

class GroupSwitchCase 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Letter (To chech whether thats vowel or not) : ");
		char c = sc.next().charAt(0);
		
		switch (c)
		{
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
				System.out.println(c + " is a Vowel");
				break;
				
			default: 
				System.out.println(c + " is not a Vowel");
				break;
		}
	}
}