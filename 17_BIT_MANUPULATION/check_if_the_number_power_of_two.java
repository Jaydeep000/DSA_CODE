public class check_if_the_number_power_of_two {
    public static int check(int n){
        return (n & (n-1));
    }
    public static void main(String[] args) {
        System.out.println(check(15)==0? "the number is Power of two": "the number is not power of two");
        System.out.println(check(8)==0? "the number is Power of two": "the number is not power of two");
    
    }
}
