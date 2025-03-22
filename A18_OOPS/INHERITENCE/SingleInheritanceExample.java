package A18_OOPS.INHERITENCE;

// Parent class
class Animal {
    String name = "Unknown Animal";

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class to execute the program
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Creating an object of the Dog class
        System.out.println("Animal Name: " + myDog.name); // Accessing parent class variable
        myDog.makeSound(); // Calling parent class method
        myDog.bark(); // Calling child class method
    }
}
