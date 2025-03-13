package FunctionsAndMethod;

public class prime {

//     public static boolean isPrime(int n) {
//         boolean isPrime = true;
//         if (n <= 1) {
//             return false;
//         }
//         if (n == 2) {
//             return true;
//         }
//         if (n % 2 == 0) {
//             return false;
//         }
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
// }

public static boolean isPrime(int n){
    if (n==2) { 
    return true;}

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
public static void main(String[] args) {
    System.out.println(isPrime(7));
}
}

