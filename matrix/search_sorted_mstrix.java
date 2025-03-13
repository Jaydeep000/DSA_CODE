package matrix;

public class search_sorted_mstrix {
    public static void search(int [][] arr,int key){
        int row=0;
        int col= arr[0].length-1;
        int curr= arr[row][col];
        while (row< arr.length && col>=0){
            if (curr>key)
                curr=arr [row][col-1];
            else if(curr<key)
                curr=arr[row+1][col];
            else if (curr==key)
                System.out.println("the key is at :"+ row +" "+col+ "position");
            else System.out.println("Your key is not found");
        }
    }

    public static void main(String[] args) {
        int[][] arr= {{1,2,3},
                     {4,5,6},
                     {7,8,9},
                    {10,11,12}};
        int key= 10;
                    search(arr, key);            
        
    }
}
