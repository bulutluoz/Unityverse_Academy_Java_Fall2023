package day04_stringManipulations_forLoop;

public class C14_NestedForLoop {

    public static void main(String[] args) {

        // 1'den 4'e kadar olan sayilari yanyana yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print(1 * i + " ");
        }


        // alt satira 2 4 6 8 yazdirin
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {

            System.out.print(2 * i + " ");
        }


        // alt satira 3 6 9 12 yazdirin
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {

            System.out.print(3 * i + " ");
        }

        // alt satira 4 8 12 16 yazdirin
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {

            System.out.print(4 * i + " ");
        }
        System.out.println("");


        /*
            Java'da diktorgen veya ucgen biciminde sekil olusturmak icin
            nested for loop kullanilir
         */

        for (int i = 1; i <=4 ; i++) { // kac satir oldugunu takip eder




            for (int j = 1; j <=4 ; j++) { // icerdeki loop ise sutunlari kontrol eder

                System.out.print(i * j + " ");
            }




            System.out.println("");
        }

    }
}
