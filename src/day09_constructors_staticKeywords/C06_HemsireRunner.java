package day09_constructors_staticKeywords;

public class C06_HemsireRunner {

    public static void main(String[] args) {

        C05_Hemsire hemsire1 = new C05_Hemsire();

        System.out.println(hemsire1);
        // Hemsire Bilgileri : hemIsmi='Isim degeri atanmadi', hemAdresi='Adres degeri atanmadi', hemTel='Telefon degeri atanmadi', Hastane Ismi='Yildiz Hastanesi', Hastane Adresi='Cankaya', Bashekim Ismi='Hasan Can'

        hemsire1.hemIsmi ="Ayse";
        hemsire1.hemAdresi ="Yenimahalle";
        hemsire1.hemTel = "5552345332";
        System.out.println(hemsire1);
        // Hemsire Bilgileri : hemIsmi='Ayse', hemAdresi='Yenimahalle', hemTel='5552345332', Hastane Ismi='Yildiz Hastanesi', Hastane Adresi='Cankaya', Bashekim Ismi='Hasan Can'

        C05_Hemsire hemsire2 = new C05_Hemsire();

        System.out.println(hemsire2);


        hemsire2.hemIsmi = "Fatma";
        hemsire2.hemAdresi = "Sincan";


        hemsire1.bashekimIsmi = "Cem";

        System.out.println(hemsire1.bashekimIsmi); // Cem
        System.out.println(hemsire2.bashekimIsmi); // Cem


    }
}
