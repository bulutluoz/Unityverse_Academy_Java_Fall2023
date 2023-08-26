package day06_scope_arrays;

public class C01_LoopVariables {

    public static void main(String[] args) {

        String str ="Java Candir";

        // String str = "Java";
        // int str = 20;

        System.out.println(str); // Java Candir

        for (int i = 0; i < 10 ; i++) {

            int sayi = i;

            System.out.println(i);
            System.out.println(sayi);
        }
        // Loop icerisinde olusturulan variable'lar, loop disinda kullanilamaz
        // System.out.println(i);
        // System.out.println(sayi);

    }


    public static void method01(){

        String str = "Java Guzeldir";

        System.out.println(str); // Java Guzeldir



    }
}
