package AllSorting;

import java.util.Arrays;

public class s3_insertionSort {
    public static void main(String[] args) {
        int[] arr={4,6,3,8,9};
        Arrays.sort(arr);
        // sort(arr);
        printf(arr);
    }
    public static void sort(int[]arr){
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= temp;

        }
    }
    public static void printf(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
