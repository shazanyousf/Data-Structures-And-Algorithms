package Tries;
import java.util.*;
//Prefix Problem -> Find shortest unique prefix for every word in a given list. Assume no word is prefix of another

//This Question was asked in Google and Microsoft company

public class PrefixProblem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;
        
        public Node() {
            for(int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    
    static Node root = new Node();


    //Insert Function --- time complexity --> O(L)
    public static void insert(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int index = word.charAt(level) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            else{
                curr.children[index].freq++;
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    //Function for Printing the words with given prefix  -- time complexity ---> O(L)
    public static void findPrefix(Node root, String ans){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return; 
        }
        for(int i = 0; i < 26; i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], ans + (char)(i + 'a'));
            }
        }
    }
    
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }
        root.freq = -1; 
        findPrefix(root, "");
    }
}
