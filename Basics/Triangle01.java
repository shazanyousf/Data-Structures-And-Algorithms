//Floyd's Triangle
import java.util.Scanner;
public class Triangle01 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = Sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
    
}