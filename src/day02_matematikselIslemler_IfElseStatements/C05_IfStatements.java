package day02_matematikselIslemler_IfElseStatements;

import java.util.Scanner;

public class C05_IfStatements {

    public static void main(String[] args) {

        // Eger if parantezinden sonra {} kullanilmazsa
        // if body'si olarak sadece ilk ;'e kadar olan kismi alir

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi” yazdirin ve sayiyi 2 katina cikarin,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0)
            System.out.println("sayi 5 ile tam bolunur");

        if (sayi%3 == 0) {
            System.out.println("sayi 3 ile bolunebilir");
            sayi *= 2;
        }





        System.out.println(sayi);

    }
}
