import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
          Scanner Sc = new Scanner(System.in);
          System.out.println("Enter First Number");
          int num_1 = Sc.nextInt();
          System.out.println("Enter Second Number");
          int num_2 = Sc.nextInt();
          int sum = num_1 + num_2;
          System.out.println("The Sum is: "+sum);
    }
  
}
