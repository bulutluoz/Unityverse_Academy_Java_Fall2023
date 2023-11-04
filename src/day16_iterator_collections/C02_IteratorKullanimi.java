package day16_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_IteratorKullanimi {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(6);
        sayilar.add(19);
        sayilar.add(15);
        sayilar.add(23);
        sayilar.add(24);

        System.out.println(sayilar); // [10, 6, 19, 15, 23, 24]

        Iterator iterator = sayilar.iterator();

        System.out.println(iterator.hasNext()); // true
        System.out.println(iterator.next());
        iterator.remove();

        System.out.println(sayilar); // [6, 19, 15, 23, 24]

        System.out.println(iterator.hasNext()); // true
        iterator.next();
        iterator.remove();

        System.out.println(iterator.hasNext()); // true
        iterator.next();

        System.out.println(iterator.hasNext()); // true
        iterator.next();

        System.out.println(iterator.hasNext()); // true
        iterator.next();

        System.out.println(iterator.hasNext()); // true
        iterator.next();
        iterator.remove();
        // iterator.remove(); // IllegalStateException

        System.out.println(sayilar); //[19, 15, 23]

        System.out.println(iterator.hasNext()); // false
        // iterator.next(); // NoSuchElementException

    }
}
