package day05_methodOlusturma_whileLoops;

public class C01_MethodKullanma {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println("Java'da cok kolaylik var");

        str.substring(3); // method calisir ama bize faydasi yok

        System.out.println(str.substring(3));
        // method calisir, istedigimiz islemin sonucunu bize döndürür
        // biz de yazdirdigimiz icin bu sonucu goruruz
        // ama sonucu kaydetmedigimiz icin bu method'un calismasi ve bize getirdigi sonuc
        // sadece 14.satirla sinirli olur


        String istenenParca= str.substring(5);
        // method calisir, istenen parcayi bize döndürür
        // biz o metni kaydetmis oluruz
        // biz suan icin kaydedilen parcayi goremeyiz
        // kaydettigimiz icin istersek yazdirir, istersek de ilerde kullaniriz

        System.out.println(istenenParca);




    }
}
