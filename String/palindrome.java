package String;
public class palindrome {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        int n = filtered.length();
        for (int i = 0; i < n / 2; i++) {
            if (filtered.charAt(i) != filtered.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }


public static float shortestpATH(String path) {
    StringBuilder strr =new StringBuilder();
    int x=0,y=0;
    for(char c: path.toCharArray())
    {
        strr.append(Character.toLowerCase(c));
    }
    for(int i=0;i<strr.length();i++){
        // south
        if(strr.charAt(i)=='s')
            y--;
        //east
        else if(strr.charAt(i)=='n')
            y++;
        //west
        else if(strr.charAt(i)=='w')
            x--;
        else x++;
    }
    return (float)(Math.sqrt(x*x +y*y));

    }


    public static void main(String[] args) {
        String str="WnEeNesennn  ";
        // System.out.println(isPalindrome(str));
        // System.out.println(shortestpATH(str));
        System.out.println(StringCompare(str));
    }
}
