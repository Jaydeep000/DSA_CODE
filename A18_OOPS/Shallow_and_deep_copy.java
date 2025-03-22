package A18_OOPS;

public class Shallow_and_deep_copy {public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "jaydeep";
    s1.roll = 1;
    s1.password = "abcd";
    s1.marks[0] = 100;
    s1.marks[1] = 99;
    s1.marks[2] = 98;

    //new object
    Student s2 = new Student(s1);
    s2.password = "xyz";
    s1.marks[2] = 56;
    for (int i = 0; i < 3; i++) {
        System.out.println(s2.marks[i]);
        
    }
    System.out.println(s2.password);
}
}

class Student {

String name;
int roll;
int[] marks;
String password;


//copy constructor //shallow copy
// Student(Student s1) {
//     marks = new int[3];
//     this.name = s1.name;
//     this.roll = s1.roll;
//     this.marks = s1.marks;
//     // this.password= s1.password;
// }


//deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;

        for (int i = 0; i < 3; i++) {
            this.marks[i]=s1.marks[i];
        }
    }

Student() {//constructor // Non- parameterised Constructor
    marks = new int[3];
    System.out.println("Constructor is called");
}
}