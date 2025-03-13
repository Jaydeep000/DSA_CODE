package array.maxSubArraySum;

public class prefixSum {
    public static int printSubPrefix(int[] arr) {
        int max = Integer.MIN_VALUE;
        int currSum;
        int[] prefix = new int[arr.length];

        // Compute prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Find maximum subarray sum using prefix sums
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) { // Fix: j should be < arr.length
                currSum = (i == 0) ? prefix[j] : (prefix[j] - prefix[i - 1]); // Fix condition
                max = Math.max(max, currSum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6};  
        System.out.println("Max sum = " + printSubPrefix(arr));
    }
}
