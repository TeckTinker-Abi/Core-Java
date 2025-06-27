/*
-----------------------------------------------------
                 Singleton Class in Java
-----------------------------------------------------

► Definition:
A Singleton class in Java is a class that allows only **one instance** to be created throughout the lifetime of the application.

► Purpose:
Used when exactly **one object** is needed to coordinate actions across a system, such as in logging, configuration, or database access.

-----------------------------------------------------
            Key Characteristics of Singleton
-----------------------------------------------------

- **Private Constructor**: Prevents external instantiation.
- **Static Instance Variable**: Holds the single instance of the class.
- **Public Static Method**: Provides global access to the instance (commonly named `getInstance()`).
- Ensures only one instance is created and reused globally.

-----------------------------------------------------
                Types of Singleton
-----------------------------------------------------

1. **Eager Initialization**:
   - Instance is created at class loading time.
   - Simple but may create instance even if not needed.

2. **Lazy Initialization**:
   - Instance is created only when requested.
   - Saves memory but may require synchronization in multithreaded environments.

3. **Thread-Safe Singleton**:
   - Ensures that multiple threads do not create multiple instances.
   - Achieved using synchronized blocks or methods, or double-checked locking.

4. **Bill Pugh Singleton**:
   - Uses static inner class for lazy-loading and thread safety.
   - Recommended for efficient and thread-safe implementation.

-----------------------------------------------------
                 Use Cases
-----------------------------------------------------

- Logger class
- Configuration manager
- Thread pool manager
- Connection pool
- Cache

-----------------------------------------------------
                  Advantages
-----------------------------------------------------

- Controls resource usage by preventing multiple object creation.
- Provides a global point of access to the instance.
- Ensures consistent behavior across the system using a single object.

-----------------------------------------------------
                  Summary
-----------------------------------------------------

- Singleton ensures **only one object** of the class exists.
- Combines private constructor + static method + static instance.
- Ideal for managing **shared resources** and ensuring **global access**.
*/


class singleclass
{
	static singleclass obj = null;
	singleclass(){}
	public static singleclass getInstance()
	{
		if (obj==null)
			obj = new singleclass();
		
		return obj;	
		
		
	}
	
	void display()
	{	
		System.out.println("From the Singleton Class.");
	}
}

public class Singleton_Class
{
	public static void main(String args[])
	{
		singleclass a = singleclass.getInstance();
		a.display();
	}
}
