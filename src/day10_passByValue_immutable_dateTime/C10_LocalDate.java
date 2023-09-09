package day10_passByValue_immutable_dateTime;

import java.time.LocalDate;

public class C10_LocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println(date); // 2023-09-09

        System.out.println(date.lengthOfMonth()); // 30
        System.out.println(date.lengthOfYear()); // 365

        System.out.println(date.plusWeeks(13)); // 2023-12-09

        System.out.println(date.minusDays(200)); // 2023-02-21

        System.out.println(date.isLeapYear()); // false
        LocalDate istenenTarih = LocalDate.of(2000,11,13);
        System.out.println("2000 yili artik yil mi : " + istenenTarih.isLeapYear()); // true

        System.out.println(date.isBefore(istenenTarih)); // false




    }
}
