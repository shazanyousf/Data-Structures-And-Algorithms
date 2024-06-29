//Make a function to multiply two numbers and return the product

import java.util.Scanner;

public class Function3 {

    public static int calculateProduct(int a, int b){

        int product = a*b;
        
        return product;


    }
    
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter First number");
        
        int a = Sc.nextInt();

        System.out.println("Enter Second Number");

        int b = Sc.nextInt();
        
        Sc.close();

        int product = calculateProduct(a, b);

        System.out.println(product);
    }
    
}
