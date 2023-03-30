package Queue.LinkedQueue;

import Queue.Queue;

import java.util.EmptyStackException;
import java.util.Iterator;

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
        if (head.prev == null) {
            head.next = new Node(obj, head, head);
            head.prev = head.next;
        } else {
            head.prev.next = new Node(obj, head, head.prev);
            head.prev = head.prev.next;
        }
        ++size;

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
        head.next = head.next.next;
        head.next.prev = head;
        --size;
        return temp;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public int size() {
        return size;
    }
    public String toString(){
        StringBuilder b = new StringBuilder("{");
        Node start = head.next;
        while(start != head){
            if(start.next == head){
                b.append(start.object);
                break;
            }
            b.append(start.object).append(", ");
            start = start.next;
        }
        return b+"}";
    }

    public Object[] toArray(){
        Object[] arr = new Object[size];
        int i = 0;
        Node start = head.next;
        while(start != head){
            arr[i] = start.object;
            start = start.next;
            i++;
        }
        return arr;
    }

    public void reverse() {
        Node current = head;
        Node temp = null;
        while (current != head) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        head = temp;

    }

    public Object getMiddle() {
        Node slow = head.next;
        Node fast = head.next;
        while (fast != head && fast.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.object;
    }
}