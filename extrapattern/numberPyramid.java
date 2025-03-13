//    1
//   2 2
//  3 3 3
// 4 4 4 4



package extrapattern;

public class numberPyramid {
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j= 1;j<=n-i;j++){
                System.out.print(" ");
            }
        for (int j=1;j<=i;j++) {
                System.err.print(i+ " ");
        }
        System.out.println();
        }
    }


    public static void palindrome(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=i;j>=1;j--)
                System.out.print(j);
            for(int j=2;j<=i;j++)
                System.out.print(j);    
                System.out.println();        
        }
        
    }

    public static void main(String[] args) {
        // pattern(5);
        palindrome(9);
    }
}
