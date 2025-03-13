package FunctionsAndMethod;

public class primeInRange {
    public static boolean isPrime(int n){
        if (n==2)
            return true;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;  
        }
        return true;
    }


    public static void PrintRange(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        PrintRange(500);
    }
}
