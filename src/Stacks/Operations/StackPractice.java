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

//        System.out.println(stack.search(6));
//        System.out.println(stack.search(3));

        /*

        System.out.println(stack);
        System.out.println();
        stack.reverse();
        //stack.popBottom();
        System.out.println(stack);

        System.out.println("Size: " + stack.size());
        System.out.println("Topmost: " + stack.peek());
        System.out.println("Pop: "+ stack.pop());
        stack.popSecondLast();
        System.out.println(stack);
        System.out.println(stack.peekSecondLast());

        System.out.println();
        ArrayStack stack2 = new ArrayStack(5);
        stack2.push(6);
        stack2.push(7);
        stack2.push(8);
        stack2.push(9);
        stack2.push(10);
        stack2.reverse();
        System.out.println(stack2);
        System.out.println(stack.equals(stack2));

        ArrayStack arrayStack = new ArrayStack(stack2.size()+stack.size());
        System.out.println(arrayStack.merge(stack,stack2));


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

        ArrayStack allSemester = new ArrayStack(12);

        while(!first.isEmpty()){
            allSemester.push(first.popBottom());
        }
        while(!second.isEmpty()){
            allSemester.push(second.popBottom());
        }
        while(!third.isEmpty()){
            allSemester.push(third.popBottom());
        }
        System.out.println(allSemester);*/

    }
}
