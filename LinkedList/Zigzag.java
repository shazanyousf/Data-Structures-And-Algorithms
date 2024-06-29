public class Zigzag {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

public static Node head;
public static Node tail;

 public void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}

public void zigZag(){
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;
    while(left != null && right != null){
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;
        left = nextL;
        right = nextR;
    }
}

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
    Zigzag ll = new Zigzag();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.Print();
        ll.zigZag();
        ll.Print();
    }
}
