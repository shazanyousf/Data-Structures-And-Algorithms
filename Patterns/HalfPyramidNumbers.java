//print a Half Pyramid with numbers
import java.util.Scanner;
public class HalfPyramidNumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = Sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}