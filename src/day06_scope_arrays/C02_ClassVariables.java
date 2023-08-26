package day06_scope_arrays;

public class C02_ClassVariables {

    int classLevelInt = 25;
    static String classLevelStr = "Java Candir";
    /*
        Class level'da olusturulan static olarak etiketlenen variable'lar
        class icindeki her yerden kullanilabilir.

        Class level'da olusturulan static olarak etiketlenmeyen variable'lar
        (Instance Variable) static method'lardan direk kullanilamaz

        static olmayan variable'lar, static olmayan method'lardan direk kullanilabilir
     */

    public static void main(String[] args) {
        String strMain = "Java";
        // System.out.println(sayi);
        System.out.println(classLevelStr);


        for (int i = 0; i <10 ; i++) {
            System.out.println(classLevelStr);
        }

        // System.out.println(classLevelInt);
    }

    public static void method1(){
        // System.out.println(strMain);

        int sayi = 20;
        classLevelStr = "Java Guzeldir";
        // System.out.println(classLevelInt);
    }


    public void method2(){
        System.out.println(classLevelStr);
        System.out.println(classLevelInt);
    }
}
