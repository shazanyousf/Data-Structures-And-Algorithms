import java.util.Scanner;

public class Day {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a Number");

        int a = Sc.nextInt();

        if (a==1) {

            System.out.println("Monday");

        }

        else if (a==2){

            System.out.println("Tuesday");
        }

        else if (a==3){

            System.out.println("Wednesday");

        }

        else if (a==4){

            System.out.println("Thursday");

        }

        else if (a==5){

            System.out.println("Friday");

        }

        else if (a==6){

            System.out.println("Saturday");

        }

        else if (a==7){

            System.out.println("Sunday");

        }

        else {

            System.out.println("Wrong Day Entered");

        }
        
    }
    
    
}
