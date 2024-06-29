//Write a program to print numbers from n to 1 using recursion(Decreasing Order)

import java.util.*;
public class PrintDecreasing{

    public static void printDecreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
        
}
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Sc.nextInt();
        Sc.close();
        printDecreasing(n);
    }
}