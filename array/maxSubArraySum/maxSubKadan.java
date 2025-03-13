package array.maxSubArraySum;
//+ve + -ve =+ve
//+ve + (-ve)big = -ve


public class maxSubKadan {

    public static int printSubarrays(int arr[]) {
        
        int maxSum=Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum= currSum+ arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6};  
        System.err.println("Max sum="+ printSubarrays(arr));
    }
}
