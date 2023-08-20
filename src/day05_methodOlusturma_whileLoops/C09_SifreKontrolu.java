package day05_methodOlusturma_whileLoops;

import java.util.Scanner;

public class C09_SifreKontrolu {
    // Soru : Kullanicidan main method icinde sifre isteyin
    //        girilen sifreyi sifreKontrolEt method'unda kontrol edip
    //        asagidaki sartlari saglamayan sifrelerde hatalari yazdirin.
    //        method, sifre gecerli ise true, gecersiz ise false dondursun
    //        donen cevabi kontrol edin
    //        kullanicidan yeni sifre girmesi isteyin
    //        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
    //        gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
    //      sartlar :
    //          - sifrenin ilk karakteri kucuk harf olmali
    //          - sifrenin son karakteri sayi olmali

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sonuc = false;
        String girilenSifre=null;

        // while loop method'dan gelen sonuc false oldugu muddetce devam edecek




        while (sonuc == false){




        //  sonuc == false
        // 'sonuc == false' can be simplified to '!sonuc'
            System.out.println("Lutfen sifrenizi giriniz");
            girilenSifre = scanner.nextLine();
            sonuc = sifreKontrolEt(girilenSifre); // method'a sifreyi yollayip,
                                                  // donen sonucu kaydettik
        }

        System.out.println("Sifreniz basarili olarak kaydedildi");

    }

    public static boolean sifreKontrolEt(String sifre){

        int sayac = 0 ;

        //          - sifrenin ilk karakteri kucuk harf olmali
        char ilkKarakter = sifre.charAt(0);
        if (!(ilkKarakter>='a' && ilkKarakter<='z')){
            System.out.println("Ilk karakter kucuk harf olmali");
            sayac++;
        }

        //          - sifrenin son karakteri sayi olmali

        char sonKarakter= sifre.charAt(sifre.length()-1);

        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("son karakter sayi olmali");
            sayac++;
        }
        //        method, sifre gecerli ise true, gecersiz ise false dondursun
        if (sayac == 0){
            return true;
        }else{
            return false;
        }


    }
}
