package A18_OOPS.INHERITENCE;

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// First Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Second Child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

// Main class to execute the program
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Dog object
        Cat myCat = new Cat();  // Cat object

        System.out.println("Dog:");
        myDog.makeSound(); // Calling parent class method
        myDog.bark(); // Calling Dog-specific method
    }
}