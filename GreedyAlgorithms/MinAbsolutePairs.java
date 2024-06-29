import java.util.*;
public class MinAbsolutePairs {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {2, 1, 3};
        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff = 0;
        for(int i =  0; i<a.length; i++){
            minDiff += Math.abs(a[i] -  b[i]);
        }
        System.out.println("Minimum difference of pairs is = "+ minDiff);
    }
}
