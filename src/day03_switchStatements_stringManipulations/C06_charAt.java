package day03_switchStatements_stringManipulations;

public class C06_charAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(5)); // C

        // sondaki harfi yazdirin

        System.out.println(str.charAt(10)); // r

        // Bu metinde kac karakter var ?  11

        System.out.println(str.charAt(11-1)); // r

        // sondan 3.harfi yazdirin

        System.out.println(str.charAt(11-3)); // d

        // System.out.println(str.charAt(-2));  StringIndexOutOfBoundsException

        // System.out.println(str.charAt(23));

        // System.out.println(str.charAt(11));

        // Bu method ile kullanabilecegimiz en buyuk index
        // uzunluk - 1 ' dir
    }
}
