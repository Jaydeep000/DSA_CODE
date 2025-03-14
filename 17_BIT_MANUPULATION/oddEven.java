public class oddEven {
    //for all odd the lsb allways 1
    //for even always it is 0
    public static void oddEvenn(int n){
        int EvenCheck=1;
        if((n& EvenCheck)==0)
            System.out.println("The Numebr is Even");
        else if ((n& EvenCheck)==1)
        System.out.println("The number is Odd");
    }
    public static void main(String[] args) {

        oddEvenn(5);
        oddEvenn(3);
        oddEvenn(6);
    }
}
