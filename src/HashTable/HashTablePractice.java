package HashTable;

public class HashTablePractice {
    public static void main(String[] args) {
        HashTable HT = new HashTable(5);
        HT.put(1,"One");
        HT.put(2,"two");
        HT.put(3,"Three");
        HT.put(4,"F");
        HT.put(5,"f");
        HT.put(6,"s");

        System.out.println(HT.get(1));
        System.out.println(HT.get(6));
        HT.put(6,"new");
        System.out.println(HT.get(6));
    }
}
