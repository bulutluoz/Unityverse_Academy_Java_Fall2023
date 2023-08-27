package day07_arrays_arrayLists;

import java.util.Arrays;

public class C02_BinarySearch {

    public static void main(String[] args) {

        // verilen String bir array'de
        // istenen bir String'in var olup olmadigini
        // true veya false olarak bize donduren bir method olusturun

        String[] arr = {"A","c","T","m"};
        String arananStr = "t";

        System.out.println(urunVarMi(arr, arananStr)); // false
        System.out.println(urunVarMi(arr, "A")); // true

        // Java'da bu isi yapan hazir bir method var
        // binarySearch() bir element array'de varsa bulundugu index'i
        // element array'de yoksa, olsaydi nerede olacagini soyler


        System.out.println(Arrays.binarySearch(arr, "t")); // -5
        System.out.println(Arrays.binarySearch(arr, "A")); // 0
        System.out.println(Arrays.binarySearch(arr, "T")); // -2
        System.out.println(Arrays.binarySearch(arr, "d")); // -4


        // ANCAK binarySearch()'un duzgun calisabilmesi icin
        // ONCE sort() calistirilmalidir.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [A, T, c, m]
        System.out.println(Arrays.binarySearch(arr, "t")); // -5
        System.out.println(Arrays.binarySearch(arr, "A")); // 0
        System.out.println(Arrays.binarySearch(arr, "T")); // 1
        System.out.println(Arrays.binarySearch(arr, "d")); // -4
        System.out.println(Arrays.binarySearch(arr,"m")); // 3
        System.out.println(Arrays.binarySearch(arr,"K")); // -2

        // var olan elementler icin oldugu index
        // olmayanlar icin ise - isareti ile bulunmasi gereken sirayi verir

    }

    public static boolean urunVarMi(String[] arr , String arananUrun){

        boolean sonuc= false;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equals(arananUrun)){
                sonuc = true;
                break;
            }
        }

        return sonuc;

    }
}
