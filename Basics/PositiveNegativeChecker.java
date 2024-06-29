import java.util.Scanner;

public class PositiveNegativeChecker {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a Number");

        int a = Sc.nextInt();

        if (a>0){

            System.out.println("Number Entered is Positive");

        }
        
        else if(a<0){

            System.out.println("Number Entered is Negative");

        }

        else {

            System.out.println("Number Entered is Zero");
        }
    }
    
}
