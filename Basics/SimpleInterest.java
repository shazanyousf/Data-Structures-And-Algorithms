import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter Amount");

        float p = Sc.nextFloat();

        System.out.println("Enter Rate Of Interest");

        float r = Sc.nextFloat();

        System.out.println("Enter Time");

        float t = Sc.nextFloat();

        double si = (p*r*t)/100;

        System.out.println(si);

    }
    
}
