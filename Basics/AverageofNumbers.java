import java.util.Scanner;
public class AverageofNumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = Sc.nextInt();
        System.out.println("Enter First Number");
        int b = Sc.nextInt();
        System.out.println("Enter First Number");
        int c = Sc.nextInt();
        int sum = (a+b+c);
        float f = (sum/3);
        System.out.println(f);
    }
    
}
