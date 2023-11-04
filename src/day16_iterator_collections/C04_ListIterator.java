package day16_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(6);
        sayilar.add(19);
        sayilar.add(15);
        sayilar.add(23);
        sayilar.add(24);

        System.out.println(sayilar); // [10, 6, 19, 15, 23, 24]

        // index kullanmadan tum elementlerin degerlerini 2 artirin

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()){

             Integer elementEskiDegeri = (Integer) lit.next();

             lit.set(elementEskiDegeri + 2);
        }

        System.out.println(sayilar); // [12, 8, 21, 17, 25, 26]



        // Listenin elementlerini, index kullanmadan
        // sondan basa dogru yazdirin

        // soruyu cozmeye baslamadan once iterator nerede ? dusunmeliyiz
        // bu satir itibariyle yukaridaki loop'dan dolayi iterator en sonda

        while (lit.hasPrevious()){

            System.out.print(lit.previous() + " ");
        } // 26 25 17 21 8 12
        System.out.println("");


        // elementleri gozden gecirin
        // tek sayi olanlari silin
        // cift sayi olanlarin degerini 5 artirin

        // baslarken iterator nerede ? dusunmeliyiz, su anda basta


        while (lit.hasNext()){

            Integer sayi = (Integer) lit.next();

            if (sayi % 2 == 0){

                lit.set(sayi + 5);
            }else{
                lit.remove();
            }
        }

        System.out.println(sayilar); // [17, 13, 31]


    }
}
