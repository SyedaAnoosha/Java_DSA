package LinkedLists.Exercises;

// LL containing int 2 to 100 ( even only or with space of 2 ) and traverse it to check if there exists 50 elements
public class Test1 {
    public static void main(String[] args) {
        Node1 start = new Node1(2);
        Node1 p = start ;

        for (int i = 3; i <=100 ; i++) {
            if (i % 2 == 0) {
                p.next= new Node1(i);
                p=p.next;
            }
        }

        int count = 0;
        for(Node1 node = start; node != null ; node = node.next){
            count++;
            if(count == 50){
                System.out.println("There exists 50 elements");
            }
        }

    }
}
