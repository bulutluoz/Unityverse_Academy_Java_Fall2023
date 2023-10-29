package day15_exceptions;

public class C06_ExceptionOrnekleri {

    public static void main(String[] args) {

        String str = null;

        System.out.println(str); // null

        System.out.println(str + " Java"); // null Java

        String s = "Guzeldir";

        System.out.println(str + " Java " + s); // null Java Guzeldir

        //System.out.println(str.length()); // NullPointerException

        //System.out.println(str.equals(s)); // NullPointerException

        //System.out.println(str.concat(s)); // NullPointerException

        // null olarak isaretlenen bir String yazdirilabilir
        // ama yazdirma disinda bir method kullanildiginda NullPointerException verir


        String sayiStr = "156";

        // str 100'den buyuk mu ?

        if (Integer.parseInt(sayiStr) > 100){ // NumberFormatException
            System.out.println("String olarak verilen sayi 100'den buyuk");
        }else System.out.println("String olarak verilen sayi 100'den buyuk degil");

        // Eger parse etmek istedigimiz String
        // sayi olmayan bir karakter iceriyorsa
        // NumberFormatException verir

        // non-primitive'lerde casting islemi
        // SADECE parent-child class'lar arasinda olabilir
        String abc = "Java Candir";

        Object obj = abc; // auto widening

        Integer abcSayi = (Integer) obj; // Explicit narrowing  ClassCastException

        // Syntax acisindan Object data turundeki bir variable'in degeri
        // Integer data turune explicit narrowing ile cast edilebilir
        // ANCAK java kodlari calistirdiginda obj variable'nin degerinin
        // Integer'a uygun olmadigini gorur ve ClassCastException firlatir
    }
}
