package Hashing;
//Given an Integer array of size "n", find all elelments that appear more than [n/3] times.
//arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

//Time complexity ---> O(n)
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            // if(map.containsKey(arr[i])){                  
            //     map.put(arr[i], map.get(arr[i])+1);    // we can use the single line code of line number 21 instead of 14 - 19 line number
            // }
            // else{
            //     map.put(arr[i], 1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);  //Tried to better optimise this code 
        }

        //Set<Integer> keySet = map.keySet();

        for(Integer key: map.keySet()){    
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
}
