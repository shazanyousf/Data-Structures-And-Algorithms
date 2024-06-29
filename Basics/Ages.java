import java.util.Scanner;

public class Ages {

    public static void main(String[] args) {
        
    Scanner Sc = new Scanner(System.in);
    
    System.out.println("Enter age of faizan");

    int f = Sc.nextInt();

    System.out.println("Enter age of Shazan");

    int s = Sc.nextInt();

    System.out.println("Enter age of Meezan");

    int m = Sc.nextInt();

    if (f>s && f>m) {

        System.out.println("Faizan is greater");

    }

    else if (s>f && s>m){

        System.out.println("Shazan Is Greater");

    }

    else {

        System.out.println("Meezan is greater");

    }
    
    }
    
}
