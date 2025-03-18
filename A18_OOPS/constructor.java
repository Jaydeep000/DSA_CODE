package A18_OOPS;

public class constructor {
    public static void main(String[] args) {
        Student s1= new Student();
        
    }
}

class Student{
    String name;
    int roll;

    Student(){//constructor
System.out.println("Constructor is called");
    }
}
