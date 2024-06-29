//write a program to check if a string is a palindrome
//This question was asked in INTUIT company
import java.util.*;
public class PalindromeString{
    public static boolean isPalindrome(String str){
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                

                //Not a Palindrome Condition
               return false;
            }
        }
            return true;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(isPalindrome(str));
    }

}