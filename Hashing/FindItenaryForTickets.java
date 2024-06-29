package Hashing;
//Find Itenary for tickets
import java.util.*;
public class FindItenaryForTickets {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        
        tickets.put("Chennai", "Bengalaru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStrart(tickets);
        System.out.print(start);

        for(String key : tickets.keySet()){
            System.out.print("-->" + tickets.get(start));
            start = tickets.get(start);
        }
        //System.out.println();
    }

    //GetStart Function
    public static String getStrart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;  //Starting point
            }
        }

        return null;   

    }
}
