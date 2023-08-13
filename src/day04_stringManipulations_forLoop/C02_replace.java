package day04_stringManipulations_forLoop;

public class C02_replace {

    public static void main(String[] args) {

        String str = "Java candir";

        // bu metindeki tum a'lari A yapin

        System.out.println(str.replace('a', 'A')); // JAvA cAndir

        // candir yerine mukemmeldir yazin
        System.out.println(str.replace("candir", "mukemmeldir"));
        // Java mukemmeldir

        System.out.println(str); // Java candir

        System.out.println(str.replace("x","y")); // Java candir

        // a harflerini metinden silin
        System.out.println(str.replace("a", "")); // Jv cndir

        // sadece ilk a'yi A yapin
        System.out.println(str.replaceFirst("a", "A")); // JAva candir
    }
}
