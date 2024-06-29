import java.util.Scanner;
public class Reverse2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = Sc.nextInt();
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10; //n/=10;
        }
            System.out.println();
    }
    
}