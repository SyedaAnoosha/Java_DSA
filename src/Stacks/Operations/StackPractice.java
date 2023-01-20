package Stacks.Operations;

import java.util.Arrays;

public class StackPractice {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println();
        stack.popBottom();
        System.out.println(stack);
      /*System.out.println("Size: " + stack.size());
        System.out.println("Topmost: " + stack.peek());
        System.out.println("Pop: "+ stack.pop());
        stack.popSecondLast();
        System.out.println(stack);
        System.out.println(stack.peekSecondLast());

        System.out.println();
        ArrayStack stack2 = new ArrayStack(5);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.reverse();
        System.out.println(stack2);
        System.out.println(stack.equals(stack2));*/
    }
}
