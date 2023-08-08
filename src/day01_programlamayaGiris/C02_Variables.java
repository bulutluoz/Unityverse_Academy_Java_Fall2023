package day01_programlamayaGiris;

public class C02_Variables {

    public static void main(String[] args) {

        int sayi;

        // System.out.println(sayi);
        // atama yapilmadan variable olusturulabilir ama kullanilamaz

        sayi = 20;

        System.out.println("sayi degil");
        // Java " " icinde yazilan metinleri oldugu gibi yazdirir

        System.out.println(sayi); // 20

        sayi = 30;

        System.out.println(sayi); // 30

        boolean emekliOlabilirMi = true;

        char ilkHarf = 'H';
        char a = 'g';

        System.out.println(a); // g
        System.out.println("a"); // a

        char b = 'x';

        double dbl = 2.3;

        float flt = 5.4F ;

        dbl= 20 ;
        double dbl2 = 6;

        System.out.println(dbl / dbl2); // 3.3333333333333335

        flt = 20f;
        float flt2 = 6 ;
        System.out.println(flt / flt2); // 3.3333333

        int not = 56;
        int Not = 70;
        int NOt = 89;
        int NOT = 23;
    }
}
