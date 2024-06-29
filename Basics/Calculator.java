import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = Sc.nextInt();
        System.out.println("Enter b");
        int b = Sc.nextInt();
        System.out.println("Enter Operator");
        char operator = Sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
                case '-':
                System.out.println(a-b);
                break;
                case '*':
                System.out.println(a*b);
                break;
                case '/':
                System.out.println(a/b);
                break;
            default:
            System.out.println("wrong operator");
                break;
        }
    }
    
}
