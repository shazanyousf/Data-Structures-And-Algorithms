import java.util.Scanner;
public class Loop4 {
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i<=n){
            sum+=i;
            i++;

        }
        System.out.println(sum);

    }
    
}
