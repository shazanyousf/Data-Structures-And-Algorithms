import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Income");
        int income = Sc.nextInt();
        int tax;
        if (income < 500000){
            tax = 0;
            //System.out.println(tax);
        }
        else if(income >= 500000 && income<1000000){
            tax = (int) (income*0.2);
            //System.out.println(tax);
        }
        else{
            tax = (int) (income*0.3);
           // System.out.println(tax);
        }
        System.out.println("Your Tax is : " + tax);
    }
    
}
