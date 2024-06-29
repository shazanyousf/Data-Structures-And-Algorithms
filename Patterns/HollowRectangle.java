//print a Hollow rectangle
import java.util.Scanner;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int lines = Sc.nextInt();
        System.out.println("Enter number of Stars");
        int stars = Sc.nextInt();
        
        for(int i = 1; i<=lines; i++){
            for(int j = 1; j<=stars; j++){
                if(i==1 || i==lines || j==1 ||j==stars){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
