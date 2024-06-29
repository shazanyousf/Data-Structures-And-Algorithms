import java.util.Scanner;

public class Divisibleby5 {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter any number");

        int a = Sc.nextInt();
        
        if (a>0 && a%5==0)  {

            System.out.println("The Number is divisible by five");

        }

        else {

            System.out.println("The Number is not divisible by 5");

        }

    }
    
}
