package array;
//concept nested loop
import java.util.Scanner;


public class pairs {
    public static void paitArray(int arr[]){
        int pairs=0;

        for (int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1; j<arr.length;j++){
                System.out.print("("+curr +","+arr[j]+")");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs= "+pairs);
    }

    //pairs = n(n-1) /2
    public static void main(String[] args) {
        int x;
        System.out.print("Enter your number of elements: ");
        Scanner sc=new Scanner (System.in);
        x=sc.nextInt();
        int arr[]= new int[x];
        for(int i=0;i<x;i++)
            arr[i]= sc.nextInt();
        paitArray(arr);

        }
}
