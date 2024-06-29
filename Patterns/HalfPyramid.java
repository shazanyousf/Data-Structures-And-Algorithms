//print a Half Pyramid
import java.util.Scanner;
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = Sc.nextInt();
        // System.out.println("Enter number of Stars");
        // int stars = Sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}