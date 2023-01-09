package LinkedLists.Operations;
public class node {
    int data;
    node next;
    public node(){}
    public node(int data) {
        this.data = data;
    }
    public static void traverse(node head){
        for( node start= head ; start != null ; start=start.next){
            System.out.println(start.data);
        }
    }

    public static int Sum( node start ){
        int sum = 0 ;
        for( node p = start ; p != null ; p = p .next){
            sum+=p.data;
        }
        return sum;
    }
    public static int size(node start) {
        node temp = start;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static float Average( node start ) {
        float avg = 0;
        int sum = Sum(start);
        int size = size(start);
        avg = (float) sum / size;
        return avg;
    }
    public static node insert_at_First( int data , node start ){
        node add= new node(data);
        if( start ==  null ){
            start = add;
            return start;
        }
        add.next=start;
        start=add;
        return start;
    }

    public static void insert (int data , node head , int pos ){

        node addTo = new node(data);
        if(pos==0){
            addTo.next=head;
            head=addTo;
        }
        node prev = head;
        for (int i = 0; i < pos-1; i++) {
            prev=prev.next;
        }
        addTo.next=prev.next;
        prev.next=addTo;
    }
    public static int findMiddleElement(node head) {
        node p = head;
        node q = head;

        while (q != null && q.next != null) {
            p = p.next; 
            q= q.next.next; 
        }

        return p.data;
    }

    public static node reverse(node node) {
        node prev = null;
        node current = node;
        node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static void insert_at_last (int data , node head  ){

        node addTo = new node(data);
        if(head==null){
            addTo.next=head;
            head=addTo;
            return;
        }
        node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=addTo;
    }
    public static void delete(node start , int pos){
        if(pos==0){
            start= start.next;
            return;
        }
        if(start.next==null){
            start=null;
            return;
        }
        node prev= start;
        for (int i = 0; i < pos-1; i++) {
            prev= prev.next;
        }
        prev.next=prev.next.next;
    }
    public static node copy( node head ){
        node p = head ;
        node q = new node(p.data);
        node temp = q;
        p = p.next;
        while( p!= null) {
            temp.next = new node(p.data);
            p = p.next;
            temp= temp.next;
        }
        return q;
    }
    public static int findLastElement( node start ){
        node cur = start ;
        while(cur != null){
            cur = cur.next ;
        }
        return cur.data;
    }
    public static int findMaxElement( node start ){
        int max = start.data;
        for (node p = start.next ; p != null ; p = p.next){
            if(p.data > max){
                max = p.data;
            }
        }
        return max;
    }
    public static int findMinElement( node start ){
        int min = start.data;
        for (node p = start.next ; p != null ; p = p.next){
            if(p.data< min){
                min = p.data;
            }
        }
        return min;
    }
    public static node replace( node list, int pos, int num ){
        int counter = 0;
        node p = list;
        while (p.next!=null) {
            if (counter == pos) {
                p.data = num;
                break;
            }
            p = p.next;
            counter++;
        }
        return list;
    }
    public static void main(String[] args) {

//        node n1 = new node(5);
//        node start = n1;
//        node n2 = new node(2);
//        start.next=n2;
//        node n3 = new node(3);
//        n2.next=n3;
//        node n4 = new node(4);
//        n3.next=n4;
//        node n5 = new node(10);
//        n4.next=n5;
//        node n6 = new node(6);
//        n5.next=n6;
//        node n7 = new node(7);
//        n6.next=n7;
//        node n8 = new node(8);
//        n7.next=n8;
//        node n9 = new node(9);
//        n8.next=n9;


//        traverse(start);
//        System.out.println();
//
//        node first = insert_at_First(7,start);
//        traverse(first);
//        System.out.println();
//
//        insert(4,start,1);
//        traverse(start);
//        System.out.println();
//
//        insert_at_last(4,start);
//        traverse(start);
//        System.out.println();
//
//        delete(start,1);
//        traverse(start);
//        System.out.println();
//
//        node copy = copy(start);
//        traverse(copy);
//        System.out.println();
//
//        System.out.println(findMiddleElement(start));
//        System.out.println();
//
//        node reverse = reverse(start);
//        traverse(reverse);
//        System.out.println();
//
//        replace(start,3,10);
//        traverse(start);
//        System.out.println();
//
//        System.out.println(findMinElement(start));
//        System.out.println();
//
//        System.out.println(findMaxElement(start));
//
//
//        node head = new node(11);
//        node cur = head;
//        cur.next = new node(22);
//        cur = cur.next;
//        cur.next = new node(33);
//        cur = cur.next;
//
//        for(int i = 0 ; i <  3 ; i++ ){
//            cur.next = new node(head.data) ;
//            cur = cur.next ;
//            cur.next = new node(head.next.data);
//            cur = cur.next ;
//            cur.next = new node(head.next.next.data);
//            cur = cur.next ;
//        }
//
//        traverse(head);

    }
}
