import java.util.Scanner;
public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = Sc.nextInt();
        switch (n) {
            case 1:
            System.out.println("Samosa");
            break;
            case 2:
            System.out.println("Burger");
            break;
            case 3:
            System.out.println("Momos");
            break;
            default:
            System.out.println("You Entered Wrong");
                break;
        }
    }
    
}
