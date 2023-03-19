package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class sw19q2b {
    public static void main(String[] args) {
        Collection<String> col = new LinkedList<>();

        col.add("Alex");
        col.add("Salar");
        col.add("Aliyan");

        Iterator<String> iterator = col.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        Collection<String> arr = new ArrayList<>();

        arr.add("Saim");
        arr.add("Imama");
        arr.add("Aisha");

        Iterator<String> iterator1 = arr.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(1);
        num.add(1);

        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }

        Iterator<String> iterator2 = arr.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
