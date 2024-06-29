// Print all binary Strings of size n without consecutive ones
//This Question Was asked in PAYTM company
import java.util.*;
public class BinaryStrings {
    public static void printBinStrings(int n, int lastPlace, String str){
        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // kaam
        printBinStrings(n-1, 0, str +("0"));
        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+(1));
        }
    }
    public static void main(String[] args) {
        printBinStrings(3, 0, (""));
    }
    
}
