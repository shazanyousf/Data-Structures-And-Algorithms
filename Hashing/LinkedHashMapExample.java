package Hashing;

import java.util.*;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 2100);
        lhm.put("China", 2100);
        lhm.put("Pakistan", 2100);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 2100);
        hm.put("China", 2100);
        hm.put("Pakistan", 2100);

        System.out.println("HashMap: " + hm);
        System.out.println("LinkedHashMap: " + lhm);
    }
}
