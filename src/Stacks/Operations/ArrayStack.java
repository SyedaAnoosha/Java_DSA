package Stacks.Operations;

import java.util.EmptyStackException;

public class ArrayStack implements Stack{
    private int size = 0;

    private Object a[];

    public ArrayStack(int cap){
        a = new Object[cap];
    }

    public Object peek() {
        if(size == 0){
            throw new EmptyStackException();
        }
        return a[size-1];
    }

    public Object pop() {
        Object obj = a[--size];
        a[size] = null;
        return obj;
    }

    public void push(Object obj) {
        if (size == a.length) {
            resize();
        }
        a[size++] = obj;
    }

    private void resize(){
        Object[] newArr = a;
        a = new Object[ 2 * newArr.length];
        System.arraycopy(newArr,0, a,0, size);
    }
    public Object size() {
        return size;
    }

    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }
}
