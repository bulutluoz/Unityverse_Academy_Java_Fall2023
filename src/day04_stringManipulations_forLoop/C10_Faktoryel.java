package day04_stringManipulations_forLoop;

import java.util.Scanner;

public class C10_Faktoryel {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan 15’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         6! = 6 * 5 * 4 * 3 * 2 * 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("15'den kucuk pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        int faktoryelDegeri = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryelDegeri *= i;
        }

        System.out.println(sayi + "!= " + faktoryelDegeri);


    }
}
