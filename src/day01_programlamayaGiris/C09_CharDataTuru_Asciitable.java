package day01_programlamayaGiris;

import java.util.Scanner;

public class C09_CharDataTuru_Asciitable {

    public static void main(String[] args) {

        char chr1 = 'a' ;
        char chr2 = 'b';
        char chr3 = '5';
        System.out.println(chr1); // a

        System.out.println(chr1 + chr2); // 195
        System.out.println(chr1 + chr3); // 150


        char chr4 = 't';
        // char olarak verilen kucuk harfi, buyuk harfe dondurun
        System.out.println((char)(chr4 - 32));




        // kullanicidan bir karakter alin
        // ascii tablosunda girilen karakterden sonraki 3 karakteri yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ascii tablosundan bir karakter giriniz");

        char girilenKarakter = scanner.next().charAt(0);

        System.out.println("Girdiginiz karakter : " + girilenKarakter);
        System.out.println("Girdiginiz karakterden 1 sonraki karakter : " + (char)(girilenKarakter+1) );
        System.out.println("Girdiginiz karakterden 2 sonraki karakter : " + (char)(girilenKarakter+2) );
        System.out.println("Girdiginiz karakterden 3 sonraki karakter : " + (char)(girilenKarakter+3) );



    }
}
