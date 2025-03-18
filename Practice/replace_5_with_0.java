
package Practice;

import java.util.Scanner;

public class replace_5_with_0 {

    public static int modified(int n){
        String num=Integer.toString(n);

        num = num.replace('0', '5');
        return Integer.parseInt(num);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num= sc.nextInt();
        System.out.print("The modified number is: "+ modified(num));
    }
}
