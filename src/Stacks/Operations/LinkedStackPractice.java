package Stacks.Operations;

public class LinkedStackPractice {
    public static void main(String[] args) {
        LinkedStack L = new LinkedStack();
        L.push("red");
        L.push("blue");
        L.push("yellow");
        L.push("green");
        System.out.println(L);
        System.out.println(L.isEmpty());
        System.out.println(L.peek());
        System.out.println(L.size());
        System.out.println(L.pop());
        System.out.println(L.peek());
        System.out.println(L.size());
        System.out.println(L);
    }
}
