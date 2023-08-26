package day06_scope_arrays;

import java.util.Arrays;

public class C12_ArrayeElementEkleme {
    public static void main(String[] args) {

        // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //         eski array’e yeni degeri atayin.

        int[] arr = {3,6,8};

        // arr[3] = 10; // ArrayIndexOutOfBoundsException

        int[] yeniArr = {3,6,8,10};

        arr = yeniArr ;

        System.out.println("arr'nin son hali : "+Arrays.toString(arr));

        /*
            varolan bir array'e length'inden daha fazla veya daha az eleman ATAYAMAZSINIZ

            Ama var olan bir array'e baska yeni bir array deger olarak atanabilir.
            bu durumda eski array'in length'i yeni atanan array'in length'i olur
         */


        String[] isimler = {"Ali","Veli","Ayse"};
        // isimler array'ine Fatma'yi ekleyelim
        String eklenecekIsim = "Fatma";


        String[] yeniIsimArr = new String[isimler.length+1];

        System.out.println(Arrays.toString(yeniIsimArr)); // [null, null, null, null]


        for (int i = 0; i < isimler.length ; i++) {

            yeniIsimArr[i] = isimler[i];
        }

        System.out.println(Arrays.toString(yeniIsimArr)); // [Ali, Veli, Ayse, null]

        yeniIsimArr[yeniIsimArr.length-1] = eklenecekIsim;

        System.out.println(Arrays.toString(yeniIsimArr)); // [Ali, Veli, Ayse, Fatma]

        isimler = yeniIsimArr;
        System.out.println("Isimler array'inin son hali : " + Arrays.toString(isimler));

        // Isimler array'inin son hali : [Ali, Veli, Ayse, Fatma]


    }



}
