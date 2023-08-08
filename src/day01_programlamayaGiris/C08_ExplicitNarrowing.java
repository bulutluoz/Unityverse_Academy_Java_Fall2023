package day01_programlamayaGiris;



public class C08_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1 = 25;

        byte byt = (byte)sayi1 ;
        System.out.println(byt); // 25

        int sayi2 = 128 ;
        byt = (byte)sayi2 ;
        System.out.println(byt); // -128

        int sayi3 = 133 ;
        byt = (byte)sayi3 ;
        System.out.println(byt); // -123


        int sayi4 = 256 ;
        byt = (byte)sayi4 ;
        System.out.println(byt); // 0

        int sayi5 = 523 ; // 256 + 256 + 11
        byt = (byte)sayi5 ;
        System.out.println(byt); // 11


        double dbl = 23.99999;
        int sayi6 = (int)dbl ;
        System.out.println(sayi6); // 23



        int a = 24 ;
        int b = 6 ;

        System.out.println(a / b); // 4

        a = 25 ;
        b = 8 ;
        System.out.println( a / b ); // 3.125 ==> 3

        double c = a / b ;

        System.out.println(c); // 3.0


        double x = 25;
        int y = 8 ;

        System.out.println(x / y); // 3.125


        c = (double)a / b ;
        System.out.println(c); // 3.125


    }
}
