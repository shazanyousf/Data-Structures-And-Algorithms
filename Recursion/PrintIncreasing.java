//Write a program to print numbers from 1 to n using recursion(Increasing Order)

import java.util.*;
public class PrintIncreasing{

    public static void printIncreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
        
        
}
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Sc.nextInt();
        Sc.close();
        printIncreasing(n);
    }
}