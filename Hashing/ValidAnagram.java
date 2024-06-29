package Hashing;
//Given two strings s & t, return true if it is an anagram of s, and false otherwise. 
//An anagram is a word or phrase formed be rearranging the letters of a different word or phrase, typically using all the 
//original letters exactly once.
//String s = "race";  true
//String t = "care"
import java.util.*;         //Time complexity---->O(n)
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch)-1);
                }
            }
                else{
                    return false;
                }
            }
            return map.isEmpty();
        
    }
}
