package day08_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ArrayList {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(3);
        System.out.println(sayilar); // [5, 7, 3]

        // listenin basina 10 ekleyin
        sayilar.add(0,10);

        System.out.println(sayilar); // [10, 5, 7, 3]

        // set() method'u ekleme degil update yapar

        // listenin basindaki elementi 8 olarak update edin

        sayilar.set(0,8);

        System.out.println(sayilar); // [8, 5, 7, 3]



    }
}
