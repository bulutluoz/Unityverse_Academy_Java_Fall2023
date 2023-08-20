package day05_methodOlusturma_whileLoops;

public class C02_MethodOlusturma {

    public static void main(String[] args) {

        // Verilen isim ve soyismi ilk harf buyuk, diger harfler kucuk harf
        // olacak sekilde duzenleyip, yazdiran bir method olusturun

        isimDuzenleYazdir("AYKUT","MART"); // Aykut Mart
        isimDuzenleYazdir("eyup","eker"); // Eyup Eker





    } // main sonu


    public static void isimDuzenleYazdir(String isim, String soyisim){
        // input : isim : AYKUT    soyisim : MART

        String duzenliIsim = isim.substring(0,1).toUpperCase() +
                             isim.substring(1).toLowerCase() +
                             " "+
                             soyisim.substring(0,1).toUpperCase()+
                             soyisim.substring(1).toLowerCase();

        System.out.println(duzenliIsim);
    }


}// class sonu
