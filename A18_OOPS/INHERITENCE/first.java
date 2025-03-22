package A18_OOPS.INHERITENCE;

public class first {
    public static void main(String[] args) {
        Fish Shark= new Fish();
        Shark.eat();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breate(){
        System.out.println("Breathes");
    }
}

// derived Class 
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim in the water.");
    }
}