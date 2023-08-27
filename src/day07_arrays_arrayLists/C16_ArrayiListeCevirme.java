package day07_arrays_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C16_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] sayilar = {3,5,6,7,8,1,3,4,9,1,0};

        // array'i listeye cevirmek istersek
        // bir liste olusturup for loop ile elementleri listeye ekleyebiliriz

        List<Integer> sayilarListesi = new ArrayList<>();

        for (int i = 0; i < sayilar.length ; i++) {

            sayilarListesi.add(sayilar[i]);
        }

        System.out.println(sayilarListesi); // [3, 5, 6, 7, 8, 1, 3, 4, 9, 1, 0]

        sayilarListesi.add(25);

        System.out.println(sayilarListesi); // [3, 5, 6, 7, 8, 1, 3, 4, 9, 1, 0, 25]

        sayilarListesi.remove(0);

        System.out.println(sayilarListesi); // [5, 6, 7, 8, 1, 3, 4, 9, 1, 0, 25]


        /*
            Arrays class'inda array'i listeye ceviren hazir bir method var
            AMMA kullanimi tavsiye edilmez
            CUNKU 2 buyuk dezavantaji var

            1- hazir method'la cevrilen list ekleme/cikarma gibi
               uzunlugu degistiren method'lari kullanamaz

            2- kaynak olan array ile cevrilen list ortak hareket eder
               birinde yapilan degisiklik
               digerine de islenir
         */

        // Integer[] sayilar = {3,5,6,7,8,1,3,4,9,1,0};

        List<Integer> hazirList = Arrays.asList(sayilar);

        System.out.println("hazir list : " + hazirList);
        // hazir list : [3, 5, 6, 7, 8, 1, 3, 4, 9, 1, 0]

        // hazirList.add(34); // UnsupportedOperationException
        // hazirList.remove(0); // UnsupportedOperationException
        System.out.println("hazir list : " + hazirList);


        // 2.dezavantaj

        System.out.println(Arrays.toString(sayilar)); // [3, 5, 6, 7, 8, 1, 3, 4, 9, 1, 0]
        System.out.println(hazirList); // [3, 5, 6, 7, 8, 1, 3, 4, 9, 1, 0]

        // array'in ilk elemnetini 23 yapin

        sayilar[0] = 23 ;
        System.out.println(Arrays.toString(sayilar)); // [23, 5, 6, 7, 8, 1, 3, 4, 9, 1, 0]

        // hazir list'de bir degisiklik yapmadik ama array'deki degisiklik oraya da yansir
        System.out.println(hazirList); // [23, 5, 6, 7, 8, 1, 3, 4, 9, 1, 0]
    }
}
