import java.util.Scanner;

public class VotingSystem {

public static void main(String[] args) {
    
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter age of the Person");

    int age = Sc.nextInt();

    if (age>=0 && age<18) {

        System.out.println("The Person Cannot Vote");

        }

        else if (age>=18){

            System.out.println("Person Can Vote");

        }

        else {
            
            System.out.println("Wrong age entered by user");

        }
        
    
}
    
}
