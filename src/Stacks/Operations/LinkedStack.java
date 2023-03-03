package Stacks.Operations;
import java.util.EmptyStackException;
public class LinkedStack implements Stack {
    private Node top;
    private int size;

    public Object peek() {
        if (size == 0) {
            throw new java.util.EmptyStackException();
        }
        return top.object;
    }

    public Object pop() {
        if (size == 0) {
            throw new java.util.EmptyStackException();
        }
        Object oldTop = top.object;
        top=top.next;
        --size;
        return oldTop;
    }

    public void push(Object obj) {
        top = new Node(obj,top);
        ++size;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0 ;
    }

    public Object peekSecondLast(){
        if (size == 0) {
            throw new java.util.EmptyStackException();
        }
        return top.next.object;
    }

    public void reverse() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Node start = top;
        Node back = null, forw;
        while(start!=null){
            forw=start.next;
            start.next=back;
            back=start;
            start=forw;
        }
        top=back;
    }
    public Object peekBottom(){
        Node cur = top ;
        while(cur.next!= null){
            cur = cur.next ;
        }
        return cur.object;
    }
    public String toString() {
        Node start = top;
        StringBuilder s = new StringBuilder("[");
        while(start!=null){
            s.append(start.object);
            if( start.next != null ){
                s.append(", ");
            }
            start=start.next;
        }
        s.append("]");
        return s.toString();
    }
    public ArrayStack toArrayStack(){
        ArrayStack stack = new ArrayStack(size);
        Node head = top;
        while(head != null ){
            stack.push(head.object);
            head = head.next;
        }
        return stack;
    }
    public boolean equals(LinkedStack stack) {
        Node a = this.top, b = stack.top;
        if(this.size != stack.size){
            return false;
        }
        while(top!=null){
            if(a.object!=b.object){
                return false;
            }
            top = top.next;
        }
        return true;
    }
    private static class Node {
        Object object;
        Node next;
        public Node(Object object) {
            this.object = object;
            this.next = null;
        }
        public Node(Object object, Node next) {
            this.object = object;
            this.next = next;
        }
    }
}
