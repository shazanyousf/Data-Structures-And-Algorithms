//print a Inverted Pyramid
import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = Sc.nextInt();
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}