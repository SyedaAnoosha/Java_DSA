package Stacks.LinkedStack;
public class LinkedStackPractice {
    public static void main(String[] args) {
        LinkedStack L = new LinkedStack();
        L.push("red");
        L.push("blue");
        L.push("yellow");
        L.push("green");
        L.push("black");
        System.out.println(L);

//        L.reverse();
//        System.out.println(L);

        LinkedStack L1 = new LinkedStack();
        L1.push("red");
        L1.push("blue");
        L1.push("yellow");
        L1.push("green");
        L1.push("white");
        System.out.println(L1);

        System.out.println(L1.equals(L));


//        System.out.println("isEmpty: "+L.isEmpty());
//        System.out.println("Peek: "+L.peek());
//        System.out.println("Size: "+L.size());
//        System.out.println("Pop: "+L.pop());
//        System.out.println(L);
//        System.out.println("Peek: "+L.peek());
//        System.out.println("Size: "+L.size());
//        System.out.println("Second last element: "+L.peekSecondLast());
//        System.out.println("Bottom element: "+L.peekBottom());
//        System.out.println(L);
//        System.out.println(L.toArrayStack().toString());
    }
}
