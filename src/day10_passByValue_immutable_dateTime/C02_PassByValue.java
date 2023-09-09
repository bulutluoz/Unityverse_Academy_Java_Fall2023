package day10_passByValue_immutable_dateTime;

public class C02_PassByValue {
    public static void main(String[] args) {
        // class'da %10, %20 ve %50 indirim yapip, indirimli fiyati yazdiran
        // 3 tane method olusturalim
        // main method'dan verilen fiyattaki urunu
        // indirimli olarak yazdirtin

        double fiyat = 200;

        // satici musteriye %10 indirimli satti
        indirim10(fiyat); // %10 indirimli fiyat : 180.0

        // baska bir musteriye %20 ile ayni urunu satti
        indirim20(fiyat); // %20 indirimli fiyat : 160.0

        // baska bir musteriye %50 ile ayni urunu satti
        indirim50(fiyat); // %50 indirimli fiyat : 100.0

        System.out.println("indirimlerden sonra urun fiyati : "+fiyat); //

    }

    public static void indirim10(double fiyat){
        fiyat = 90 * fiyat / 100;

        System.out.println("%10 indirimli fiyat : " + fiyat);
    }

    public static void indirim20(double fiyat){
        fiyat = 80 * fiyat / 100;
        System.out.println("%20 indirimli fiyat : " + fiyat);
    }

    public static void indirim50(double fiyat){
        fiyat = 50 * fiyat / 100;
        System.out.println("%50 indirimli fiyat : " + fiyat);
    }
}
