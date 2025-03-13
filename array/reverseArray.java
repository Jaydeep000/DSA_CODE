package array;
//optimised approach
import java.util.Scanner;

public class reverseArray {
    public static void revArr(int arr[]){
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp= arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
    }


    public static void main(String[] args) {
        int x;
        System.out.print("Enter your number of elements: ");
        Scanner sc=new Scanner (System.in);
        x=sc.nextInt();
        int arr[]= new int[x];
        for(int i=0;i<x;i++)
            arr[i]= sc.nextInt();

            revArr(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    
}
}
