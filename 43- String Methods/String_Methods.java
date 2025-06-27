public class String_Methods {
    public static void main(String[] args) {
        String s = "  Hello Java  ";
		

        // LENGTH
        System.out.println(s.length()); 
        // Output: 13
        // Method: length() — Returns the number of characters (including spaces)

        // TRIM
        System.out.println(s.trim()); 
        // Output: "Hello Java"
        // Method: trim() — Removes leading and trailing white spaces

        // CHARAT
        System.out.println(s.charAt(2)); 
        // Output: 'H'
        // Method: charAt(index) — Gets character at a specific index

        // TO UPPER CASE
        System.out.println(s.toUpperCase()); 
        // Output: "  HELLO JAVA  "
        // Method: toUpperCase() — Converts all characters to uppercase

        // TO LOWER CASE
        System.out.println(s.toLowerCase()); 
        // Output: "  hello java  "
        // Method: toLowerCase() — Converts all characters to lowercase

        // SUBSTRING
        System.out.println(s.substring(2, 7)); 
        // Output: "Hello"
        // Method: substring(start, end) — Extracts characters between indexes

        // CONTAINS
        System.out.println(s.contains("Java")); 
        // Output: true
        // Method: contains() — Checks if substring is present

        // REPLACE
        System.out.println(s.replace("Java", "World")); 
        // Output: "  Hello World  "
        // Method: replace(old, new) — Replaces text

        // STARTSWITH
        System.out.println(s.trim().startsWith("Hello")); 
        // Output: true
        // Method: startsWith(prefix) — Checks beginning of string

        // ENDSWITH
        System.out.println(s.trim().endsWith("Java")); 
        // Output: true
        // Method: endsWith(suffix) — Checks end of string

        // EQUALS
        System.out.println("abc".equals("ABC")); 
        // Output: false
        // Method: equals() — Case-sensitive comparison

        // EQUALSIGNORECASE
        System.out.println("abc".equalsIgnoreCase("ABC")); 
        // Output: true
        // Method: equalsIgnoreCase() — Case-insensitive comparison

        // IS EMPTY
        System.out.println("".isEmpty()); 
        // Output: true
        // Method: isEmpty() — Checks if string is empty

        // IS BLANK (Java 11+)
        System.out.println("   ".isBlank()); 
        // Output: true
        // Method: isBlank() — Checks if string is empty or only whitespace

        // CONCAT
        System.out.println("Hello".concat(" World")); 
        // Output: "Hello World"
        // Method: concat() — Joins two strings

        // SPLIT
        String[] parts = "Java,Python,C".split(",");
        for (String lang : parts) System.out.println(lang);
        // Output:
        // Java
        // Python
        // C
        // Method: split(delimiter) — Splits string into array

        // TO CHAR ARRAYn

        // REPEAT (Java 11+)
        System.out.println("\nJava ".repeat(3));
        // Output: Java Java Java 
        // Method: repeat(n) — Repeats string n times

        // MATCHES
        System.out.println("abc123".matches("[a-z]+[0-9]+")); 
        // Output: true
        // Method: matches(regex) — Checks full match using regex

        // INDEX OF
        System.out.println("banana".indexOf("a")); 
        // Output: 1
        // Method: indexOf() — First occurrence index

        // LAST INDEX OF
        System.out.println("banana".lastIndexOf("a")); 
        // Output: 5
        // Method: lastIndexOf() — Last occurrence index

        // INTERN
        String a = new String("test").intern();
        String b = "test";
        System.out.println(a == b);
        // Output: true
        // Method: intern() — Returns reference from string pool

        // VALUE OF
        System.out.println(String.valueOf(123)); 
        // Output: "123"
        // Method: valueOf() — Converts primitive to string

        // FORMAT
        System.out.println(String.format("Age is %d", 25)); 
        // Output: "Age is 25"
        // Method: format() — Creates formatted strings

        // JOIN
        System.out.println(String.join("-", "2025", "06", "20")); 
        // Output: "2025-06-20"
        // Method: join(delimiter, elements) — Joins strings
    }
}
