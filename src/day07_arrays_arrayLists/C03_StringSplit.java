package day07_arrays_arrayLists;

import java.util.Arrays;

public class C03_StringSplit {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel, keyifli bir programlama dili";

        System.out.println(Arrays.toString(str.split("guzel")));
        // [Java ogrenmek cok , , keyifli bir programlama dili]


        System.out.println(Arrays.toString(str.split("e")));
        // [Java ogr, nm, k cok guz, l, k, yifli bir programlama dili]

        // bu cumlede kac kelime var ?
        System.out.println(Arrays.toString(str.split(" ")));
        // [Java, ogrenmek, cok, guzel,, keyifli, bir, programlama, dili]
        System.out.println("Cumledeki kelime sayisi : " + str.split(" ").length);
        // Cumledeki kelime sayisi : 8

        String sonuc = "1-48 of over 4,000 results for 'java'";

        // arama sonuc sayisinin 1000'den fazla oldugunu test edin

        String[] sonucArr = sonuc.split(" ");

        System.out.println(Arrays.toString(sonucArr)); // [1-48, of, over, 4,000, results, for, 'java']

        String javaSonucSayisiStr = sonucArr[3];
        System.out.println(javaSonucSayisiStr); // 4,000

        javaSonucSayisiStr = javaSonucSayisiStr.replaceAll("\\D","");
        System.out.println(javaSonucSayisiStr); // 4000

        int javaSonucSayisiInt = Integer.parseInt(javaSonucSayisiStr);

        if (javaSonucSayisiInt>1000){
            System.out.println("Java arama sonucu 1000'den fazla, test PASSED");
        }

    }
}
