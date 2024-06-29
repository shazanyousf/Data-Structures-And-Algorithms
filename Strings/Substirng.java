//write a program to print substrings of a string
import java.util.*;
public class Substirng {

    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i = si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";

        // inbuilt function for substring in java
        // System.out.println(subString(str, 0, 5));
        
        System.out.println(subString(str, 0, 5));
    }
    
}
