package day08_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArraydenTekrarlariSilme {
    public static void main(String[] args) {

        // verilen bir array'den tekrar eden elementleri silip
        // array'i unique elementlerden olusan bir hale donusturun

        int[] arr = {42,2,5,7,89,0,65,3,2,5,7,9,0,5,43,2,6,8,0,6,4,3,2};

        // array'de uzunlugu degistirmek cok zor oldugu icin
        // islemi bir list uzerinde yapip
        // en sonda yeniden array'e dondurelim

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizList.contains(arr[i])){

                tekrarsizList.add(arr[i]);
            }
        }

        System.out.println("Tekrarsiz liste : " + tekrarsizList);
        // Tekrarsiz liste : [2, 5, 7, 89, 0, 65, 3, 9, 43, 6, 8, 4]

        // artik arrayde hangi elementlerin olmasi gerektigini biliyoruz

        arr = new int[tekrarsizList.size()];

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i);
        }

        Arrays.sort(arr);
        System.out.println("arr'nin son hali : " + Arrays.toString(arr));

    }
}
