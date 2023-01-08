package LinkedLists.Exercises;
class Node{
    int data=0;
    Node next;
    public Node(int data) {
        this.data=data;
    }
}
public class Test2{
    public static void main(String[] args) {
        Node head = new Node(15);
        Node current= head;
        current.next = new Node(16);
        current= current.next;
        current.next= new Node(17);
        current=current.next;

        for( int i = 0 ; i <3; i++) {
            current.next= new Node(head.data);
            current= current.next;
            current.next= new Node(head.next.data);
            current= current.next;
            current.next= new Node(head.next.next.data);
            current= current.next;

        }

        current=head;

        for(int i = 0 ; i<9;i++) {
            System.out.println(current.data);
            current=current.next;
        }
    }
}