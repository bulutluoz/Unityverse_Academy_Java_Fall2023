package day04_stringManipulations_forLoop;

public class C15_NestedForLoops {

    public static void main(String[] args) {

        /*
            Asagidaki sekli cizdirin
            5 satir, her satirda 8 *

            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
         */

        for (int i = 1; i <=5 ; i++) { //disardaki loop satiri kontrol eder
            for (int j = 1; j <=8 ; j++) { // icerdeki loop sutunlari kontrol eder

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
