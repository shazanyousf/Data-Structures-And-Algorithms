//Print Inverted Half Pyramid Of Numbers
import java.util.Scanner;
public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Number Of Lines");
        int n = Sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
