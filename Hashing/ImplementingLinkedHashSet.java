package Hashing;
//Linked HashSet
//Ordered using DLL
import java.util.*;
public class ImplementingLinkedHashSet {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Kashmir");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengalru");
        cities.add("Delhi");

        System.out.println(cities);

        LinkedHashSet<String> citiess = new LinkedHashSet<>();
        citiess.add("Kashmir");
        citiess.add("Mumbai");
        citiess.add("Noida");
        citiess.add("Bengalru");
        citiess.add("Delhi");

        System.out.println(citiess);
    }
}
