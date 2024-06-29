import java.util.*;
public class ImplementQueueUsingDeque {
    static class Queue{
        Deque<Integer> deq = new LinkedList<>();
        public void add(int data){
            deq.addLast(data);
        }
        public int remove(){
            return deq.removeFirst();
        }
        public int peek(){
            return deq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
