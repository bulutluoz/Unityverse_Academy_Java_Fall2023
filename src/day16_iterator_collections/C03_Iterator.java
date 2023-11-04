package day16_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

    public static void main(String[] args) {

        // verilen bir listede, index kullanmadan
        // cift sayilari silin

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(6);
        sayilar.add(19);
        sayilar.add(15);
        sayilar.add(23);
        sayilar.add(24);

        System.out.println(sayilar); // [10, 6, 19, 15, 23, 24]

        Iterator iterator = sayilar.iterator();


        while (iterator.hasNext()){

            // iterator.next() her kullanildiginda, iterator bir saga gecer
            // loop icerisinde eleman atlamamak icin
            // iterator.next() sadece bir kere kullanilmalidir

            Integer sayi = (Integer) iterator.next();

            if (sayi % 2 == 0){
                iterator.remove();
            }
        }

        System.out.println(sayilar); // [19, 15, 23]

        // listeyi yeniden gozden gecirin ve 20'den buyuk olanlari silin
        // iterator ile calisirken, iterotor'i en son nerede biraktigimiza dikkat etmemiz gerekir
        // ornegin bu soruda yukaridaki loop'dan dolayi iterator sona gitti
        // eger yeniden iterator kullanip elemanlari gozden gecirmek istersek
        // yeni bir iterator olusturmaliyiz

        Iterator iterator1 = sayilar.iterator();

        while (iterator1.hasNext()){

            // bir yana gec ve uzerinden gectigin elementi bana getir
            Integer sayi = (Integer) iterator1.next();
            if (sayi>20){
                iterator1.remove();
            }
        }

        System.out.println(sayilar); // [19, 15]

    }
}
