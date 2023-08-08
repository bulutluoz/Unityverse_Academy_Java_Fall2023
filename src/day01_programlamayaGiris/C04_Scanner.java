package day01_programlamayaGiris;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini alip
        // buyuk harflerle yazdiralim

        // 1- scanner objesi olustur
        Scanner scanner = new Scanner(System.in);

        // 2- kullaniciya ne istedigimizi yazdir

        System.out.println("Lutfen isminizi giriniz");

        // 3- girilen degeri kaydedebilecegimiz bir variable olusturup
        //    scanner objesi ile uygun method kullnip degeri alalim

        String kullaniciIsmi = scanner.nextLine();

        System.out.println(kullaniciIsmi.toUpperCase());

    }
}
