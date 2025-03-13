package array;
public class largestArr {
    public static int  small(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if( min>arr[i] )
                min=arr[i]; 
        }
        return min;
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,6,3,5};
        System.out.println(small(arr));
    }
}
