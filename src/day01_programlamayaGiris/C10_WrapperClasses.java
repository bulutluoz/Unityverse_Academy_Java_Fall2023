package day01_programlamayaGiris;

public class C10_WrapperClasses {

    public static void main(String[] args) {

        int sayi = 10;

        Integer sayiInteger = sayi ;

        int sayi2 = sayiInteger;

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648




        // String str = sayi ;
        /*
            Wrapper class'lar, primitive data turlerinin hazir methodlar kullanmasi icin olusturulmustur
            primitive data turleri ile wrapper class'lar arasinda rahatca gecis yapilabilir
         */


        String str1 = "25";
        String str2 = "40";

        // String olarak verilen iki sayiyi toplayin

        System.out.println(str1 + str2); // 2540

        System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2))); // 65


        char chr1 = 'r';
        // kucuk harf olarak verilen char degerini buyuk harf olarak yazdirin

        System.out.println(Character.toUpperCase(chr1));

        // verilen karakterin harf olup olmadigini kontrol edin
        System.out.println(Character.isLetter(chr1)); // true

        // verilen karakterin sayi olup olmadigini kontrol edin

        System.out.println(Character.isDigit(chr1)); // false

    }
}
