import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = Sc.nextInt();
        String reportCard = marks >= 33? "Pass" : "Fail";
        System.out.println(reportCard);

    }
    
}
