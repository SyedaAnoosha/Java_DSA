package Stacks.Operations;

public class StackPractice {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Size: " + stack.size());
        System.out.println("Topmost: " + stack.peek());


    }
}
