/*
-----------------------------------------------------
             Method Overriding in Java
-----------------------------------------------------

► Definition:
Method Overriding in Java occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.

► Syntax:
    @Override
    returnType methodName(parameters) {
        // new implementation
    }

► Use Case:
Used to define behavior that is specific to the subclass, even though the method is already defined in the superclass.

-----------------------------------------------------
               Key Rules
-----------------------------------------------------

- The method in the subclass must have:
  - The **same name**,
  - The **same return type**, and
  - The **same parameter list** as the method in the superclass.

- The access level of the overriding method cannot be more restrictive than the overridden method.

- Only **inherited** methods can be overridden.

- The method cannot be **static**, **final**, or **private** if it is to be overridden.

- The use of the `@Override` annotation is optional but recommended for clarity and error-checking.

-----------------------------------------------------
               Key Points
-----------------------------------------------------

- It is an example of **runtime polymorphism** (dynamic method dispatch).

- Method resolution happens at **runtime** based on the object type, not the reference type.

- The superclass method is overridden to provide specific behavior in the subclass.

- Constructors cannot be overridden.

- If needed, the parent class method can still be called using `super.methodName()`.

-----------------------------------------------------
               Advantages
-----------------------------------------------------

- Supports dynamic method binding.

- Enables specific behavior in subclasses while maintaining a general contract.

- Helps in achieving runtime polymorphism and better code organization.

-----------------------------------------------------
               Summary
-----------------------------------------------------

- Method Overriding allows a subclass to provide a new version of a method defined in its superclass.

- It enables dynamic polymorphism and custom behavior in object-oriented programming.

- It is resolved at runtime and used for flexibility and extensibility.
*/




class base
{
	String name;
	int Rollno;
	
	base(String x , int y)
	{
		this.name=x;
		this.Rollno=y;
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+Rollno);
		
	}
}

class programmer extends base
{
	String Companyname;
	
	programmer(String x, int y, String z)
	{
		super(x,y);
		this.Companyname=z;
	}
		
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+Rollno);
		System.out.println("Companyname : "+Companyname);
		
	}
}
public class Method_Overriding
{
	public static void main(String args[])
	{
		programmer p = new programmer("Abi",22009,"Google");
		p.display();
		
	}
}
