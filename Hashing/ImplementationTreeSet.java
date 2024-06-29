package Hashing;
//Tree Set
//Sorted In Ascending Order
//Null Values are not allowed
import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ImplementationTreeSet {
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

        TreeSet<String> citiesss = new TreeSet<>();
        citiesss.add("Kashmir");
        citiesss.add("Mumbai");
        citiesss.add("Noida");
        citiesss.add("Bengalru");
        citiesss.add("Delhi");

        System.out.println(citiesss);
    }
}
