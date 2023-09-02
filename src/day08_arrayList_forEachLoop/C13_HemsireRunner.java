package day08_arrayList_forEachLoop;

public class C13_HemsireRunner {
    public static void main(String[] args) {

        C12_Hemsire hemsire1 = new C12_Hemsire();

        System.out.println(hemsire1.isim); // null
        hemsire1.isim = "Ayse";
        hemsire1.soyisim = "Can";
        hemsire1.adres ="Cankaya";

        System.out.println(hemsire1.soyisim); // Can

        C12_Hemsire hemsire2 = new C12_Hemsire();

        hemsire2.isim = "Yasemin";
        hemsire2.yas = 25;

        System.out.println(hemsire2.isim); //
    }
}
