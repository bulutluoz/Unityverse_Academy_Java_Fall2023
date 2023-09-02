package day08_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C10_ForEachLoop {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //	- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //	- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //	  yeni bir listeye ekleyip yazdirin.

        List<String> isimler = new ArrayList<>();

        isimler.add("Arda");
        isimler.add("Eyup");
        isimler.add("Cem");
        isimler.add("Gamze");

        List<String> yeniList = new ArrayList<>();
        int kelimeUzunlugu=0;

        for (String each :isimler
             ) {

            kelimeUzunlugu = each.length();

            if (kelimeUzunlugu % 2 == 0){
                //	- Kelimenin uzunlugu cift sayi ise ilk yarisini
                yeniList.add(each.substring(0,kelimeUzunlugu/2));

            }else {
                //	- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                yeniList.add(each.substring(kelimeUzunlugu/2));
            }
        }

        System.out.println("Yeni liste : " + yeniList);
    }
}
