package day07_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_set {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(20);
        sayilar.add(10);
        sayilar.add(23);

        System.out.println(sayilar); // [20, 10, 23]

        // listenin basina element olarak 5 ekleyin

        sayilar.add(0,5);
        System.out.println(sayilar); // [5, 20, 10, 23]

        // add varolan elementleri korur, yeni eklenen element siralamayi degistirirse
        // diger elementleri bir arkaya kaydirir

        sayilar.set(0,40);

        System.out.println(sayilar); // [40, 20, 10, 23]

        // set() var olan bir elementi update etmek icin kullanilir
        // eski degeri siler ve yeni degeri atar




    }
}
