package day01_programlamayaGiris;

import java.util.Scanner;

public class C06_Swap {

    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        //                     ikisinin degerlerini degistirin(swap).


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println("Girdiginiz ilk sayi : " + sayi1 + " ikinci sayi : " + sayi2);

        int temp;

        temp = sayi1;

        sayi1 = sayi2;

        sayi2 = temp;

        System.out.println("Ben sayilari degistirdim ilk sayi : " + sayi1 + " ikinci sayi : " + sayi2);

    }
}
