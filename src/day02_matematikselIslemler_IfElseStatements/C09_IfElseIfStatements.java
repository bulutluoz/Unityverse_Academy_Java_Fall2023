package day02_matematikselIslemler_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        //         kullaniciya musteri karti olup olmadigini sorun.
        //         Musteri karti varsa 10 urunden fazla alirsa %20,
        //         az urun aldiysa %15 indirim yapin,
        //         Musteri karti yoksa 10 urunden fazla alirsa %15,
        //         az urun aldiysa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int adet = scanner.nextInt();

        System.out.println("Lutfen urunun liste fiyatini giriniz");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi ? \nE : Evet , H : Hayir");
        char kartVarMi = scanner.next().charAt(0);

        if (adet <= 0 || !(kartVarMi == 'E' || kartVarMi=='H') || listeFiyati<=0){
            System.out.println("Girilen bilgilerde hata var,\nKontrol edip yeniden giris yapiniz");
        } else if (kartVarMi == 'E' && adet >10){

            System.out.println("%20 indirimli toplam fiyat : " + adet*listeFiyati*80 /100);
        } else if (kartVarMi == 'E' && adet<=10 ) {
            System.out.println("%15 indirimli toplam fiyat : " + adet*listeFiyati*85 /100);

        } else if (kartVarMi == 'H' && adet>10) {
            System.out.println("%15 indirimli toplam fiyat : " + adet*listeFiyati*85 /100);

        } else if (kartVarMi == 'H' && adet<=10) {
            System.out.println("%10 indirimli toplam fiyat : " + adet*listeFiyati*90 /100);

        }

    }
}
