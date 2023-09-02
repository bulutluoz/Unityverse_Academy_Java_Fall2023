package day08_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_Remove {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("K");
        harfler.add("A");
        harfler.add("L");
        harfler.add("A");
        harfler.add("K");

        System.out.println(harfler); // [A, K, A, L, A, K]

        // silmesi icin obje verirsek, varsa objeyi siler ve true dondurur
        // yoksa silemedigi icin false dondurur

        System.out.println(harfler.remove("M")); // false

        System.out.println(harfler.remove("K")); // true

        System.out.println(harfler); // [A, A, L, A, K]

        // index olarak verirsek

        System.out.println(harfler.remove(1)); // A
        System.out.println(harfler); // [A, L, A, K]


        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(1);

        System.out.println(sayilar); // [5, 3, 7, 1]
        // Eger listemiz sayilardan olusuyorsa
        // objeler de Integer, index'ler de integer oldugundan
        // Java sayi yazdigimizda direk INDEX kabul eder

        sayilar.remove(1);

        System.out.println(sayilar); // [5, 7, 1]

        // obje olan 1'i silmek istiyorsaniz
        // once bir obje olarak 1'i olusturmaliyiz

        Integer silinecekSayi = 1;
        System.out.println(sayilar.remove(silinecekSayi)); // true
        System.out.println(sayilar); // 5, 7]


    }
}
