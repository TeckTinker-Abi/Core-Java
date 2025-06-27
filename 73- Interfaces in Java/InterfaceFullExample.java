/*
-----------------------------------------------------
                Interfaces in Java
-----------------------------------------------------

► Definition:
An interface in Java is a blueprint of a class. It is used to achieve abstraction and multiple inheritance by declaring method signatures without implementations.

► Syntax:
    interface InterfaceName {
        returnType methodName(parameters);
    }

-----------------------------------------------------
                 Key Points
-----------------------------------------------------

- Interfaces can contain:
  - Abstract methods (implicitly public and abstract).
  - Constants (implicitly public, static, and final).
  - Default methods (with body, introduced in Java 8).
  - Static methods (with body).
  - Private methods (from Java 9 onward).

- A class **implements** an interface using the `implements` keyword.

- A class can implement **multiple interfaces**, supporting multiple inheritance.

- All methods in an interface are abstract by default (till Java 7).

- Interfaces cannot have constructors and cannot be instantiated.

- A class that implements an interface must override all its abstract methods unless the class is declared abstract.

-----------------------------------------------------
               Use Cases
-----------------------------------------------------

- Used to define a contract that other classes must follow.

- Supports loose coupling between code components.

- Helps achieve full abstraction in Java.

- Ideal for designing large-scale systems where functionality may vary across implementations.

-----------------------------------------------------
             Interface vs Abstract Class
-----------------------------------------------------

- Interface has only method declarations (till Java 7); abstract class can have both declarations and definitions.

- A class can implement **multiple interfaces**, but only **extend one abstract class**.

- Interfaces do not support constructors or instance variables; abstract classes can have both.

- Interfaces support default, static, and private methods (from Java 8 and 9).

-----------------------------------------------------
                 Summary
-----------------------------------------------------

- An interface is a contract that defines what a class must do without specifying how.

- Interfaces support multiple inheritance and help achieve complete abstraction.

- Widely used in Java frameworks and real-world applications to define interchangeable components.
*/



// Interface with all types of methods
interface Device {

    // Constant field (public static final by default)
    String TYPE = "Electronic";

    // Abstract method (must be overridden)
    void start();

    // Default method (can be inherited or overridden)
    default void status() {
        System.out.println("Device status: ON");
    }

    // Static method (belongs to interface, not the class)
    static void deviceInfo() {
        System.out.println("Device type: " + TYPE);
        System.out.println("All devices must be handled with care.");
    }
}

// Class implementing the interface
class Laptop implements Device {

    // Must override abstract method
    public void start() {
        System.out.println("Laptop is starting...");
    }

    // Optional: Override default method (not required)
    @Override
    public void status() {
        System.out.println("Laptop status: Booted and running.");
    }

    // Own method
    public void shutDown() {
        System.out.println("Laptop is shutting down...");
    }
}

// Main class
public class InterfaceFullExample {
    public static void main(String[] args) {

        // Create object
        Laptop l1 = new Laptop();

        // Call abstract method (overridden)
        l1.start();

        // Call default method (overridden in class)
        l1.status();

        // Call own method of Laptop
        l1.shutDown();

        // Call static method of interface
        Device.deviceInfo();

        // Access constant field
        System.out.println("Accessing interface constant: " + Device.TYPE);
    }
}
