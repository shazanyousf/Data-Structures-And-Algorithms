//Make a function to add two numbers and return the sum

import java.util.Scanner;

public class Function2{

    public static int calculateSum(int a, int b){

        int sum = a+b;

        return sum;

    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter 1st number");

        int a = Sc.nextInt();

        System.out.println("Enter Second number");

        int b = Sc.nextInt();
        
        Sc.close();

        int sum = calculateSum(a, b);

        System.out.println(sum);

    }

}
