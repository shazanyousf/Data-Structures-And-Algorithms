import java.util.Scanner;
public class CustomerBill {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter cost of pen");
        int pen = Sc.nextInt();
        System.out.println("Enter cost of pencil");
        int pencil = Sc.nextInt();
        System.out.println("Enter cost of eraser");
        int eraser = Sc.nextInt();
        float total = pen+pencil+eraser;
        System.out.println("Bill is: " + total);
    }
    
}
