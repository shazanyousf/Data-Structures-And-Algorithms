import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = Sc.nextInt();
        if (year%4==0 && year%100!=0){
            System.out.println("This Is a Leap Year");
        } 
        else {
            System.out.println("No It is Not a Leap Year");
        }
    }
    
}
