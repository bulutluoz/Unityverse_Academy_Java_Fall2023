package day05_methodOlusturma_whileLoops;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplamak uzerek int sayilar isteyin
        // kullanici 0'a basana kadar girilen sayilari toplayin
        // kullanici 0'a bastiginda programi bitirip,
        // girilen sayilarin toplamini yazdirin

        // tekrar sayisi belli olmayan durumlarda
        // for loop kullanimi tercih edilmez


        Scanner scanner = new Scanner(System.in);

        int girilensayi= 119;
        int sayilarinToplami=0;

        while(girilensayi != 0){ // devam etmesi icin istenen sart

            System.out.println("Toplanmak uzere tam sayi giriniz");
            girilensayi= scanner.nextInt();
            sayilarinToplami += girilensayi;
        }

        System.out.println("Girilen sayilarin toplami : " + sayilarinToplami);

    }
}
