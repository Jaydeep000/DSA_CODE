package Practice.allSORT;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,6,3,8,9,1,98,55,334,22,15,2,5,7,82};
        Selectionsort(arr);
        printf(arr);
    }
    public static void Selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                int temp=0;
                if(arr[j]>arr[j+1])
                    {temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    }
            }
        }
    }

    public static void printf(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }

}
