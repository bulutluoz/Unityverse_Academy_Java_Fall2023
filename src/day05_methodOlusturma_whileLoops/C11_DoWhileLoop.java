package day05_methodOlusturma_whileLoops;

import java.util.Scanner;

public class C11_DoWhileLoop {

    public static void main(String[] args) {
        // kullanicidan tuttugumuz 1 ile 100 arasindaki bir sayiyi bilmesini isteyin
        // kullanicinin tahmini tuttugumuz sayidan kucukse kullaniciya "Daha Buyuk"
        // tahmini tuttugumuz sayidan buyukse daha kucuk yazdirin
        // kullanici sayiyi bulursa, kac defada buldugunu yazdirin


        int tutulanSayi = 60;

        int girilenSayi = 0;
        int sayac = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Lutfen bir sayi tahmin ediniz");
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

        }while(girilenSayi != tutulanSayi);
    }


    /*
        Bugune kadar toplam 3 loop gorduk
        1- for loop :
            baslangic ve bitis degerleri belli ise
            veya tekrar sayisi belirli ise tercih edilir
        2- while loop :
            tekrar sayisi belli degil ise
            ornegin q'ya basincaya kadar kullanicdan deger alinacaksa
            tercih edilir.
            for loop'un uzmanligi olan sorularda
            while loop kullanilirsa
            baslangic degeri, bitis degeri ve artim seklinin manuel olarak girilmesi gerekir
            bu da cok pratik degildir
         3- do-while loop
            kullanicidan deger alip bir islem yapmak gibi durumlarda
            kullanicidan almadan kendimiz deger atadigimizda hatalar olusabilir.
            while kontrolu yapilmadan
            LOOP'un en azindan bir kere calismasini isterseniz
            while loop yerine do while loop tercih edilir.
     */
}
