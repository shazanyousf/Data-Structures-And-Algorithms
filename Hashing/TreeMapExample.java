package Hashing;
//Tree Map
import java.util.*;
public class TreeMapExample {
    
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 2100);
        tm.put("China", 2100);
        tm.put("Pakistan", 2100);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 2100);
        hm.put("China", 2100);
        hm.put("Pakistan", 2100);

        System.out.println("HashMap: " + hm);
        System.out.println("TreeMap: " + tm);
    }
}
