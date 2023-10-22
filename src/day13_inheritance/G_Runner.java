package day13_inheritance;

public class G_Runner {

    public static void main(String[] args) {

        /*
            Eger ozellik method olarak olusturulursa

            java hangi method'un calisacagini bulmak icin
            aramaya data turunun oldugu class'dan baslar

            ANCAK buldugu ilk method'u kullanmaz
            method'u bulduktan sonra
            o method isminde daha guncel bir
            method var mi diye kontrol eder
            ve constructor'in oldugu class'a kadar
            en guncel bilgiyi bulup onu kullanir

            Yani
            variable'lar objenin data turu olarak secilen class'daki
            tum objelerin ortak ozelliklerini soylerken

            method'lar o ortak ozelligi kabul eder
            ama varsa daha guncelini soyler

         */

        F_AvciKuslar kartal4 = new F_AvciKuslar();
        kartal4.omur(); // D Yasar ve olurler
        kartal4.solunum(); // E Akcigerle nefes alirlar
        kartal4.cogalma(); // E Yumurtayla cogalirlar
        kartal4.kanat(); // E Kanatlidirlar
        kartal4.hareket(); // F Ucarlar
        kartal4.beslenme(); // F Et yerler
        kartal4.gaga(); // F Sivri gagalidir
        kartal4.pence(); // F Pencelidir

        E_Kuslar kartal5 = new F_AvciKuslar();
        kartal5.omur(); // D Yasar ve olurler
        kartal5.solunum(); // E Akcigerle nefes alirlar
        kartal5.cogalma(); // E Yumurtayla cogalirlar
        kartal5.kanat(); // E Kanatlidirlar
        kartal5.hareket(); // F Ucarlar
        kartal5.beslenme(); // F Et yerler
        kartal5.gaga(); // F Sivri gagalidir
        //kartal5.pence(); // F Pencelidir

        D_Hayvanlar kartal6 = new F_AvciKuslar();
        kartal6.omur(); // D Yasar ve olurler
        kartal6.solunum(); // E Akcigerle nefes alirlar
        kartal6.cogalma(); // E Yumurtayla cogalirlar
        // kartal6.kanat(); // CTE
        kartal6.hareket(); // F Ucarlar
        kartal6.beslenme(); // F Et yerler
        // kartal6.gaga(); // CTE
        // kartal6.pence(); // CTE

    }
}
