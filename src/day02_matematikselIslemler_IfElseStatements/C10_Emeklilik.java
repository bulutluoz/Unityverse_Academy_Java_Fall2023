package day02_matematikselIslemler_IfElseStatements;

import java.util.Scanner;

public class C10_Emeklilik {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Lutfen cinsiyetinizi giriniz.\nErkek : E, Kadin : K");
        char cinsiyet = scanner.next().charAt(0);

        // kodun daha anlasilir ve daha fazla kontrol edilebilir olmasi icin
        // Nested if-else kullanilabilir

        // birden fazla degisken oldugunda
        // ana degiskeni secelim. bu soruda ana degisken cinsiyet olsun

        if (cinsiyet=='E' || cinsiyet=='e'){ // sadece erkekler bu suzgecten gecer
            if (yas<10 || yas>85){
                System.out.println("Erkek icin gecersiz yas");
            } else if (yas>=65) {
                System.out.println("Erkek emekli olabilir");
            } else {
                System.out.println("Erkek emekli olabilmek icin "+ (65-yas)+ " sene daha calismalidir");
            }
        } else if (cinsiyet=='K' || cinsiyet =='k') { // sadece kadinlar bu suzgecten gecer
            if (yas<10 || yas>85){
                System.out.println("Kadin icin gecersiz yas");
            } else if (yas>=60) {
                System.out.println("Kadin emekli olabilir");
            } else {
                System.out.println("Kadin emekli olabilmek icin "+ (60-yas)+ " sene daha calismalidir");
            }
        }else {
            System.out.println("Cinsiyet icin gecerli harf giriniz");
        }


    }
}
