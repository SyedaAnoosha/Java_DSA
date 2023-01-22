package LinkedLists.Papers;

class LinkedList{
    node head;
    public void insertFirst(String data){
        node start = new node(data);
        if( head == null ){
            head = start;
            return;
        }
        start.next=head;
        head=start;

    }
    public void insertAtPosition( String data, int pos){
        node newNode = new node(data);
        if(pos == 0){
            insertFirst(data);
        }
        node prev = head;
        for(int i = 0 ; i<pos-1 ; i++){
            prev=prev.next;
        }

        newNode.next=prev.next;
        prev.next=newNode;
    }
    public void traverse(){

        node start = head;
         while( start!= null){
             System.out.println(start.data);
             start = start.next;
         }
    }
    public String search(String key){
        String search = "not found";
        node start = head;
        while( start!= null){
            if(start.data.equalsIgnoreCase(key)){
                search="found";
                return search;
            }
            start = start.next;
        }
        return search;
    }

}
public class sw18q2b {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertFirst("biscuits");
        l1.insertFirst("patties");
        l1.insertFirst("samosa");
        l1.insertFirst("sandwich");
        l1.insertFirst("cakes");
        l1.insertFirst("breads");

        LinkedList l2 = new LinkedList();
        l2.insertFirst("pepsi");
        l2.insertFirst("juice");
        l2.insertFirst("water");
        l2.insertFirst("coffee");
        l2.insertFirst("milk");
        l2.insertFirst("icecream");
        l2.insertFirst("yogurt");

        System.out.println(l1.search("samosa"));
        System.out.println(l2.search("tea"));
    }
}
