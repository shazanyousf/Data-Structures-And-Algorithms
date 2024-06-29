//Write a program to print sum of n natural numbers


import java.util.*;
public class NaturalSum {
    
    public static int calculateSum(int n){
        if(n==1){
            return 1;
        }
        int Snm1 = calculateSum(n-1);
        int Sn = n+Snm1;
        return Sn;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Sc.nextInt();
        Sc.close();
        System.out.println(calculateSum(n));
    }
}
