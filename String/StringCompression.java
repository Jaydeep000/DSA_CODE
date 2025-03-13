package String;

public class StringCompression {


    public static String sctringComp(String str){
        int n=str.length();
        StringBuilder sb= new StringBuilder();
        
         
        for(int i= 0;i<n;i++){
            Integer count=1;
            while (i<n-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    /// "aaabbcccdd" => "a3b2c3d2"
    
public static void main(String[] args) {
    String str="aaabbcccddtttttfffhhhhaaaavvvv";
    System.out.println(sctringComp(str));
}

}
