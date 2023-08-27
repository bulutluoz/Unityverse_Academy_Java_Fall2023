package day07_arrays_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ArraydekiTekrarEdenSayilariSilme {

    public static void main(String[] args) {

        int[] arr = {3,2,6,7,3,5,2,9,0};

        // tekrar eden elementleri silip,
        // array'i unique elementlerden olusan bir hale getirin

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar); // []
        sayilar.add(23);
        sayilar.add(12);
        sayilar.add(5);

        System.out.println(sayilar); // [23, 12, 5]

        // listede 5'in olup olmadigini kontrol edelim

        System.out.println(sayilar.contains(5)); // true

        // {3,2,6,7,3,5,2,9,0};

        List<Integer> uniqueList = new ArrayList<>() ;

        for (int i = 0; i < arr.length; i++) {

            if (!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);
            }
        }

        System.out.println("Unique list : " + uniqueList); // Unique list : [3, 2, 6, 7, 5, 9, 0]
        System.out.println(Arrays.toString(arr)); // [3, 2, 6, 7, 3, 5, 2, 9, 0]

        arr = new int[uniqueList.size()];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = uniqueList.get(i);
        }

        System.out.println("Arr'nin son hali : "+ Arrays.toString(arr));

    }
}
