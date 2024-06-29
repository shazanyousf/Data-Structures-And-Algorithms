import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = Sc.nextInt();
        System.out.println("Enter Another Number");
        int b = Sc.nextInt();
        if (a>b){
            System.out.println("A is Greatest");
        }
        else {
            System.out.println("B is the greatest");
        }
    }
    
}
