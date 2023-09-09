package day10_passByValue_immutable_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C09_LocalTime {
    public static void main(String[] args) {
        /*
            LocalTime time = LocalTime.now();
            kodu, bu satir calistiginda bilgisayarin zamanini kaydeder.
            canli bir saat degildir, sadece o satir calistigi andaki zamani kaydeden bir variable'dir
         */

        LocalTime time = LocalTime.now();
        System.out.println(time); // 11:01:11.723038

        int toplam =0 ;

        for (int i = 0; i <1000000 ; i++) {
            toplam += i;
        }

        time = LocalTime.now();
        System.out.println(time);

        // Baska bir saat dilimindeki saati kaydetmek istersem

        time = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(time);

        time = LocalTime.now();

        System.out.println(time.getMinute());

        // saat : dakika formatinda zamani yazdiralim

        System.out.println(time.getHour() + ":" + time.getMinute()); // 11:16

        // with() method'lari eldeki saatin istedigimiz bir bolumunu degistirerek kullanir

        System.out.println(time.withHour(13)); // 13:17:30.390358
        System.out.println(time.withSecond(0).withNano(0)); // 11:18

        // plus() ve minus() eldeki zamana istenen kadar sureyi ekler veya cikarir

        System.out.println(time.plusMinutes(200).minusSeconds(15));
        // 14:39:22.707586

        LocalTime time2 = LocalTime.of(11,11);

        // karsilastirma icin

        System.out.println(time.isAfter(time2)); // true
        System.out.println(time.isBefore(time2)); // false

        System.out.println(time.toSecondOfDay()); // 40967

        System.out.println(time.toNanoOfDay());

        // bir islemin kac nanosaniye surdugunu bulmak icin

        long baslangic= LocalTime.now().toNanoOfDay();

        for (int i = 0; i <100000 ; i++) {
            toplam += i;
        }

        long bitis = LocalTime.now().toNanoOfDay();

        System.out.println("islem suresi : " + (bitis - baslangic));


    }
}
