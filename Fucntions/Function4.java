//Write a program to print the factorial of a number

import java.util.Scanner;

public class Function4 {

    public static void printFactorial(int n){

        if (n<0){

            System.out.println("Invalid Number Entered By The User");

        }

        int factorail = 1;

        for(int i = n; i>=1; i--){

            factorail = factorail*i;

        }

        System.out.println(factorail);

        return;

    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a Number");

        int n = Sc.nextInt();

        Sc.close();

        printFactorial(n);

        }
    
}
