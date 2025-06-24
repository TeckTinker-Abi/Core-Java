/*
 
					StringBuffer and StringBuilder in Java


		Definition**

		 `StringBuffer`:

					* `StringBuffer` is a **mutable**, **thread-safe** class used to manipulate character strings.
					* It's part of the `java.lang` package and allows modification without creating new objects.

					`StringBuilder`:

					* `StringBuilder` is **mutable**, **not thread-safe**, but **faster** than `StringBuffer`.
					* It was introduced in **Java 5** to improve performance in **single-threaded** environments.

		---

		Rules / Key Properties :

		| Feature              | `StringBuffer`                       | `StringBuilder`                      |
		| -------------------- | ------------------------------------ | ------------------------------------ |
		| **Mutability**       |  Yes (contents can be changed)       |   Yes (contents can be changed)      |
		| **Thread-safe**      |  Yes (synchronized methods)          |   No (not synchronized)              |
		| **Performance**      |  Slower due to synchronization       |   Faster for single-threaded use     |
		| **Package**          | `java.lang`                          | `java.lang`                          |
		| **Extends**          | `Object`                             | `Object`                             |
		| **Implements**       | `CharSequence`                       | `CharSequence`                       |
		| **Default capacity** | 16 characters (can grow dynamically) | 16 characters (can grow dynamically) |

		---



		###  When to Use `StringBuffer`:

		* When multiple threads might access and modify the same string.
		* In multi-threaded environments where thread safety is a must.
		* When you want safe appending, inserting, or replacing strings.

		###  When to Use `StringBuilder`:

		* For **high performance** operations in a **single-threaded** context.
		* In loops, dynamic string manipulation, real-time data formatting.
		* When you’re sure only one thread will access the string data.

		---

		Limitations :

					`StringBuffer`:

					* **Slower performance** due to method synchronization.
					* May lead to **contention** when used excessively in high-performance apps.

					`StringBuilder`:

					*  **Not thread-safe** — unsafe if accessed by multiple threads simultaneously.
					* ❗Requires **manual synchronization** if used in multithreaded code.

		---
		Common Methods (for Both)**

		* `append()`
		* `insert()`
		* `replace()`
		* `delete()`, `deleteCharAt()`
		* `reverse()`
		* `charAt()`, `setCharAt()`
		* `length()`, `capacity()`, `ensureCapacity()`
		* `substring()`
		* `indexOf()`, `lastIndexOf()`
		* `toString()`

		---

		Comparison Table

		| Feature     | `String`                   | `StringBuffer`              | `StringBuilder`       |
		| ----------- | -------------------------- | --------------------------- | --------------------- |
		| Mutability  |  Immutable                 |  Mutable                    |  Mutable              |
		| Thread-Safe |  Yes                       |  Yes (synchronized)         |  No                   |
		| Performance | Slow (creates new objects) | Slower than `StringBuilder` | Fastest (no sync)     |
		| Use Case    | Fixed/constant data        | Multi-threaded edits        | Single-threaded edits |
		| Memory      | SCP + Heap                 | Heap                        | Heap                  |

*/


public class StringBuffer_StringBuilder {
    public static void main(String[] args) {
        // Using StringBuffer (same methods apply to StringBuilder)
        StringBuffer buffer = new StringBuffer("Hello");

        // append()
        buffer.append(" World");
        System.out.println("append(): " + buffer); // Hello World

        // insert()
        buffer.insert(11, " in Java");
        System.out.println("insert(): " + buffer); // Hello World in Java

        // replace()
        buffer.replace(5, 11, "@@@");
        System.out.println("replace(): " + buffer); // Hello@@@ in Java

        // delete()
        buffer.delete(6, 11);
        System.out.println("delete(): " + buffer); // Hello@Java

        // reverse()
        buffer.reverse();
        System.out.println("reverse(): " + buffer); // avaJ@olleH

        // length()
        System.out.println("length(): " + buffer.length()); // 10

        // capacity()
        System.out.println("capacity(): " + buffer.capacity()); 
        // Output varies; default is 16 + initial length

        // ensureCapacity()
        buffer.ensureCapacity(50); // Ensures at least 50 capacity
        System.out.println("capacity() after ensureCapacity(50): " + buffer.capacity());

        // setCharAt()
        buffer.setCharAt(0, 'A');
        System.out.println("setCharAt(0, 'A'): " + buffer); // AvaJ@olleH → AvaJ@olleH with 'A' at 0

        // charAt()
        System.out.println("charAt(1): " + buffer.charAt(1)); // 'v'

        // indexOf()
        System.out.println("indexOf(\"@\") : " + buffer.indexOf("@")); // Index of @

        // lastIndexOf()
        System.out.println("lastIndexOf(\"l\"): " + buffer.lastIndexOf("l"));

        // substring()
        System.out.println("substring(0, 4): " + buffer.substring(0, 4));

        // deleteCharAt()
        buffer.deleteCharAt(0);
        System.out.println("deleteCharAt(0): " + buffer);

        // setLength()
        buffer.setLength(5);
        System.out.println("setLength(5): " + buffer); // Truncate to 5 characters

        // toString()
        String str = buffer.toString();
        System.out.println("toString(): " + str); // Convert to regular String
    }
}
