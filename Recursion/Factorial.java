//Write a program to print factorial of a number

import java.util.*;
public class Factorial {
    
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = Factorial(n-1);
        int fn = n*Factorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Sc.nextInt();
        Sc.close();
        System.out.println(Factorial(n));
    }
}
