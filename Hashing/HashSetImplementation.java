package Hashing;
//HashSet
// * No Duplicates
// * Unordered
// * Null is allowed
import java.util.*;
public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
    
        set.add(1);                         //Time complexity --->O(1)
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        //set.remove(2);                      //Time complexity ----> O(1)
        
        // set.clear();

        // System.out.println(set.size());

        // System.out.println(set.isEmpty());

        if(set.contains(2)){                 //Time complexity ---> O(1)
            System.out.println("Set contains 2");
        }
        if(set.contains(3)){
            System.out.println("Set Contains 3");
        }
    }
}
