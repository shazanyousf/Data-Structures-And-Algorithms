package Hashing;
import java.util.*;
public class IterationOnHashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Indonesia", 130);
        hm.put("USA", 140);
        hm.put("Nepal", 110);
        
        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("Key = " + k + ",Value = " + hm.get(k));
        }
    }
}
