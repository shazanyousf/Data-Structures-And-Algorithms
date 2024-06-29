//print a solid rectangle
import java.util.Scanner;
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int lines = Sc.nextInt();
        System.out.println("Enter number of Stars");
        int stars = Sc.nextInt();
        
        for(int i = 1; i<=lines; i++){
            for(int j = 1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
