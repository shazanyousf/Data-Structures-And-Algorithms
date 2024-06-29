import java.util.*;
public class Inbuiltll {
    public static void main(String[] args) {
        // Creating a inbuilt linkedlist
        LinkedList <Integer> ll = new LinkedList<>();
        // To add element
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        System.out.println();
        //To remove element
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
