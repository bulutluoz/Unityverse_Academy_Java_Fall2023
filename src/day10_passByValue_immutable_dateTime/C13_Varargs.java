package day10_passByValue_immutable_dateTime;

public class C13_Varargs {

    public static void main(String[] args) {

        /*
            Bir class'da ayni islemi yapacak ama
            argument sayisi degisen farkli method'lara ihtiyac varsa
            Varargs kullanilabilir
         */

        toplama(3,5); // 2 sayinin toplami : 8
        toplama(3,6,7); // 3 sayinin toplami : 16
        // toplama(3,6,7,10);
        // toplama(3,6,7,10,14);
        // toplama(3,6,7,10,14,20);

    }

    private static void toplama(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 sayinin toplami : " +(sayi1 + sayi2+sayi3));
    }


    public static void toplama(int sayi1, int sayi2){
        System.out.println("2 sayinin toplami : " +(sayi1 + sayi2));
    }
}
