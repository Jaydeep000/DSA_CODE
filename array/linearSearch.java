package array;

import java.util.Scanner;

public class linearSearch {
    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++)
            if(num[i]==key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int s;
    System.out.println("How many numbers?");
    Scanner sc =new Scanner(System.in);
    s=sc.nextInt();
      int numbers[]=new int[s];
      System.out.println("Enter the numbers in Assending:");
      for(int i=0;i<numbers.length;i++){
        numbers[i]=sc.nextInt();
      }
      System.out.println("Enter the Key:");
      int key=sc.nextInt();
      int index=linear(numbers, key);
      System.out.println("Key is at:"+ index);


    }
}
