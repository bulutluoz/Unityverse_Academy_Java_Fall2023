package day11_stringBuilder_encapsulation_inheritance;

public class C04_equals {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Tava");
        StringBuilder sb4 = new StringBuilder("Jale");

        String str = "Java";

        // farkli data turlerine sahip nonPrimitive variable'lar == ile karsilastirilamaz
        // System.out.println(sb1 == str);

        System.out.println(sb1 == sb2); // false


        // equals()

        System.out.println(sb1.equals(str));
        // String builder ile String'i equals ile karsilastirirsaniz
        // Java itiraz etmez ama sonuc HEP FALSE olur

        System.out.println(sb1.toString().equals(str)); // true

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true

        // equals()'nun stringBuilder ile kullanimi saglikli olmaz


        System.out.println(sb1.compareTo(sb2)); // 0
        // sonuc 0 ise metinler aynidir
        // metinler ayni degilse, herbir index'deki karakterleri karsilastirir
        // ve ilk buldugu farkli olan karakterler arasindaki ascii deger farkini dondurur

        System.out.println(sb1.compareTo(sb3)); // -10  Java Tava
        System.out.println(sb1.compareTo(sb4)); // 10   Java Jale
        System.out.println(sb4.compareTo(sb3)); // -10  Jale Tava

        StringBuilder sb5 = new StringBuilder("java");
        System.out.println(sb1.compareTo(sb5)); // -32 Java java

    }
}
