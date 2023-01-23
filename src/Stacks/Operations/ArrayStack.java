package Stacks.Operations;
import java.util.*;

public class ArrayStack implements Stack{
    private int size = 0;
    private Object[] a;

    public ArrayStack(int cap){
        a = new Object[cap];
    }

    public void push(Object obj) {

        //overflow
        if (size == a.length) {
            resize();
        }
        a[size++] = obj;
    }

    public Object pop() {

        //underflow
        if (size==0){
            throw new EmptyStackException();
        }

        Object obj = a[--size];
        a[size] = null;
        return obj;
    }

    public Object peek() {
        if(size == 0){
            throw new EmptyStackException();
        }
        return a[size-1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean search( Object obj){
        if(size == 0 ){
            throw new EmptyStackException();
        }
        for (int i = 0; i < this.a.length; i++) {
            if(obj==a[i]){
                return true;
            }
        }
        return false;
    }

    public String toString() {

        StringBuilder s = new StringBuilder("[");
        int i =0;
        while(i<size){
            if( i == size-1 ){
                s.append(a[i]);
                break;
            }
            s.append(a[i]).append(", ");
            i++;
        }
        s.append("]");
        return s.toString();

    }

    public Object peekMiddle() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return a[size/2];
    }

    public Object peekBottom() {
        if (size == 0) {
             throw new EmptyStackException();
        }
        return a[0];
    }

    public Object peekSecondLast() {
        if (size < 2) {
            throw new NoSuchElementException();
        }
        return a[size - 2];
    }

    public Object popMiddle(){
//
//        if (size == 0) {
//            throw new EmptyStackException();
//        }
        Object mid = a[size/2];
        a[size/2]=null;

        for (int i = size / 2 ; i < size-1 ; i++ ) {
            a[i]=a[i+1];
        }
        size--;
        return mid;
    }

    public Object popBottom(){

        if (size == 0) {
            throw new java.util.EmptyStackException();
        }

        Object obj = a[0];
        a[0] = null;
        for (int i = 0; i < size-1; i++) {
            a[i]=a[i+1];
        }
        size--;
        return obj;

    }

    public Object popSecondLast(){

        if(size<2){
            throw new NoSuchElementException();
        }

        Object obj = a[size-2];
        a[size-2] = a[size-1];
        a[size-1] = null;
        size--;
        return obj;

    }

    private void resize(){
        Object[] newArr = a;
        a = new Object[ 2 * newArr.length];
        System.arraycopy(newArr,0, a,0, size);
    }

    public boolean equals(ArrayStack stack){
        if(this.size != stack.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if(this.a[i] != stack.a[i]){
                return false;
            }
        }
        return true;
    }

    public void reverse() {

        if (size == 0) {
            throw new EmptyStackException();
        }

        for (int i = 0, j = size-1; i < size/2 ; i++, j--) {
            Object temp = this.a[i];
            this.a[i] = this.a[j];
            this.a[j] = temp ;
        }

    }
    public void merge(ArrayStack A){

        while (!this.isEmpty()){
            A.push(this.popBottom());
        }
    }

    public ArrayStack merge( ArrayStack A, ArrayStack B){
        ArrayStack C = new ArrayStack(A.size() + B.size());
        while(!A.isEmpty()){
            C.push(A.popBottom());
        }
        while(!B.isEmpty()){
            C.push(B.popBottom());
        }
        return C;
    }

}
