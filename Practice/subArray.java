package Practice;

import java.util.*;

public class subArray {
    public static void main(String[] args) {
        int[] arr = {5,7,-3,1,2,10,9};
        int k = 3;
        maxSub(arr, k);
    }

    public static void maxSub(int[] a, int k) {
        int n = a.length;
        ArrayList<Integer> arr=new ArrayList<>();

        for (int i = 0; i <= n - k; i++) {
            int max = a[i];
            for (int j = i; j < i + k; j++) {
                if (a[j] > max) 
                max = a[j];
            }
            arr.add(max);
        }
        System.out.println(arr);;
    }
}

