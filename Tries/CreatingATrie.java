package Tries;
//Creating a trie
import java.util.*;
public class CreatingATrie {
    static class Node{
        Node children [] = new Node[26];
        boolean eow = false;

        Node(){
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


    //Function to Search --- Time Complexity ---> 0(l)

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
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("there"));
        System.out.println(search("thor"));
    }
    
}