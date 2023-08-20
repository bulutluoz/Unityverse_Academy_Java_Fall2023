package day05_methodOlusturma_whileLoops;

import java.util.Scanner;

public class C10_doWhileLoop {

    public static void main(String[] args) {

        // kullanicidan tuttugumuz 1 ile 100 arasindaki bir sayiyi bilmesini isteyin
        // kullanicinin tahmini tuttugumuz sayidan kucukse kullaniciya "Daha Buyuk"
        // tahmini tuttugumuz sayidan buyukse daha kucuk yazdirin
        // kullanici sayiyi bulursa, kac defada buldugunu yazdirin


        int tutulanSayi = 60;

        int girilenSayi = 0;
        int sayac = 1;
        Scanner scanner = new Scanner(System.in);

        while (tutulanSayi != girilenSayi) {
            System.out.println("lutfen bir tahmin giriniz");
            girilenSayi = scanner.nextInt();


            if (girilenSayi < tutulanSayi) {
                System.out.println("daha buyuk");
                sayac++;
            } else if (girilenSayi > tutulanSayi) {
                System.out.println("daha kucuk");
                sayac++;
            }else{
                System.out.println(sayac + " tahminde bildiniz");
                break;
            }


        }
    }
}
