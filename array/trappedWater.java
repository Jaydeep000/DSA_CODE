package array;
import java.util.*;
public class trappedWater {
    public static int trapped_rain(int[] height){
        int n=height.length;
        int [] leftmax= new int[n];
        int[] rightmax=new int[n];

        //calculating left max
        leftmax[0]= height[0];
        for (int i=1;i<n;i++) {
            leftmax[i]= Math.max(leftmax[i-1],height[i]);
        }

        //calculating the rightmax
        rightmax[n-1]=height[n-1];
        for (int i= n-2;i>=0;i--){
            rightmax[i]= Math.max(height[i], rightmax[i+1]);
        }
        //water level
        int trapped_water =0;
        for (int i=0;i<n;i++){
            trapped_water+= (Math.min(rightmax[i],leftmax[i])- height[i]);
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int arr[]= {4,2,0,6,3,2,5};
        System.out.println("max water is :"+ trapped_rain(arr));
    }
}
