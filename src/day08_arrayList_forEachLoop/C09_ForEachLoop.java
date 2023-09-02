package day08_arrayList_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C09_ForEachLoop {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //         harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //         kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine(); // Ali okula git

        System.out.println("Lutfen bir harf giriniz");
        String harf = scanner.next().substring(0,1); // i

        String[] harfler = cumle.split(""); //

        // [A, l, i,  , o, k, u, l, a,  , g, i, t]

        int sayac =0;
        for (String each: harfler
             ) {

            if (each.equals(harf)){
                sayac++;
            }
        }


        if (sayac == 0){
            System.out.println("Verilen harf cumlede kullanilmamis");
        }else{
            System.out.println("Verilen harf cumlede " + sayac + " defa kullanilmis");
        }

    }
}
