package day03_switchStatements_stringManipulations;

public class C08_substring {

    public static void main(String[] args) {

        String str = "Java Candir";

        // iki turlu substring alinabilir
        // 1- verilen index ve sonrasi

        System.out.println(str.substring(5)); // Candir
        System.out.println(str.substring(1)); // ava Candir

        // son 4 karakteri yazdirin
        System.out.println(str.substring(str.length()-4)); // ndir

        System.out.println(str.substring(str.length() - 1)); // r

        System.out.println(str.substring(str.length())); // hiclik

        // System.out.println(str.substring(15)); // StringIndexOutOfBoundsException


        // 2- verilen iki index'in arasi

        System.out.println(str.substring(0,4)); // Java

        System.out.println(str.substring(5,8)); // Can

        // eger tek bir harfe String olarakulasmak istersek kullanilir
        System.out.println(str.substring(7,8)); // n

        // str'in ilk harfini kucuk harf olarak yazdirin

        System.out.println(str.substring(0, 1).toLowerCase()); // j

        // baslangic index'i bitis index'inden buyuk olursa

        // System.out.println(str.substring(8,5)); // StringIndexOutOfBoundsException


        System.out.println(str.substring(9, 9)); // hiclik


    }
}
