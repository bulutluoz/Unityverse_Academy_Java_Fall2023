package day02_matematikselIslemler_IfElseStatements;

import java.util.Scanner;

public class C06_IfStatements {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini tam sayi olarak giriniz");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 >0){
            System.out.println("Girilen degerler bir eskenar olusturur");
        }
    }
}
