package HashTable;

public class HT {
    private int numberOfBuckets;
    private int size;
    private HashNode[] buckets;

    private static class HashNode{
        Integer key;
        String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HT(int cap){
        this.numberOfBuckets = cap;
        buckets = new HashNode[cap];
        this.size=0;
    }
    public HT(){
        this(64);
    }

    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void put(Integer key, String value){
        if(key == null || value == null) System.out.println("Value or key is null");
        if((double) size / numberOfBuckets > 0.75){
            rehash();
        }
        int bucketIndex = hash(key);
        HashNode head = buckets[bucketIndex];
        int i =0;
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
            }
            bucketIndex=(bucketIndex+1)%numberOfBuckets;
            head = head.next;
        }
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex]=node;
        size++;
    }

    private void rehash() {

    }

    public int hash(Integer key){
        return (Math.abs(key.hashCode())) % buckets.length;
    }

}
