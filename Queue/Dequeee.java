import java.util.*;
public class Dequeee{
    public static void main(String[] args) {
        Deque<Integer> deq = new LinkedList<>();
        deq.addFirst(1);
        deq.addFirst(2);
        System.out.println(deq);
        deq.removeFirst();
        System.out.println(deq);
        deq.addLast(3);
        deq.addLast(4);
        System.out.println(deq);
        System.out.println("First Element is"+ deq.getFirst());
        System.out.println("First Element is"+ deq.getLast());
    }
}