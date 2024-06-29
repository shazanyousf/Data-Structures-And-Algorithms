import java.util.*;
import java.util.PriorityQueue;
public class First {
    //Priority Queue for objects
    static class Student implements Comparable<Student>{   //Overriding
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    //Priority Queue in Java Collections FrameWork
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq =  new PriorityQueue<>(Comparator.reverseOrder()); //Write Comparator.reverseOrder to set priority in descending order
        // pq.add(3);  //o(logn)
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);

        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek());  //o(1)
        //     pq.remove();  //0(logn)
        // }

        PriorityQueue<Student> pq = new PriorityQueue<>();  //Comparator.reverseOrder
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}