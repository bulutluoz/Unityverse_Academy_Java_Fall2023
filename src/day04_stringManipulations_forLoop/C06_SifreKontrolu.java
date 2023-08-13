package day04_stringManipulations_forLoop;

import java.util.Scanner;

public class C06_SifreKontrolu {

    public static void main(String[] args) {

        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //          ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //          eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();

        int sayac =0;

        //          - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);


        if (ilkHarf >='a' && ilkHarf<='z'){
            sayac++;
        }else{
            System.out.println("ilk harf kucuk harf olmali");
        }

        //          - son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (sonKarakter>='0' && sonKarakter<='9'){
            sayac++;
        }else{
            System.out.println("son karakter sayi olmali");
        }


        //          - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifrede bosluk olmamali");
        }else{
            sayac++;
        }

        //          - uzunlugu en az 10 karakter olmali

        if (sifre.length()>=10){
            sayac++;
        }else{
            System.out.println("Uzunluk en az 10 karakter olmali");
        }


        if (sayac == 4){
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
