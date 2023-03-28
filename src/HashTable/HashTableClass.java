package HashTable;

public class HashTableClass {
    private Entry[] entries;
    private int size, used;
    private float loadFactor;
    private final Entry NIL = new Entry(null, null);

    private static class Entry{
        Object key, value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
    public HashTableClass(int capacity, float loadFactor){
        entries = new Entry[capacity];
        this.loadFactor = loadFactor;
    }
    public HashTableClass(int cap){
        this(cap,0.75F);
    }
    public HashTableClass(){
        this(64);
    }

    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return  size == 0;
    }

    public Object get(Object key){
        int h = hash(key);
        for (int i = 0; i < entries.length; i++) {
            int j = nextProbe(h,i);
            Entry entry = entries[j];
            if (entry == null) break;
            if( entry == NIL) continue;
            if( entry.key.equals(key)) return entry.value;
        }
        return null;
    }

    public Object put(Object key, Object value) {
        if (used > loadFactor * entries.length) rehash();
        int h = hash(key);
        for (int i=0; i< entries.length; i++) {
            int j = nextProbe(h, i);
            Entry entry = entries[j];
            if (entry == null) {
                entries[j] = new Entry(key, value);
                ++used;
                ++size;
                return null;
            }
            if (entry == NIL) continue;
            if (entry.key.equals(key)) {
                Object oldValue = entry.value;
                entries[j].value = value;
                return oldValue; // update success
            }
        }
        return null;
    }

    public Object remove(Object key){

        int h = hash(key);
        for (int i=0; i< entries.length; i++) {
            int j = nextProbe(h, i);
            Entry entry = entries[j];
            if (entry == null) break;
            if (entry == NIL) continue;
            if (entry.key.equals(key)) {
                Object oldValue = entry.value;
                entries[j] = NIL;
                --size;
                return oldValue; // update success
            }
        }
        return null;
    }

    public void rehash(){
        Entry[] oldEntries = entries;
        entries = new Entry[oldEntries.length * 2];
        for (int k = 0; k < oldEntries.length; k++) {
            Entry entry = oldEntries[k];
            if(entry == null || entry == NIL) continue;
            int h = hash(entry.key);
            for (int i = 0; i < entries.length; i++) {
                int j = nextProbe(h,i);
                if(entries[j] == null){
                    entries[j] = entry;
                    break;
                }
            }
        }
        used = size;
    }

    private int nextProbe(int h, int i) {
        return (h + i) % entries.length; //linear
        //return (h + i*i) % entries.length; // quadratic
    }
    public int hash(Object key){
        return (Math.abs(key.hashCode())) % entries.length;
    }

}
