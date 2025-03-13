package Practice;

public class maxSubArray {


    public static int maxSub(int[] arr){
        int currSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){ // i= 0; 
            for (int j=i;j<arr.length;j++){ //j=0
                currSum=0;  //curr= arr[0]= 1
                for (int k=i;k<=j;k++) //k=0, 
                {   
                    currSum+=arr[k];
                   System.out.print(arr[k]+ " ");
                    }
                    if(max<currSum){
                            max=currSum;
                      
                }
                System.out.println();
               
            }
            
            System.out.println("Current sum= "+ currSum);
            System.out.println();
        
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        System.out.print("Max sum is :"+maxSub(arr));
    }
}
