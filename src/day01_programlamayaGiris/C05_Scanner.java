package day01_programlamayaGiris;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        asagidaki formmatta yazdirin.
		Isminiz : John
		Soyisminiz : Doe
		Yasiniz : 44
		Kaydiniz basariyla tamamlanmistir.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();


        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
    }
}
