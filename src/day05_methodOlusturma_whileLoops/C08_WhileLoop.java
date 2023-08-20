package day05_methodOlusturma_whileLoops;

import java.util.Scanner;

public class C08_WhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar isteyin
        // toplam 500 olur veya gecerse toplami yazdirin


        Scanner scanner = new Scanner(System.in);

        int girilenSayi=0;
        int sayilarinToplami =0;

        while (sayilarinToplami<500){ // devam etme sarti
            System.out.println("Toplanmak icin tam sayi giriniz");
            girilenSayi = scanner.nextInt();
            sayilarinToplami += girilenSayi;

        }

        System.out.println("Girilen sayilarin toplami : " + sayilarinToplami);

    }
}
