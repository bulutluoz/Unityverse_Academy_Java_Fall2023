package day10_passByValue_immutable_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C11_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2023-09-09  T   11:36:10.361125

        // Kullaniciya yil, yilin kacinci gunu ve gunun saatini yazdirin

        System.out.println(ldt.getYear()+" yilinin "+ ldt.getDayOfYear()+". gununun "+
                            ldt.getHour()+". saati");

        // 12 Eylul 2015

        // Zaman ve tarihi istedigimiz formatta ayarlamak icin
        // Java'dan DataTimeFormatter class'ini kullaniriz

        /*
		 format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 a yazarsak AM veya PM degerini yazar

		 */

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println(ldt.format(dtf)); // 09 September 2023


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMMM yyyy EEEE");

        System.out.println(ldt.format(dtf2)); // 09 September 2023 Saturday

        // Saati 11:51 AM
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(ldt.format(dtf3)); // 11:52 AM

    }
}
