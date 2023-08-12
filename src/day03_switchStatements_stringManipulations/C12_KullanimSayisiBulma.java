package day03_switchStatements_stringManipulations;

public class C12_KullanimSayisiBulma {
    public static void main(String[] args) {

        //Soru 2 : Kullanicidan bir String ve aranacak metin alin.
        //          Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin
        //          - String aranan metni icermiyor
        //          - Aranan metin String’de sadece 1 kere kullanilmis
        //          - Aranan metin String’de sadece 1’den fazla kullanilmis
        
        
        String str= "Java cok guzel, ben Java calismayi cok seviyorum.";
        String arananMetin = "a";
        
        int ilkIndex = str.indexOf(arananMetin);
        int sonIndex = str.lastIndexOf(arananMetin);
        
        if (sonIndex == -1){
            System.out.println("String aranan metni icermiyor");
        } else if (ilkIndex == sonIndex) {
            System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");
        }else{
            System.out.println("Aranan metin String’de sadece 1’den fazla kullanilmis");
        }

    }
}
