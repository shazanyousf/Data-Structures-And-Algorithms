import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args) {
        Scanner Sc  = new Scanner(System.in);
        System.out.println("Enter n natural number");
        int n = Sc.nextInt();
        int counter = 1;
        while (counter<=n) {
            System.out.println(counter);
            counter++;
        }

    }
    
}
