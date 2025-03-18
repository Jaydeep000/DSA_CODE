package A18_OOPS;

public class types_of_constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("JAydeep");
        Student s3=new Student("123");
    }
}



// 1. Non- parameterised Constructor
/*class Student{
    String name;
    int roll;

    Student(){//constructor // Non- parameterised Constructor
System.out.println("Constructor is called");
    }
}
    */
//2. parameterised Constructor
class Student{
    String name;
    int roll;
    Student(){//constructor // Non- parameterised Constructor
        System.out.println("Constructor is called");
    }
    Student(String name){//constructor // parameterised Constructor
        this.name=name;
    }
    Student(int roll){//constructor // parameterised Constructor
        this.roll=roll;
            }
}

//copy constructor