//Write a program to print nth Fibonacci number
import java.util.*;
public class Fibonacci {

    public static int Fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = Fib(n-1);
        int fnm2 = Fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = Sc.nextInt();
        Sc.close();    
        System.out.println(Fib(n));
    }
    
}
