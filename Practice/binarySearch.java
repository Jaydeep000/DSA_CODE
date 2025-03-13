package Practice;
import java.util.*;
public class binarySearch {

    public static int binary(int arr[], int key){
        int start=0,end=arr.length-1;
        
        

        while (start<=end){
            int mid = start + (end - start) / 2;
            if (arr[mid]==key)
                return mid;
            else if (arr[mid]>key)
                end=mid-1;
            else start=mid+1;
        }


            return -1;
    }
    public static void main(String[] args) {
        int x,key;
        System.out.print("Enter your number of elements: ");
        Scanner sc=new Scanner (System.in);
        x=sc.nextInt();
        int arr[]= new int[x];
        for(int i=0;i<x;i++)
            arr[i]= sc.nextInt();
        System.out.print("Enter your Key:");
        key=sc.nextInt();
        sc.close();
        int result = binary(arr, key);  
        if (result == -1)
            System.out.println("Your key is not in the array.");
        else     
            System.out.println("Your key is at index " + result);
   }
}
