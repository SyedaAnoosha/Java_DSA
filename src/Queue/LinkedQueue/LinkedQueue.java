package Queue.LinkedQueue;

import java.util.EmptyStackException;
public class LinkedQueue implements Queue {
    private Node head = new Node(null);
    //head.next = first node;
    //head.prev = last node;
    private int size;
    private static class Node{
        Object object;
        Node prev = null, next=null;

        public Node(Object object) {
            this.object = object;
        }

        public Node(Object object, Node next, Node prev) {
            this.object = object;
            this.next = next;
            this.prev = prev;
        }
    }
    public void add(Object obj) {
        head.prev.next = new Node(obj, head, head.prev);
        head.prev = head.prev.next;
        ++size;

//        Node newNode = new Node(obj);
//        newNode.next=head;
//        newNode.prev=head.prev;
//        head.prev.next=newNode;
//        head.prev=head.prev.next;
//        ++size;

    }

    public Object first() {
        // similar to peek
        if (size == 0) {
            throw new EmptyStackException();
        }
        return head.next.object;
    }

    public Object peekSecondLast(){
        if (size == 0) {
            throw new EmptyStackException();
        }
        return head.prev.prev.object;
    }

    public Object peekSecond(){
        if (size == 0) {
            throw new EmptyStackException();
        }
        return head.next.next.object;
    }

    public Object peekLast(){
        if (size == 0) {
            throw new EmptyStackException();
        }
        return head.prev.object;
    }
    public Object remove() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object temp = head.next.object;
        head.next=head.next.next;
        head.next.prev=head;
        --size;
        return temp;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public int size() {
        return size;
    }
}