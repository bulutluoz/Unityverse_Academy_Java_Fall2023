package day10_passByValue_immutable_dateTime;

import java.util.ArrayList;
import java.util.List;

public class C06_Mutable_ImmutableClasses {
    public static void main(String[] args) {

        /*
            Immutable class'lar sonradan deger atanamayan class'lardir
            ornegin String, Integer, Char immutable class'lardir
            String'de method ile yaptigimiz degisiklik kalici olmaz

            Mutable class'lar ise degistirilebilen class'lardir
            Ornek : List
            List'de method ile yaptigimiz degisiklikler kalici olur
         */

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        System.out.println(str.replace("a", "b")); // Jbvb Cbndir

        System.out.println(str); // Java Candir

        str = str.toLowerCase();

        System.out.println(str); // java candir

        List<String> harfler  = new ArrayList<>();

        harfler.add("a");
        harfler.add("b");
        harfler.add("c");

        System.out.println(harfler); // [a, b, c]

        harfler.set(1,"k");

        System.out.println(harfler); // [a, k, c]


    }
}
