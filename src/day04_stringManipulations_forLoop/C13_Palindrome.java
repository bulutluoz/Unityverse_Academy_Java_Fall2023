package day04_stringManipulations_forLoop;


import java.util.Scanner;

public class C13_Palindrome {

    public static void main(String[] args) {
        // Soru 10 (interview)- Kullanicidan bir String isteyin
        //         ve String’i tersine cevirip kaydedin.
        //         Eger String'in tersi ile kendisi ayni ise
        //         "Verilen metin Palindrome" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        String tersMetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.charAt(i);
        }

        System.out.println("Metnin ters hali : " + tersMetin);


        if (metin.equals(tersMetin)){
            System.out.println("Verilen metin Palindrome");
        }
    }





}
