package day08_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayLists {

    public static void main(String[] args) {

        int[] arr = new int[4]; // [0, 0, 0, 0]
        int[] arr2 = {2,4,6,7,8,56,4,2,2,4,7,8,5};

        List<Integer> sayilar = new ArrayList<>();
        ArrayList<Integer> sayilar2 = new ArrayList<>();
        ArrayList<Integer> sayilar3 = new ArrayList<Integer>();


        System.out.println(sayilar); // []
        sayilar.add(7);
        sayilar.add(10);
        sayilar.add(20);

        System.out.println(sayilar); // [7, 10, 20]

        sayilar.addAll(sayilar);
        System.out.println(sayilar); // [7, 10, 20, 7, 10, 20]

        // ilk 10 ile 20 arasina 3 ekleyelim
        sayilar.add(2,3);
        System.out.println(sayilar); // [7, 10, 3, 20, 7, 10, 20]

        System.out.println(sayilar.add(5)); // true

        System.out.println(sayilar.size());  // 8

        // sayilar listesinde 10 var mi ?

        System.out.println(sayilar.contains(10)); // true
        System.out.println(sayilar.contains(50)); // false



    }
}
