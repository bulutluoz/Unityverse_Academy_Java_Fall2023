package day11_stringBuilder_encapsulation_inheritance;

public class C03_StringBuilder_StringMethodlari {

    public static void main(String[] args) {

        // StingBuilder'da kullanilan
        // bize int, String veya char donduren method'lar kalici degisiklik yapmaz

        StringBuilder sb = new StringBuilder("Java Candir");

        System.out.println(sb.substring(5)); // Candir

        System.out.println(sb); // Java Candir

       // sb = sb.substring(5);

        System.out.println(sb.indexOf("Java")); // 0

        System.out.println(sb); // Java Candir


        // sb'de Java var mi ?
        // bazen StringBuilder bir variable'da String method'lari kullanmak isteyebiliriz
        // bu durumda once toString() ile sb'i String'e cevirebiliriz

        System.out.println(sb.toString().contains("Java")); // true


    }
}
