package A18_OOPS.INHERITENCE;

public class multilevel_inheritence {
    public static void main(String[] args) {
        Dog newDog= new Dog();
        Puppy pup=new Puppy();
        System.out.println("Name"+ newDog.name);

        newDog.breate();
        newDog.barks();
        newDog.egg();
        newDog.breed();
        pup.barks();
    }
}
class Animal{
    String name= "Unknown name" ; 
    void barks(){
        System.out.println("Animals can make sound ");
    }

    void breate(){
        System.out.println("They can Breathe");
    }
}
class Mamals extends Animal{
    void egg(){
        System.out.println("they not produce any Eggs");
    }
}

class Dog extends Mamals{
    void breed (){
        System.out.println("Dog Can Breed");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps: Whimper... Whimper...");
    }
}
