//Print a given name in function

import java.util.Scanner;

public class Fucntion1{

    public static void printMyName(String name){

        System.out.println(name);

        return;

    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter Name");

        String name = Sc.next();

        Sc.close();
    
        printMyName(name);

    }

}