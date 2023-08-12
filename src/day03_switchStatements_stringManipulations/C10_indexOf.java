package day03_switchStatements_stringManipulations;

public class C10_indexOf {

    public static void main(String[] args) {

        String str = "Java cok zevkli, her ders Java gibi olsa";

        System.out.println(str.indexOf("li"));// 13

        System.out.println(str.indexOf("er")); // 18

        System.out.println(str.indexOf("er", 19)); // 22

        // str'daki ilk 3 a harfinin indexlerini yazdirin

        // once ilk a'nin index'ini bul
        int ilkIndex = str.indexOf('e');
        System.out.println("ilk index : " + ilkIndex);

        // ilk a'dan sonraki metne bak ve 2.a'nin index'ini bul
        int ikinciIndex = str.indexOf('e',ilkIndex+1);
        System.out.println("ikinci index : " + ikinciIndex);

        // 2. a'dan sonraki metne bak ve 3.a'nin index'ini bul
        int ucuncuIndex = str.indexOf('e',ikinciIndex+1);
        System.out.println("Ucuncu index : " + ucuncuIndex);

        System.out.println(str.indexOf("Q")); // -1


        // J'nin ilk uc index'ini yazdirin
        // once ilk J'nin index'ini bul
        ilkIndex = str.indexOf('J');
        System.out.println("ilk index : " + ilkIndex);

        // ilk J'dan sonraki metne bak ve 2.J'nin index'ini bul
        ikinciIndex = str.indexOf('J',ilkIndex+1);
        System.out.println("ikinci index : " + ikinciIndex);

        // 2. J'dan sonraki metne bak ve 3.J'nin index'ini bul
        ucuncuIndex = str.indexOf('J',ikinciIndex+1);
        System.out.println("Ucuncu index : " + ucuncuIndex);




    }
}
