package day05_methodOlusturma_whileLoops;

public class C06_OverLoading {

    public static void main(String[] args) {

        String str = "java Candir";

        topla(5,6); // Iki tamsayinin toplami : 11
        topla(5.4,4); // double ve int toplami : 9.4

        topla(6,5.3); // int ve double toplami : 11.3

        topla(3.4,5.2); // double ve double toplami : 8.6

        topla('a','b'); // Iki tamsayinin toplami : 195

    }

    public static void topla(int a, int b){ // topla int int
        System.out.println("Iki tamsayinin toplami : " + (a + b));
    }

    public static void topla(double sayi1, int sayi2){ // topla double int
        System.out.println("double ve int toplami : " + (sayi1 + sayi2));
    }

    public static void topla(int sayi1, double sayi2){ // topla int double
        System.out.println("int ve double toplami : " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2){ // topla double double
        System.out.println("double ve double toplami : " + (sayi1 + sayi2));
    }
    /*
        Java'da bir class'da ayni isimde birden fazla method olusturulabilir
        Buna Method Overloading denir

        * parametrelerin adini degistirmek yeterli olmaz
        * java method'lara bakarken sadece method ismine degil,
          method signature'ina bakar
        * method signature = method ismi + parametre data turu 1 + pdt2 + pdt3
        * bir class'da ayni signature'a sahip 2 method olusturulmasina
          java izin vermez
     */


}
