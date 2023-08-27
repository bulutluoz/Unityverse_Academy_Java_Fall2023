package day07_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_UzunList {

    public static void main(String[] args) {
        // icinde 2,4,5,6,7,8,4,3,5,7,8,9,4,2,2,6 elementleri bulunan bir list olusturun


        List<Integer> sayilar = new ArrayList<>();

        int[] geciciArr = {2,4,5,6,7,8,4,3,5,7,8,9,4,2,2,6};

        for (int i = 0; i < geciciArr.length ; i++) {

            sayilar.add(geciciArr[i]);
        }

        System.out.println(sayilar); // [2, 4, 5, 6, 7, 8, 4, 3, 5, 7, 8, 9, 4, 2, 2, 6]

        System.out.println(sayilar.contains(4)); // true
        System.out.println(sayilar.contains(23)); // false

        List<Integer> arananList = new ArrayList<>();
        arananList.add(3);
        arananList.add(6);
        arananList.add(9);

        System.out.println(sayilar.containsAll(arananList)); // true

        arananList.add(44);

        System.out.println(sayilar.containsAll(arananList)); // false

    }
}
