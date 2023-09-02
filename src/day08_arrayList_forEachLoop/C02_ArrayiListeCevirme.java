package day08_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayiListeCevirme {
    public static void main(String[] args) {

        int[] arr = {3,5,6,2,5,7,8,9,1,5,0,8,5,3,2,7,8,9,1};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        System.out.println("Sayilar Listesi : " + sayilar);


    }
}
