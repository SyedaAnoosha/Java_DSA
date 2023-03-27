package Queue.LinkedQueue;

public class LinkedQueuePractice {
    public static void main(String[] args) {
        LinkedQueue L = new LinkedQueue();
        L.add("first");
        L.add("second");
        L.add("third");
        L.add("fourth");
        L.add("fifth");

        System.out.println(L.first());
        System.out.println(L.peekSecondLast());
        System.out.println(L.peekSecond());
    }
}
