package day05_methodOlusturma_whileLoops;

public class C03_methodOlusturma {

    public static void main(String[] args) {
        C02_MethodOlusturma.isimDuzenleYazdir("Markus","ANTONYOS"); // Markus Antonyos

        // verilen sayinin faktoryel degerini bize donduren bir method olusturun

        System.out.println(faktoryelHesapla(5)); // 120
        System.out.println(faktoryelHesapla(10)); // 3628800




    }

    public static int faktoryelHesapla(int sayi){
        // input : 5  faktoryel : 5 * 4 * 3 * 2 * 1 => 120

        int faktoryelDegeri=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryelDegeri *= i ;
        }

        return faktoryelDegeri;
    }
}
