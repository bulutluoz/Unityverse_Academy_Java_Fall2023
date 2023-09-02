package day08_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_IstenmeyenElementleriSil {
    public static void main(String[] args) {

        // verilen listeden cift sayilari silin

        int[] arr = {42,2,5,7,89,0,65,3,2,5,7,9,0,5,43,2,6,8,0,6,4,3,2};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar); //  [42, 2, 5, 7, 89, 0, 65, 3, 2, 5, 7, 9, 0, 5, 43, 2, 6, 8, 0, 6, 4, 3, 2]

        for (int i = 0; i < sayilar.size() ; i++) {

            if (sayilar.get(i) % 2 == 0){

                sayilar.remove(i);
            }
        }

        System.out.println(sayilar); // [2, 5, 7, 89, 65, 3, 5, 7, 9, 5, 43, 6, 0, 4, 3]

        // listeden her element sildigimizde, index'ler bir degisecegi icin
        // bazi elementler, kontrol edilmeden gecilebilir


        // Listeden direk silmek yerine
        // once SILINMEYECEK elementleri bir baska listeye kaydedip
        // loop bittikten sonra, ikinci listeyi, asil liste olarak kaydedebiliriz

        List<Integer> geciciList = new ArrayList<>();

        for (int i = 0; i < sayilar.size() ; i++) {

            if (sayilar.get(i) % 2 != 0){
                geciciList.add(sayilar.get(i));
            }
        }

        sayilar = geciciList;

        System.out.println("sayilar listesinin son hali : " + sayilar);
        // sayilar listesinin son hali : [5, 7, 89, 65, 3, 5, 7, 9, 5, 43, 3]

    }
}
