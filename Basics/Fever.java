import java.util.Scanner;
public class Fever{
    public static void main(String[]args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Temperature");
        double temp = Sc.nextDouble();
        String fever = temp>100? "You have a fever" : "No You dont have fever";
        System.out.println(fever);
    }
}