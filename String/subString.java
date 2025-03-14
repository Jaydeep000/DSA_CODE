package String;

public class subString {
    public static String subStrings(String str ,int s,int e){
        String subStr="";
        for(int i=s;i<e;i++)
            subStr+=str.charAt(i);

            return subStr;
    } 
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(subStrings(str, 0, 5));
        System.out.println("in system : "+ str.substring(0,4));
    }
}
