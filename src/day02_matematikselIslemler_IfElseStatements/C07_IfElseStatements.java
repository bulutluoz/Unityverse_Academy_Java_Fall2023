package day02_matematikselIslemler_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        //         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //         yoksa girilen karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char harf = scanner.next().charAt(0);

        if (harf >= 'a' && harf <='z'){
            System.out.println(Character.toUpperCase(harf));
        }else {
            System.out.println(harf);
        }



    }
}
