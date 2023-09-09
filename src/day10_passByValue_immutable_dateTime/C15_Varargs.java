package day10_passByValue_immutable_dateTime;

public class C15_Varargs {
    public static void main(String[] args) {

        // Verilen degisken sayidaki int argument'den
        // ilki haric geriye kalanlari toplayip
        // bulunan toplam degeri ile ilk argument'i carpip
        // sonucu yazdiran bir method olusturun

        islemYap(2,3,4); // 14
        islemYap(1,3,4,5,6,7,8); // 33
        islemYap(3);// 0

        baskaIslemYap("Ali","Veli",1,2,3); // Ali6Veli
        baskaIslemYap("a","b"); // varargs bos bir array degerini de kabul eder a0b

    }

    private static void islemYap(int ilkSayi, int... sayilar) {
        // sayilar yollanan tum argumentleri alan bir array'dir

        int elementlerToplami = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            elementlerToplami += sayilar[i];
        }



        System.out.println("istenen islem sonucu : " + elementlerToplami*ilkSayi);
    }

    public static void baskaIslemYap(String s, String k, int... sayilar){

        // int sayilari toplayip,
        // ilk iki string arasinda toplam degerini yazdirin
        int elementlerToplami = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            elementlerToplami += sayilar[i];
        }

        System.out.println(s+elementlerToplami+k);

    }
}
