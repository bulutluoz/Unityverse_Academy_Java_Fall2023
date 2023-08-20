package day05_methodOlusturma_whileLoops;

public class C04_MethodOlusturma {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan input olarak verilen bir String,
        //          baslangic ve bitis indexleri alip,
        //          verilen index'lere gore baslangic index'i dahil, bitis index'i haric
        //          olacak sekilde aradaki harfleri yazdiran bir method olusturun.
        //          - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse,
        //            hata mesaji verin
        //          - kullanici str'da olan index'lerden daha buyuk bir index girerse
        //            hata mesaji yazdirin.

        kendiSubstringimiz("Gunaydin arkadaslar",3,8); // aydin
        kendiSubstringimiz("Java",8,3); // Baslangic index'i bitisden buyuk olamaz
        kendiSubstringimiz("Java",6,10); // Girilen indexler sinirlarin disinda


    }

    public static void kendiSubstringimiz( String metin, int basIndex , int bitIndex){

        // Java Candir  bas: 2 , bit : 7   output ==> va Ca

        if (basIndex>bitIndex){
            System.out.println("Baslangic index'i bitisden buyuk olamaz");
        } else if (basIndex>metin.length() || bitIndex>metin.length()) {
            System.out.println("Girilen indexler sinirlarin disinda");
        }else{

            for (int i = basIndex; i < bitIndex ; i++) {

                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }
}
