import java.util.*;

public class Triangle {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter first side of the triangle");

        int f = Sc.nextInt();

        System.out.println("Enter Second side of the triangle");

        int s = Sc.nextInt();

        System.out.println("Enter Third side of the triangle");

        int t = Sc.nextInt();

        if (f+s==t || f+t==s || s+t==f){

            System.out.println("They are sides of a valid triangle");

        }

        else{
            
            System.out.println("This is invalid triangle");
        }
    }
    
}
