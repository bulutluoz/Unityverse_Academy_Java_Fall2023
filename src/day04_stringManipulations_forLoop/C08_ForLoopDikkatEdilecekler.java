package day04_stringManipulations_forLoop;

public class C08_ForLoopDikkatEdilecekler {

    public static void main(String[] args) {

        // for loop ilk calistiginda (ilk dongu) artirma/azaltma islemi yapilmaz
        // ikinci donguden itibaren devreye girer
        for (int i = 0; i <10 ; i++) {

            System.out.print(i + " ");
        }

        // ilk deger icin sart false oluyorsa
        // for loop calisir ama loop body'si hic devreye giremeyecegi icin
        // loop body'sindeki yapilanlari GOREMEYIZ

        for (int i = 20; i <15 ; i++) {
            System.out.print(i + " ");
        }


        // artis azalis devam ederken
        // hic bir zaman sart false olmuyorsa
        // SONSUZ LOOP olusur

        for (int i = 0; i < 10 ; i--) {

            System.out.print(i + " ");
        }
    }
}
