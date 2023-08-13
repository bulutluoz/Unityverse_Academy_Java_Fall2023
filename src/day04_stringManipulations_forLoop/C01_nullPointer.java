package day04_stringManipulations_forLoop;

public class C01_nullPointer {

    public static void main(String[] args) {

        String str;

        str = null ;


        /*
            Bazen bir objeyi daha sonra deger atamak uzere olusturmak isteriz
            Ancak Java deger atanmayan objelerin kullanilmasina izin vermez

             String str;
             System.out.println(str);

             yazdigimizda altini kirmizi cizer ve biz hic bir class'i calistiramayiz

             Objeye bir deger atamasi yaparsak da
             java o objenin bos oldugunu anlamaz

             str = ""   veya str = "Ali Can" atamasinda hic bir fark yoktur
             cunku java baslangicta syntax'i kontrol eder

             Java bu problemi cozmek icin
             null pointer olusturmustur.

             null pointer bir deger degil,
             o objenin bos oldugunun isaretcisidir.

             Java null olarak isaretlenmis bir objeyi yazdirmaniza izin verir
             yazdirmanin disinda her hangi bir islemde kullanmaniza izin vermez


         */
        System.out.println(str);
        System.out.println(str + "bu da ilgincmis");
        // System.out.println(str.endsWith("l")); // NullPointerException
        System.out.println(str.concat("Himm"));


    }
}
