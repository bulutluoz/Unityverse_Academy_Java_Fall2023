package day07_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C15_TamBolenlerSayisi {
    public static void main(String[] args) {

        // Soru 6- Verilen pozitif bir tamsayiyi,
        //         tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren
        //         bir method olusturun.

        int sayi = 50;
        System.out.println(tamBolenlerListesi(sayi)); // [1, 2, 5, 10, 25, 50]

        System.out.println(tamBolenlerListesi(80)); // [1, 2, 4, 5, 8, 10, 16, 20, 40, 80]

    }

    public static List<Integer> tamBolenlerListesi(int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % i == 0){
                tamBolenlerListesi.add(i);
            }
        }

        return tamBolenlerListesi;
    }
}
