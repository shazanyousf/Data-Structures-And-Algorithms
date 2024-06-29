package Hashing;
//Iteration on HashSet
// *1 Using Iterators
// *2 Using enhanced for loop
import java.util.*;
public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Kashmir");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengalru");
        cities.add("Delhi");

        Iterator it = cities.iterator();        //*1 
        while(it.hasNext()){
            System.out.println(it.next());
        }

         System.out.println();

        for(String city: cities){               //*2 
            System.out.println(city);
        }
    }   
}
