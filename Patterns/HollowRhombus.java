//Hollow Rhombus
import java.util.Scanner;
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}