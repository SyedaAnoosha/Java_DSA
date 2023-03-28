package HashTable;

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;      // capacity
    private int size;             //  number of hash nodes in a hashtable
    private static class HashNode{
        private Integer key;       // can be generic
        private String val;        // can be generic
        private HashNode next;

        public HashNode(Integer key, String val){
            this.key = key;
            this.val = val;
        }      // end of constructor
    }   // end of class HashNode

    public HashTable(){
        this(10);         // default capacity
    }
    public HashTable(int cap){
        this.numOfBuckets = cap;
        buckets = new HashNode[cap];
        this.size = 0;
    }     // end of constructor

    public int size(){
        return size;
    }       // end of size()
    public boolean isEmpty(){
        return (size == 0);
    }     // end of isEmpty

    public void put(Integer key, String val){
        if (key == null || val == null){
            throw new IllegalArgumentException("Value or key is null");
        }
        if ((double) size / numOfBuckets > 0.75) {
            rehash();
        }



        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        // below is the code for linear probing
//        int i = 0;
//        while (head != null){
//            if (head.key.equals(key)){
//                head.val = val;
//                return;
//            }
//            i++;
//            bucketIndex = (bucketIndex + i) % numOfBuckets;
//        }

        while (head!=null){
            if (head.key.equals(key)){
                head.val = val;
                return;
            }
            head = head.next;
        }       // to check if key is already present or not
        head = buckets[bucketIndex];       // possibly head may have pointed to any other val during its iteration, so we moved it back to null (start)
        HashNode node = new HashNode(key, val);       // it first points to null
        node.next = head;                           //  we assign it to head
        buckets[bucketIndex] = node;
        size++;
    }     // end of put()

    public String get(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null){
            if (head.key.equals(key)){
                return head.val;
            }
            head = head.next;
        }     // end of while loop
        return null;
    }      // end of get()

    public String remove(Integer key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode prev = null;         // to keep track of prev hash node
        while (head != null){
            if (head.key.equals(key)){
                break;
            }
            prev = head;
            head = head.next;
        }     // end of while loop
        if (head == null){
            return null;
        }
        if (prev != null){
            prev.next = head.next; // a node is removed here
        } else {
            buckets[bucketIndex] = head.next;
        }
        size--;
        return head.val;
    }      // end of remove()
    public int getBucketIndex(Integer key){      // out hashFunction to calculate index
        return (Math.abs(key.hashCode())) % buckets.length;
    }

    private void rehash() {
        int newCapacity = numOfBuckets * 2;
        HashNode[] newBuckets = new HashNode[newCapacity];
        for (int i = 0; i < buckets.length; i++) {
            HashNode node = buckets[i];
            while (node != null) {
                HashNode next = node.next;
                int bucketIndex = (Math.abs(node.key.hashCode())) % newCapacity;
                node.next = newBuckets[bucketIndex];
                newBuckets[bucketIndex] = node;
                node = next;
            }
        }
        buckets = newBuckets;
        numOfBuckets = newCapacity;
    }

    public boolean containsKey(Integer key) {
        int bucket = getBucketIndex(key);
        HashNode head = buckets[bucket];
        while (head != null) {
            if (head.key.equals(key)) {
                System.out.println(head.val);
                return true;
            }
            head = head.next;
        }
        return false;
    }

}     // end of class HashTable