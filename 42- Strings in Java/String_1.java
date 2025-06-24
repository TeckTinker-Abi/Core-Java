/* 

							String in Java

			* `String` is a **Java Object**.
			* It is used to represent a **sequence of characters**.
			* The `java.lang.String` class is used to **create and manipulate strings**.
			* By **default**, **Strings in Java are immutable**, meaning once a `String` object is created, its content **cannot be changed**.

			---

			**Hierarchy & Interfaces**

			* `java.lang.String` class **implements** the following interfaces:

			  * `Serializable`
			  * `Comparable<String>`
			  * `CharSequence`

			`CharSequence` Interface

			* This interface represents **read-only sequences of characters**.
			* Implementing classes:

			  * `String` (Immutable)
			  * `StringBuffer` (Mutable, Thread-safe)
			  * `StringBuilder` (Mutable, Not thread-safe)

			---

			 **Comparison: String vs StringBuffer vs StringBuilder**

			| Feature           | `String`                     | `StringBuffer`                  | `StringBuilder`               |
			| ----------------- | ---------------------------- | ------------------------------- | ----------------------------- |
			| Mutability        | Immutable                    | Mutable                         | Mutable                       |
			| Thread-Safe       | Yes                          | Yes                             | No                            |
			| Performance       | Slower (due to immutability) | Slower (synchronized)           | Faster (no sync)              |
			| Memory Allocation | Heap + String Constant Pool  | Heap                            | Heap                          |
			| Use Case          | For constant/fixed data      | For thread-safe mutable strings | For fast, non-thread-safe use |

			---

			**Memory Allocation: Stack, Heap, and String Constant Pool**

			* Java has two primary memory areas:

			  * **Stack Memory** → for method calls and local variables.
			  * **Heap Memory** → for objects.
			  
			 String Literal Storage

			String s1 = "Abishek Madurai";
			String s2 = "Abishek Madurai";


			* Both `s1` and `s2` point to the **same memory** location in the **String Constant Pool** (SCP).
			* **String Constant Pool** is a special space inside heap memory **to store literals only once** for memory efficiency.

			String Object using `new`

			String s3 = new String("Abishek Madurai");

			* This creates a **new object in the heap**, even if the content already exists in the SCP.

			---

			 **Why String is Immutable?**

			* String is immutable because:

			  * Security (e.g., classpaths, passwords)
			  * Thread safety (no synchronization needed)
			  * Memory efficiency (reuse literals)
			  * Hashcode caching (used in HashMap keys)
			Example: Immutable Behavior


			String s1 = "Hello";
			s1.concat(" World");
			System.out.println(s1); // Output: Hello


			* The original string `s1` doesn't change because `concat()` creates a new object.


			 **Garbage Collection of String Literals**

			* If a string literal is **no longer referenced**, the reference is removed.
			* The string **may stay in SCP** for some time.
			* **Garbage Collector (GC)** removes it **only if** it's not reachable and **not interned**.
			* Note: SCP used to be in **PermGen space (pre-Java 8)**, but from Java 8 onwards it's in **heap memory**.

			**Heap Memory in Mutable Classes**

			* `StringBuffer` and `StringBuilder` are **mutable** and their objects are always stored in **heap memory**.
			* Even if two objects have the same value, they are **stored in separate memory locations**.


			StringBuffer sb1 = new StringBuffer("Hi");
			StringBuffer sb2 = new StringBuffer("Hi");
			// sb1 != sb2 → different objects



			String s1 = "Hello";
			String s2 = "Hello";
			System.out.println(s1 == s2); // true (same SCP)

			String s3 = new String("Hello");
			System.out.println(s1 == s3); // false (heap vs SCP)
			System.out.println(s1.equals(s3)); // true (same value)



			Final Key Points**

			* Always use **String** for constant text or data.
			* Use **StringBuilder** for fast string modifications (e.g., loops, appending).
			* Use **StringBuffer** only when thread safety is important.
			* Always use `.equals()` to compare string values, not `==`.

*/

public class String_1
{
	public static void main(String args[])
	{
			String s1 = "Hello";
			String s2 = "Hello";
			
			System.out.println("S1 Hashcode : "+s1.hashCode());
			System.out.println("S2 Hashcode : "+s2.hashCode());
			
			
			System.out.println(s1 == s2); // true (same SCP)

			String s3 = new String("Hello");
			System.out.println(s1 == s3); // false (heap vs SCP)
			System.out.println(s1.equals(s3)); // true (same value)
			
			StringBuffer sb1 = new StringBuffer("Hi");
			StringBuffer sb2 = new StringBuffer("Hi");
			// sb1 != sb2 → different objects	
	}
}

