package Hashing;
//Count distinct elements                   Time Complexity ---> O(n)
import java.util.*;
public class CountDistinctElements {
    public static void main(String[] args) {
        int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> s = new HashSet<>();

        for(int i = 0; i<num.length; i++){
            s.add(num[i]);
        }
        System.out.println("Ans = " + s.size());
    }
}
