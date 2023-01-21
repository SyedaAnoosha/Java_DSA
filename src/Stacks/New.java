package Stacks;
import java.util.*;
interface Stack{
    public Object peek();
    public Object pop();
    public Object  push(Object obj);
    public Object size();
    public boolean isEmpty();


}

class ArrayStack implements Stack{
    ArrayStack stack=new ArrayStack();
    private int size;
    Object a[]=new Object[3];

    public void reverse(){
        Object temp[]=a;
        int count =0;
        for(int i=temp.length;i>=0;i--){
            a[count++]=temp[i];
        }
    }

    public void convertToString(){
        String stack="[";
        int i=0;
        while(a[i]!=null) {
            if (i == a.length) {
                stack += (String) a[i] + " ";
                break;
            }
            stack += (String) a[i] + " ";
            i++;
        }
        stack +="]";
    }



    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isSameStack(ArrayStack stack2)
    {
        if(this.size==stack2.size) {
            {

            }
        }

        return true;
    }


    @Override
    public Object pop() {
        if (size==0){
            System.out.println("Illegal stack exception!");
        }
        Object obj=a[--size];
        a[size]=null;
        return obj;
    }
    public Object popFromLast(){
        Object obj=a[0];
        a[0]=null;
        for(int i=0;i<size-1;i++){
            a[i]=a[i+1];
            size--;

        }
        return obj;
    }
    public void peekTheLast(){

        System.out.println("Last elements is: "+ a[0]
        );
    }

    public void popLast() {
        for (int i = 0; i < a.length; i++) {

            if (a[i] ==a[size-1]) {




            }
        }
    }
    private void resize(){
        Object[] aa=a;
        a=new Object[2*aa.length];
        System.arraycopy(aa,0,a,0,size);
        //assert size == elements.length;
        //Object[] a = new Object[2*size];
        //System.arraycopy(elements, 0, a, 0, size);
        //elements = (E[])a;
    }

    @Override
    public Object peek() {
        if(size==0){
            throw new EmptyStackException();
        }
        return a[size-1];
    }

    @Override
    public Object push(Object obj) {
        if(size==a.length) {
            resize();
        }
        a[size++]=obj;
        return 0;
    }


    @Override
    public Object size() {

        System.out.println(size);
        return size;
    }


}


public class New {
    public static void main(String[] args){
        ArrayStack a=new ArrayStack();
        ArrayStack b=new ArrayStack();
        b.push("uyt");




        ///CHECKING WHETHER 2 STACKS ARE EQUAL OR NOT
        ArrayStack stack1=new ArrayStack();
        stack1.push("physics");

        ArrayStack stack2=new ArrayStack();
        stack2.push("physics");
        stack2.push("computer");
        stack2.push("biology");
        stack2.push("anatomy");
        System.out.println(stack1.equals(stack2));
        stack2.convertToString();
        stack2.reverse();
        stack2.convertToString();


    }
}
