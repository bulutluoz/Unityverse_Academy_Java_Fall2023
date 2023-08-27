package day07_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C11_remove {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Cem");
        isimler.add("Arda");
        isimler.add("Eyup");
        isimler.add("Reyyan");

        System.out.println(isimler); // [Cem, Arda, Eyup, Reyyan]

        System.out.println(isimler.remove("Eyup")); // true
        System.out.println(isimler); // [Cem, Arda, Reyyan]


        System.out.println(isimler.remove("Mehmet")); // false
        System.out.println(isimler); // [Cem, Arda, Reyyan]

        // en bastaki ismi silelim

        System.out.println(isimler.remove(0)); // Cem
        System.out.println(isimler); // [Arda, Reyyan]



        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(4);
        sayilar.add(8);
        sayilar.add(1);

        System.out.println(sayilar); // [5, 4, 8, 1]

        System.out.println(sayilar.remove(1)); // 4
        System.out.println(sayilar); // [5, 8, 1]

        // Liste sayilar'dan olusuyorsa
        // remove() argument olarak yazdigimiz sayiyi INDEX kabul eder
        // eger obje olarak 1'i silmek isterseniz
        // once 1'i obje olarak olusturmalisiniz

        Integer silinecekSayi = 1;
        System.out.println(sayilar.remove(silinecekSayi)); // true
        System.out.println(sayilar); // [5, 8]


    }
}
