package array;
public class arrayCC {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++)
            marks[i]+=1;
    }
    public static void main(String[] args) {
        // int marks[]= new int[50];
        // // String fruits[]={"Apple","Banana"};

        // // System.out.println(fruits);
        // Scanner sc=new Scanner(System.in);
        // marks[1]=sc.nextInt();
        // System.out.println(marks[1]);
        int marks[]= {56,45,3,34};
        update (marks);
        for(int i=0;i<marks.length;i++)
            System.out.println("marks : "+ marks[i]+ " ");
    }
}
