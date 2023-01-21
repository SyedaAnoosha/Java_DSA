package Stacks.Operations;

import java.util.Arrays;

public class StackPractice {
    public static void main(String[] args) {
/*
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println();
        stack.reverse();
        //stack.popBottom();
        System.out.println(stack);
      */

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


        ArrayStack first = new ArrayStack(4);
        first.push("Applied Calculus");
        first.push("Applied Physics");
        first.push("Programming Fundamentals");
        first.push("Functional English");
        System.out.println(first);
        System.out.println();

        ArrayStack second = new ArrayStack(4);
        second.push("Object Oriented Programming");
        second.push("Pakistan Studies");
        second.push("Islamic Studies");
        second.push("Professional Practices");
        System.out.println(second);
        System.out.println();

        ArrayStack third = new ArrayStack(4);
        third.push("Data Structures");
        third.push("Database Management");
        third.push("Operation Research");
        third.push("Software Management");
        System.out.println(third);
        System.out.println();

        ArrayStack books = new ArrayStack(12);
        books.push(first);
        books.push(second);
        books.push(third);
        System.out.println(books);
    }
}
