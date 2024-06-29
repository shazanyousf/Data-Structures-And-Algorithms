import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Cost Price of Item");
        int cp = Sc.nextInt();
        System.out.println("Enter Selling Price of Item");
        int sp = Sc.nextInt();
        if (cp<sp){
            System.out.println("Seller gained Profit");
            int profit = sp-cp;
            System.out.println(profit);
        }
        else if (cp>sp) {
            System.out.println("Seller Incurred Loss");
        }
        else{
            System.out.println("Seller Neither Gained Profit Nor Incurred Loss");
        }
    }
    
}
