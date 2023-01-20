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
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < size-1; i++) {
            s.append(a[i]).append(", ");
        }
        s.append(a[size-1] +"]");
        System.out.println(s);
        return "";
    }

    public Object popFromLast(){
        Object obj = a[0];
        a[0] = null;
        for (int i = 0; i < size-1; i++) {
            a[i]=a[i+1];
        }
        size--;
        return obj;
    }

    public Object pop() {
        if (size==0){
            throw new EmptyStackException();
        }
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
