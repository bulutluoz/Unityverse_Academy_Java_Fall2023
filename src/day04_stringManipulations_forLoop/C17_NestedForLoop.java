package day04_stringManipulations_forLoop;

public class C17_NestedForLoop {

    public static void main(String[] args) {
        /*
         *              1. satir yildiz sayisi 1
         * *            2. satir yildiz sayisi 2
         * * *          3. satir yildiz sayisi 3
         * * * *        4. satir yildiz sayisi 4
         * * * * *      5. satir yildiz sayisi 5
         */

        int satirSayisi = 8;

        for (int i = 1; i <=satirSayisi ; i++) {

            for (int j = 1; j <= i  ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
