package day09_constructors_staticKeywords;

public class C05_Hemsire {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Cankaya";
    static String bashekimIsmi = "Hasan Can";

    String hemIsmi= "Isim degeri atanmadi";
    String hemAdresi= "Adres degeri atanmadi";
    String hemTel = "Telefon degeri atanmadi";


    @Override
    public String toString() {
        return "Hemsire Bilgileri : " +
                "hemIsmi='" + hemIsmi + '\'' +
                ", hemAdresi='" + hemAdresi + '\'' +
                ", hemTel='" + hemTel + '\'' +
                ", Hastane Ismi='" + hastaneIsmi + '\''+
                ", Hastane Adresi='" + hastaneAdresi + '\''+
                ", Bashekim Ismi='" + bashekimIsmi + '\''
                ;
    }
}
