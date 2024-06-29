import java.util.*;
public class HeapImplementation {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        //Function to insert in Heap
        public void add(int data){
            arr.add(data);   //Add at last index
            int x = arr.size()-1;  // x is a child index
            int par = (x-1)/2;      // Parent index

            while(arr.get(x) < arr.get(par)){   //Swap   T.C ---> o(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x-1)/2;
            }
        }

        //Function to peek into a Heap or get the lowest element from heap
        public int peek(){
            return arr.get(0);
        }


        private void heapify(int i){   //Time complexity ----> o(log n)
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            if(minIdx != i){  //Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        //Function to remove an element from a heap
        public int remove(){
            int data = arr.get(0);

            //Step 1 - Swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //Step 2 - Delete last
            arr.remove(arr.size()-1);

            //Step 3 - Call heapify
            heapify(0);
            return data;
        }

        //Function to check if array is empty or not
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
