package day16_iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C01_IteratorKullanimSebebi {

    public static void main(String[] args) {
        /*
            Java'da birden fazla eleman barindiran yapilarda
            index kullanmadan tum elemanlari gozden gecirip
            istenenleri update etme, istenenleri silme gibi islemler
            YAPILAMAZ
         */


        // verilen bir listede, index kullanmadan
        // tum sayilari 2 artirin

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(6);
        sayilar.add(19);
        sayilar.add(15);
        sayilar.add(23);
        sayilar.add(24);

        System.out.println(sayilar); // [10, 6, 19, 15, 23, 24]

        for (Integer each : sayilar
             ) {

            System.out.print(each+2 + " ");
        } // 12 8 21 17 25 26

        System.out.println("");
        System.out.println(sayilar); // [10, 6, 19, 15, 23, 24]


        for (Integer each : sayilar
             ) {

            each = each+2;
        }

        // System.out.println(each);   each loop icerisinde olusturulmus local bir variable'dir
        //                             scope'u loop oldugundan, loop'un disinda kullanilamaz
        //                             each'e yapilan atamalar loop icinde kalir

        System.out.println(sayilar); // [10, 6, 19, 15, 23, 24]



        // index kullanmadan listeden cift sayilari silin

        // index kullanmadan bunu cozmemiz MUMKUN DEGILDIR
        // ayrica index kullansak bile, listenin boyutunu degistiren islemler
        // ayni list uzerinde yapilirsa hatalar cikabilir

        for (int i = 0; i < sayilar.size() ; i++) {

            if (sayilar.get(i) % 2 == 0){

                sayilar.remove(i);
                i--; // silinen elemandan dolayi liste degistiginden, silinme oldugunda
                     // elemanlarda atlanan eleman olmamasi icin index'i bir geriye aldik
            }
        }

        System.out.println(sayilar); // [10, 6, 19, 15, 23, 24]
    }
}
