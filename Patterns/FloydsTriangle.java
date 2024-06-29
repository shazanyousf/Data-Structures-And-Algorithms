//Floyd's Triangle
import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = Sc.nextInt();
        int number = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(number+" ");
                number++;

            }
            System.out.println();
        }
    }
    
}
