import java.util.Scanner;
public class Circle{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Radius of the Circle");
        float r = Sc.nextFloat();
        double area = (3.14*r*r);
        System.out.println("Area of Circle is : " +area);
    }
}