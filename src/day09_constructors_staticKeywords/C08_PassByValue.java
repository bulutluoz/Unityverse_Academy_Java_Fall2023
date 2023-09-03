package day09_constructors_staticKeywords;

public class C08_PassByValue {

    public static void main(String[] args) {

        int sayi = 10 ;
        kareAl(sayi);

        System.out.println("Method call sonrasi main method'da sayi degeri : " + sayi); // 10
        String isim = "Can";
    }


    public static void kareAl (int sayi){

        sayi = sayi * sayi ;

        System.out.println("Verilen sayinin karesi : " + sayi); // 100

        System.out.println("Method'da yapilan atama sonucu sayi degeri : " + sayi); // 100

        // System.out.println(isim); local variable'lar sadece olusturuldugu scope'da kullanilabilir
    }
}
