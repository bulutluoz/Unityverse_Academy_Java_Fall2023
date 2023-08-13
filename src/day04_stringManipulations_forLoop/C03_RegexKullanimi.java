package day04_stringManipulations_forLoop;

public class C03_RegexKullanimi {

    public static void main(String[] args) {

        String str = "J1av4a Guz3el09dir.";

        // metindeki sayilari temizleyin

        System.out.println(str.replaceAll("\\d", ""));
        // Java Guzeldir.

        // sayilarin gorunmemesi icin sayilarin yerine * koyun
        System.out.println(str.replaceAll("\\d", "*"));
        //J*av*a Guz*el**dir.

        // sayi olmayan tum karakterleri silin
        System.out.println(str.replaceAll("\\D", ""));
        // 14309

        str = "===++!!j12%a_4&    654647.v  -a2";

        // metindeki harfler disinda kalan herseyi temizleyin
        str = str.replaceAll("\\d","");
        str = str.replaceAll("\\W","");
        str = str.replaceAll("_","");
        System.out.println(str); // java



    }
}
