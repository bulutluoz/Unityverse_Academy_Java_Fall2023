package day03_switchStatements_stringManipulations;

import java.util.Locale;

public class C03_toUpperCase_toLowerCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        str = str.toLowerCase();

        System.out.println(str); // java candir

        str = "JAVA CANDIR";
        // kucuk harfe donusturelim
        // ancak I harfini turkcedeki kucuk ı olarak yapsin

        System.out.println(str.toLowerCase(Locale.CHINA)); // java candir
        str = str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str); // java candır
    }
}
