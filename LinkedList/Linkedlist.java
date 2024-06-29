import java.util.*;
public class Linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            //this.data = null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
 


    //I have created this linked list from Scratch

    // Function to add INSERT an element in linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        size++;
        if (this.head == null) {
            // linked list is empty
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }


    // Function to ADD element in linked list at first

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


     // Function to add ADD element in linked list at LAST
    
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Function to add ADD element in linked list at MIDDLE
    public void addM(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //Function to remove FIRST element in a LinkedList
    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


     //Function to remove LAST element in a LinkedList
    public int removeLast(){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Write a function for ITERATIVE search in a linked list
    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }



    //Write a function for RECURSIVE search in a linked list
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
    return helper(head, key);
    }



//Write a function to REVERSE  a linked list
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    //Function to find and remove nth node from end - iterative approach
    //Question is asked in companies like AMAZON, QUALCOM, ADOBE, FLIPKART and manymore
    public void deleteNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == size){
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //Function to check if a Linked list is PALINDROME or not
    public Node findMid(Node head){ // Helper Function
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //Function to PRINT LinkedList
    public void Print(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return ;
        }
        Node temp = head;
        while (temp != null ) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insert(3);
        ll.insert(4);
        ll.insert(6);
        ll.insert(7);
        ll.addM(2, 5);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(8);
        ll.addLast(9);
        ll.removeFirst();
        ll.removeLast();
        ll.Print();
        System.out.println("Key is at Index : "+ll.iterativeSearch(4));
        System.out.println("Key is at Index : "+ll.recursiveSearch(4));
        System.out.println("Size of Linked List is:"+ll.size);
        ll.reverse();
        ll.deleteNthFromEnd(3);
        ll.Print();
        System.out.println(ll.checkPalindrome());
        
    }


    // public Linkedlist.Node mergeSort(Linkedlist.Node head2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'mergeSort'");
    // }
}
