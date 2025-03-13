package AllSorting;

public class s2_selectionSort {
    public static void main(String[] args) {
        int[] arr={4,6,3,8,9,1};
        sort(arr);
        printf(arr);
    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    } 
    public static void printf(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
