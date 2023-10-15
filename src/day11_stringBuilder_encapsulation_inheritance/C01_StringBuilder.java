package day11_stringBuilder_encapsulation_inheritance;

public class C01_StringBuilder {

    public static void main(String[] args) {

        String str1 = "Java Candir";

        String str2 = new String("Java Guzeldir");

        // primitive data turlerinin hafizada kapladiklari alan sabittir
        // non-primitive'ler ise icerdikleri data miktarina bagli olarak hafizada yer isgal ederler


        // StringBuilder 3 farkli sekilde olusturulabilir

        StringBuilder sb1 = new StringBuilder();
        // 1- icinde metin olmayan, 16 karakter alabilecek bir sb olusturur

        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16


        StringBuilder sb2 = new StringBuilder("Java");
        // 2- icinde "Java" olan, kapasitesi 16 + 4 = 20 karakter olan bir sb olusturur

        System.out.println(sb2.length()); // 4
        System.out.println(sb2.capacity()); // 20


        StringBuilder sb3 = new StringBuilder(7);
        // 3- icinde metin olmayan, kapasitesi 7 olan  bir sb olusturur

        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 7


        sb3.append("Arda");
        System.out.println(sb3.length()); // 4
        System.out.println(sb3.capacity()); // 7

        sb3.append(" Guler");

        System.out.println(sb3.length()); // 10
        System.out.println(sb3.capacity()); // 7*2 + 2 = 16

        sb3.append(" java ogreniyor");

        System.out.println(sb3.length()); // 25
        System.out.println(sb3.capacity()); // 16*2 + 2 = 34

        sb3.trimToSize();
        System.out.println(sb3.length()); // 25
        System.out.println(sb3.capacity()); // 25

    }
}
