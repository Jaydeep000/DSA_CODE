package patterns;
import java.util.*;
public class zeroOne {
    public static void zeroO(int n){
        for(int i=1; i<=n;i++){
            for (int j=1;j<=i;j++){
                if ((i+j)%2 ==0)
                    System.out.print(1+ " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

public static void main(String[] args) {
    System.out.println("Enter the number of rows:");
    Scanner sc= new Scanner(System.in);
    int r= sc.nextInt();
    System.out.println("The output is: ");
    zeroO(r);
    sc.close();
}
}
