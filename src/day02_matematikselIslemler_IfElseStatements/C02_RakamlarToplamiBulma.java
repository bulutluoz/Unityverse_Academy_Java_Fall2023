package day02_matematikselIslemler_IfElseStatements;

import java.util.Scanner;

public class C02_RakamlarToplamiBulma {

    public static void main(String[] args) {

        // Kullanicidan 4 basamakli pozitif bir tamsayi alip
        // rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt(); // 2415

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = sayi % 10 ; // 5
        rakamlarToplami = rakamlarToplami + birlerBasamagi ; // 0 + 5 =>5
        sayi = sayi / 10 ; // 2415 / 10 => 241

        birlerBasamagi = sayi % 10 ; // 241 % 10 => 1
        rakamlarToplami = rakamlarToplami + birlerBasamagi ; // 5 + 1 => 6
        sayi = sayi / 10 ; // 241 / 10 => 24

        birlerBasamagi = sayi % 10 ; // 24 % 10 => 4
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // 6 + 4 => 10
        sayi = sayi / 10 ; // 24 / 10 => 2

        birlerBasamagi = sayi % 10; // 2 % 10 => 2
        rakamlarToplami = rakamlarToplami + birlerBasamagi ; // 10 + 2 => 12
        sayi  = sayi / 10 ; // 2 / 10 => 0

        System.out.println("Verilen sayinin rakamlari toplami : " + rakamlarToplami);


    }
}
