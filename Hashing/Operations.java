package Hashing;
import java.util.*;
public class Operations {
    public static void main(String[] args) {
        //Creating a HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert Function ---> o(1)
        hm.put("India", 100);
        hm.put("China", 1000);
        hm.put("USA", 500);
        System.out.println(hm);

        //Get Function ---> o(1)
        int population = hm.get("India");
        System.out.println(population);

        //containsKey Function --> o(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("France"));

        //Remove  Function ---> o(1)
        System.out.println(hm.remove("USA"));
        System.out.println(hm);

    }
}
