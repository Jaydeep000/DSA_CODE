package array.maxSubArraySum;
public class brute_force {
    public static int printSubarrays(int arr[]) {
        
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum=0;
                for (int k = i; k <= j; k++) {
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                 if(maxSum<currSum)
                    maxSum=currSum;
            }
            System.out.println();
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6};  
        System.err.println("Max sum="+ printSubarrays(arr));
    }
}
 