package A18_OOPS.INHERITENCE;

// Parent class
class Animal {
    void breathe() {
        System.out.println("All animals breathe.");
    }
}

// Subclass 1: Fish (inherits Animal)
class Fish extends Animal {
    void swim() {
        System.out.println("Fish can swim.");
    }
}

// Subclass 2: Bird (inherits Animal)
class Bird extends Animal {
    void fly() {
        System.out.println("Birds can fly.");
    }
}

// Subclass 3: Mammal (inherits Animal)
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

// Tuna class inherits Fish
class Tuna extends Fish {
    void type() {
        System.out.println("Tuna is a type of fish.");
    }
}

// Shark class inherits Fish
class Shark extends Fish {
    void type() {
        System.out.println("Shark is a predatory fish.");
    }
}

// Peacock class inherits Bird
class Peacock extends Bird {
    void type() {
        System.out.println("Peacock is a colorful bird.");
    }
}

// Dog class inherits Mammal
class Dog extends Mammal {
    void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Cat class inherits Mammal
class Cat extends Mammal {
    void sound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

// Human class inherits Mammal
class Human extends Mammal {
    void speak() {
        System.out.println("Humans can speak multiple languages.");
    }
}

// Main class to execute the program
public class HybridInheritanceExample {
    public static void main(String[] args) {
        Tuna tuna = new Tuna();
        Shark shark = new Shark();
        Peacock peacock = new Peacock();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Human human = new Human();

        System.out.println("Tuna:");
        tuna.breathe();
        tuna.swim();
        tuna.type();

        System.out.println("\nShark:");
        shark.breathe();
        shark.swim();
        shark.type();

        System.out.println("\nPeacock:");
        peacock.breathe();
        peacock.fly();
        peacock.type();

        System.out.println("\nDog:");
        dog.breathe();
        dog.walk();
        dog.sound();

        System.out.println("\nCat:");
        cat.breathe();
        cat.walk();
        cat.sound();

        System.out.println("\nHuman:");
        human.breathe();
        human.walk();
        human.speak();
    }
}
