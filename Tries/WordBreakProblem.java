package Tries;
import java.util.*;

//Given an output string and a dictionary of words, find out if the input string can be broken into a space-separated sequence
//of dictionary words.

//This question was asked in GOOGLE interviews
public class WordBreakProblem {
    static class Node{
        Node children [] = new Node[26];
        boolean eow = false;

       public Node(){
            for(int i = 0; i  < 26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    //Function to Insert --- Time complexity ---> O(L)

    public static void insert(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int index = word.charAt(level)-'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }


    //Function to Search --- Time Complexity ---> 0(L)

    public static boolean search(String key){
        Node curr = root;
        for(int level = 0; level < key.length(); level++){
            int index = key.charAt(level)-'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return curr.eow == true;
    }

    //Word Break Problem Function --- Time complexity ---> 0(L)

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i = 1; i <= key.length(); i++){
            //Substring(beginning index, last index)
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i = 0; i<arr.length; i++){
            insert(arr[i]);
        }
        String key = "ilikesamsung";

        System.out.println(wordBreak(key));
    }
}
