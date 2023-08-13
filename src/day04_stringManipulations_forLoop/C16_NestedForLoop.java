package day04_stringManipulations_forLoop;

import java.util.Scanner;

public class C16_NestedForLoop {

    public static void main(String[] args) {

        /*
            Kullanicidan satirdaki * sayisini
            ve kac satir olacagini alip
            Asagidaki sekli cizdirin


            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
            * * * * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satirSayisi = scanner.nextInt();

        System.out.println("Lutfen satirdaki * sayisini girin");
        int sutunSayisi= scanner.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) { // satir

            for (int j = 1; j <=sutunSayisi ; j++) { // sutun, yildiz sayisi

                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
