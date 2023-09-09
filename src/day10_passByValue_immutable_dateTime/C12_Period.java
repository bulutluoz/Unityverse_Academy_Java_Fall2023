package day10_passByValue_immutable_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C12_Period {
    public static void main(String[] args) {

        LocalDate dogumtarihi = LocalDate.of(2001,5,23);
        LocalDate bugun = LocalDate.now();

        Period yas = Period.between(dogumtarihi,bugun);

        System.out.println(yas); // P22Y3M17D

        System.out.println(yas.getYears()); // 22
    }
}
