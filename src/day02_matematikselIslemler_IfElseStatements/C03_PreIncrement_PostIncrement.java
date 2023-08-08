package day02_matematikselIslemler_IfElseStatements;

public class C03_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int a = 10;

        // a'nin degerini bir artirin
        a++;
        // a'nin yeni degerini olusturacagimiz b variable'ina atayin
        int b = a;
        // a ve b'yi yazdirin

        System.out.println("a : " + a + " b : " + b); // a : 11 b : 11


        int c = 10;

        // c'nin degerini olusturacagimiz d variable'ina atayin
        int d = c ;
        // sonra c'yi bir artirin
        c++;
        // ce ve d'yi yazdirin
        System.out.println("c : " + c + " d : " + d); // c : 11 d : 10



        a = 10;
        b = ++a;
        System.out.println("a : " + a + " b : " + b); // a : 11 b : 11

        c=10;
        d= c++;
        System.out.println("c : " + c + " d : " + d); // c : 11 d : 10


        int sayi = 10;

        System.out.println(sayi--); // 10

        System.out.println(sayi); // 9



        sayi = 20;

        System.out.println(--sayi); // 19

        System.out.println(sayi); // 19


        sayi = 30;
        sayi++;
        System.out.println(sayi); //31

        sayi = 40;
        ++sayi;
        System.out.println(sayi); // 41
    }
}
