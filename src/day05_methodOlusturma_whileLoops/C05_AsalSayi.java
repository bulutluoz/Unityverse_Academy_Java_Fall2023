package day05_methodOlusturma_whileLoops;

import java.util.Scanner;

public class C05_AsalSayi {

    public static void main(String[] args) {
        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        //        Girilen sayinin asal sayi olup olmadigini kontrol edip,
        //        sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren
        //        bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kontrol etmek icin pozitif bir tamsayi girin");
        int girilenSayi = scanner.nextInt();

        System.out.println(asalSayiMi(girilenSayi));


    }

    public static String asalSayiMi(int girilenSayi){

        int flag = 10;

        for (int i = 2; i <girilenSayi ; i++) {

            if (girilenSayi % i == 0){
                flag++;
                System.out.println(i + " 'e bolunur ");
                break;
            }
        }

        if (flag == 10){
            return "Asal sayi";
        }else{
            return "Asal degil";
        }

    }
}
