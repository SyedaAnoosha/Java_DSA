package Stacks.Operations;

public class LinkedStack implements Stack {

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
}
