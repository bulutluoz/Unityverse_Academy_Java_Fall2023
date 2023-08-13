package day04_stringManipulations_forLoop;

import java.util.Scanner;

public class C04_BilgiGizleme {

    public static void main(String[] args) {

        // Kullanicidan isim, soyisim ve kredi karti bilgisini alin
        // asagidaki sekilde yazdirin
        // Isim soyisim :  O*** A***
        // Kredi kart No : 1234 **** **** ****
        // Not  : isim ve soyisim tek kelime olacaktir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kart numaranizi, isminizi ve soyisminizi giriniz");
        String kkNo = scanner.nextLine();
        String isim = scanner.next();
        String soyisim = scanner.next();

        String yazdirilacakKkNo =   kkNo.substring(0,4) +
                                    kkNo.substring(4).replaceAll("\\d","*");

        String yazdirilacakIsim =   isim.substring(0,1).toUpperCase()+
                                    isim.substring(1).replaceAll("\\w","*");

        String yazdirilacakSoyisim = soyisim.substring(0,1).toUpperCase()+
                                     soyisim.substring(1).replaceAll("\\w","*");


        System.out.println("Isim soyisim : " + yazdirilacakIsim + " "+yazdirilacakSoyisim
                            + "\nKredi Karti No : " + yazdirilacakKkNo);



    }
}
